package org.fy.pangu.dev.project.settings;

import lombok.*;

/**
 * 在微信开发者工具里开启一个本地静态资源服务器，用于托管项目静态资源
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StaticServerOptions {

    /**
     * 参数是 servePath，可以指向项目路径下的某个目录作为静态资源路径。
     * 之后就可以通过工具提供的本地ip:端口port/ 来访问具体的静态资源。
     * 通常可以用于上线发布前预览测试静态资源加载效果。
     */
    private String servePath;
}
