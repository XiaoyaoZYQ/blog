package com.zyq.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.zyq.blog.repository")
@EnableElasticsearchRepositories(basePackages = "com.zyq.blog.repository.es")
public class ElasticSearchConfiguration {
}