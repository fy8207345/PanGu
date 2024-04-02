package org.fy.pangu.dev.project.app;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AppJson {

    private List<String> pages;
    private List<String> subPackages;
    private WindowOptions window;
    private TabBar tabBar;
}
