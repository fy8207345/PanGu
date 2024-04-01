package org.fy.pangu.dev.config;

import org.fy.pangu.dev.tools.MpDevToolsHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MPConfig {

    @Bean
    public MpDevToolsHelper mpDevToolsHelper(){
        return new MpDevToolsHelper();
    }
}
