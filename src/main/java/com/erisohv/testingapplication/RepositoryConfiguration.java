package com.erisohv.testingapplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.erisohv.testingapplication.domain.Application;
import com.erisohv.testingapplication.domain.Metric;
import com.erisohv.testingapplication.domain.TestCycle;
import com.erisohv.testingapplication.domain.Version;

@Configuration
class RepositoryConfiguration {

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {

        return new RepositoryRestConfigurerAdapter() {
            @Override
            public void configureRepositoryRestConfiguration(
                                 RepositoryRestConfiguration config) {
                config.exposeIdsFor(Application.class, Version.class, Metric.class, TestCycle.class);
            }
        };

    }

}