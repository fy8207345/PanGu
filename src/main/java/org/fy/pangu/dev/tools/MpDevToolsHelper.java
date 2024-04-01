package org.fy.pangu.dev.tools;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.util.FileUtil;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.util.encoders.Hex;
import org.fy.pangu.properties.PanGuProperties;
import org.fy.pangu.utils.OSUtils;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.List;

@Slf4j
@Component
public class MpDevToolsHelper {


    private static final String VERSION_FILE_NAME = "version";

    @Resource
    private ObjectMapper objectMapper;
    @Resource
    private PanGuProperties panGuProperties;

    /**
     * 打开微信开发工具
     */
    public boolean startDevTools(String absoluteProjectPath){
        ProcessBuilder processBuilder = new ProcessBuilder();
        List<String> command = List.of(getCliFullPath(), "open", "--project", absoluteProjectPath);
        Process process = null;
        try {
            process = processBuilder.redirectErrorStream(true)
                    .directory(new File(panGuProperties.getInstallationPath()))
                    .redirectOutput(ProcessBuilder.Redirect.PIPE)
                    .command(command)
                    .start();
        }catch (IOException e){
            throw new RuntimeException("Start IDE Failed: ", e);
        }
        try (BufferedReader bufferedReader = process.inputReader()){
            String line = null;
            try {
                while ((line = bufferedReader.readLine()) != null){
                    log.info(line);
                }
            }catch (IOException e){
                throw new RuntimeException("等待IDE启动失败：", e);
            }
            log.info("started: {}", process.info());
            return true;
        }catch (IOException e){
            throw new RuntimeException("等待IDE启动失败：", e);
        }
    }

    private String getCliFullPath(){
        String installationPath = panGuProperties.getInstallationPath();
        if(!installationPath.endsWith("/")){
            installationPath += File.separator;
        }
        //window os
        if(OSUtils.isWindows()){
            return installationPath + "cli.bat";
        }
        // MAC OS
        return installationPath + "cli";
    }

    public DevToolsVersion loadDevToolsVersion(String installationPath){
        log.info("panGuProperties: {}", panGuProperties);
        File file = new File(installationPath, VERSION_FILE_NAME);
        if(!file.exists() || file.isDirectory()){
            throw new RuntimeException("微信开发者工具安装位置不正确");
        }
        try {
            String content = FileUtil.readAsString(file);
            return  objectMapper.readValue(content, DevToolsVersion.class);
        }catch (Exception e){
            throw new RuntimeException("读取微信开发者工具配置失败", e);
        }
    }

    public String getMD5(String installationPath, String latestNw){
        byte[] bytes = (installationPath + latestNw).getBytes();
        MD5Digest md5Digest = new MD5Digest();
        md5Digest.update(bytes, 0, bytes.length);
        byte[] digested = new byte[md5Digest.getDigestSize()];
        md5Digest.doFinal(digested, 0);
        return new String(Hex.encode(digested));
    }

    /**
     * Port file path
     * @param md5 开发工具的md5值
     * @return version文件的绝对路径
     */
    public String path(String md5){
        String home = System.getProperty("user.home");
        return home +
                File.separator +
                "AppData" +
                File.separator +
                "Local" +
                File.separator +
                "微信开发者工具" +
                File.separator +
                "User Data" +
                File.separator +
                md5 +
                File.separator +
                "Default" +
                File.separator +
                ".ide";
    }

    public int readPortFromPath(String path){
        try {
            String content = getFileContent(path);
            return Integer.parseInt(content);
        }catch ( Exception e){
            throw new RuntimeException("读取【port】文件失败：" + path);
        }
    }

    public String getFileContent(String path) throws IOException {
        return FileUtil.readAsString(new File(path));
    }
}
