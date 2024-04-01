package org.fy.pangu.properties;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "pangu")
@Component
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class PanGuProperties {

    private String installationPath;

    private String rootPath;

    @Override
    public String toString() {
        return "PanGuProperties{" +
                "installationPath='" + installationPath + '\'' +
                ", rootPath='" + rootPath + '\'' +
                '}';
    }
}
