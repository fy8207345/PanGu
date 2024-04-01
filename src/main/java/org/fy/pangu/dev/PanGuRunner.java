package org.fy.pangu.dev;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.fy.pangu.dev.tools.DevToolsVersion;
import org.fy.pangu.dev.tools.MpDevToolsHelper;
import org.fy.pangu.properties.PanGuProperties;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PanGuRunner implements InitializingBean {

    @Resource
    private MpDevToolsHelper mpDevToolsHelper;
    @Resource
    private PanGuProperties panGuProperties;

    @Override
    public void afterPropertiesSet() throws Exception {
        DevToolsVersion devToolsVersion = mpDevToolsHelper.loadDevToolsVersion(panGuProperties.getInstallationPath());
        log.info("Dev tools version: {}", devToolsVersion);
        log.info("panGuProperties: {}", panGuProperties);
        String md5 = mpDevToolsHelper.getMD5(panGuProperties.getInstallationPath(), devToolsVersion.getLatestNw());
        log.info("md5: {}", md5);
        String path = mpDevToolsHelper.path(md5);
        System.out.println("port path:" + path);
        int port = mpDevToolsHelper.readPortFromPath(path);


        mpDevToolsHelper.startDevTools("D:\\projects\\huaxujiu\\yshopb2c-uniapp\\unpackage\\dist\\dev\\mp-weixin");
    }
}
