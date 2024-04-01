package org.fy.pangu.dev.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.fy.pangu.dev.project.settings.ProjectConfig;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.net.URL;

@Slf4j
@Component
public class ProjectGenerator implements InitializingBean {
    private ProjectConfig projectConfig = new ProjectConfig();
    private ProjectConfig projectPrivateConfig = new ProjectConfig();

    private ObjectMapper objectMapper;

    @Override
    public void afterPropertiesSet() throws Exception {
        URL resource = getClass().getResource("/");
        log.info("resource: {}", resource);
    }
}
