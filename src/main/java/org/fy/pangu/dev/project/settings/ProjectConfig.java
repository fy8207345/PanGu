package org.fy.pangu.dev.project.settings;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 小程序项目配置
 * https://developers.weixin.qq.com/miniprogram/dev/devtools/projectconfig.html
 */
@Getter
@Setter
@NoArgsConstructor
public class ProjectConfig {

    /**
     * 指定小程序源码的目录(需为相对路径)
     */
    private String miniprogramRoot;
    /**
     * 指定腾讯云项目的目录(需为相对路径)
     */
    private String qcloudRoot;
    /**
     * 指定插件项目的目录(需为相对路径)
     */
    private String pluginRoot;
    /**
     * 云开发代码根目录(需为相对路径)
     */
    private String cloudbaseRoot;
    /**
     * 云函数代码根目录(需为相对路径)
     */
    private String cloudfunctionRoot;
    /**
     * 云函数本地调试请求模板的根目录(需为相对路径)
     */
    private String cloudfunctionTemplateRoot;
    /**
     * 云托管代码根目录(需为相对路径)
     */
    private String cloudcontainerRoot;
    /**
     * 编译类型
     */
    private CompilerType compileType;
    /**
     * 项目设置
     */
    private ProjectSettings setting;
    /**
     * 基础库版本
     */
    private String libVersion;
    /**
     * 项目的 appid
     */
    private String appid;
    /**
     * 项目名字
     */
    private String projectname;
    /**
     * 打包配置选项
     */
    private String packOptions;
    /**
     * 调试配置选项
     */
    private String debugOptions;
    /**
     * 文件监听配置设置
     */
    private String watchOptions;
    /**
     * 自定义预处理
     */
    private String scripts;
    /**
     * 仅在小游戏项目中有效
     */
    private String staticServerOptions;
    /**
     * 指定自动生成的文件的 tabIndent 和 tabSize
     */
    private String editorSetting;
    /**
     * 骨架屏相关设置
     */
    private String skeletonConfig;
}
