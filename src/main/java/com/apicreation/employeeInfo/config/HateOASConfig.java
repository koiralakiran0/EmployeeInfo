package com.apicreation.employeeInfo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.mediatype.hal.HalConfiguration;
import org.springframework.hateoas.mediatype.hal.HalConfiguration.RenderSingleLinks;

@Configuration
public class HateOASConfig {
    @Bean
    public HalConfiguration globalPolicy(){
        return new HalConfiguration().withRenderSingleLinks(RenderSingleLinks.AS_SINGLE);
    }
}