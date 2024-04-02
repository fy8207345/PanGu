package org.fy.pangu.dev.project.settings;

import java.util.List;

public class ProjectSettings {
    /**
     * 启用条件编译
     */
    private boolean condition;
    /**
     * 是否启用 es6 转 es5
     */
    private boolean es6;
    /**
     * 是否打开增强编译
     */
    private boolean enhance;
    /**
     * 上传代码时样式是否自动补全
     */
    private boolean postcss;
    /**
     * 上传代码时是否自动压缩脚本文件
     */
    private boolean minified;
    /**
     * 上传代码时是否自动压缩样式文件
     */
    private boolean minifyWXSS;
    /**
     * 上传代码时是否自动压缩 WXML 文件
     */
    private boolean minifyWXML;
    /**
     * 上传时进行代码保护
     */
    private boolean uglifyFileName;
    /**
     * 上传时是否过滤无依赖文件
     */
    private boolean ignoreUploadUnusedFiles;
    /**
     * 是否自动运行体验评分
     */
    private boolean autoAudits;
    /**
     * 是否检查安全域名和 TLS 版本
     */
    private boolean urlCheck;
    /**
     * 是否开启文件保存后自动热重载
     */
    private boolean compileHotReLoad;
    /**
     * 小程序加载时是否数据预拉取
     */
    private boolean preloadBackgroundData;
    /**
     * 是否启用懒注入占位组件调试
     */
    private boolean lazyloadPlaceholderEnable;
    /**
     * 仅在小游戏项目有效，是否开启静态资源服务器
     */
    private boolean useStaticServer;
    /**
     * 预览及真机调试的时主包、分包体积上限调整为4M（小程序）、8M（小游戏）
     */
    private boolean bigPackageSizeSupport;
    /**
     * 是否开启 skyline 渲染调试
     */
    private boolean skylineRenderEnable;

    /**
     * ---------------------------
     * 以下字段是开发者工具的隐式设置
     * ---------------------------
     */

    /**
     * 增强编译下Babel的配置项
     */
    private String babelSetting;
    /**
     * 编译插件配置
     */
    private List<String> useCompilerPlugins;
    /**
     * 将 JS 编译成 ES5 时，是否禁用严格模式
     */
    private boolean disableUseStrict;
    /**
     * 上传时是否带上 sourcemap（默认为true）
     */
    private boolean uploadWithSourceMap;
    /**
     * 在小游戏插件项目中，是否启用 “以本地目录为插件资源来源”[5] 特性
     */
    private boolean localPlugins;
    /**
     * 是否手动配置构建 npm 的路径
     */
    private boolean packNpmManually;
    /**
     * 仅 packNpmManually 为 true 时生效，详细参考构建 npm 文档
     * <a href="https://developers.weixin.qq.com/miniprogram/dev/devtools/npm.html">...</a>
     */
    private List<String> packNpmRelationList;
    /**
     * 是否使用工具渲染 CoverView
     */
    private boolean coverView;
    /**
     * 预览、真机调试和本地模拟器等开发阶段是否过滤无依赖文件（默认为true）
     */
    private boolean ignoreDevUnusedFiles;
    /**
     * 是否展示 JSON 文件校验错误信息
     */
    private boolean checkInvalidKey;
    /**
     * 是否开启调试器 WXML 面板展示 shadow-root
     */
    private boolean showShadowRootInWxmlPanel;
    /**
     * 是否开启小程序独立域调试特性[6]
     */
    private boolean useIsolateContext;
    /**
     * 是否开启模拟器预先载入小程序的某些资源[7]。此设定为 false 时会导致 useIsolateContext 失效
     */
    private boolean useMultiFrameRuntime;
    /**
     * 是否启用 API Hook 功能[8]
     */
    private boolean useApiHook;
    /**
     * 	是否在额外的进程处理一些小程序 API[9]
     */
    private boolean useApiHostProcess;
    /**
     * 	仅在小游戏有效，是否开启局域网调试服务器
     */
    private boolean useLanDebug;
    /**
     * 	是否在游戏引擎项目中开启支持引用 node 原生模块的底层加速特性
     */
    private boolean enableEngineNative;
    /**
     * 是否在本地设置中展示传统的 ES6 转 ES5 开关（对应 es6），增强编译开关 （对应 enhance）
     */
    private boolean showES6CompileOption;
}
