package com.yong.subdomain.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.yong.subdomain")
@EnableJpaRepositories(basePackages = "com.yong.subdomain")
@Configuration
public class JpaConfiguration {
}
