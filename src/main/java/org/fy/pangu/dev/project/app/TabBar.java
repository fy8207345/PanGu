package org.fy.pangu.dev.project.app;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TabBar {

    private String color;
    private String selectedColor;
    private String borderStyle;
    private String backgroundColor;
    private String height;
    private String fontSize;
    private String iconWidth;
    private String spacing;
    private List<TabBarItem> list;

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    public static class TabBarItem{
        private String pagePath;
        private String text;
        private String iconPath;
        private String selectedIconPath;
    }
}
