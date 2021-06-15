package com.jsoftware.platform.database.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.*;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.time.Duration;

@Configuration
@EnableAsync
public class RedisConfig {

    private String host = "localhost";

    private int port = 6379;

    private String password = "password";
    @Bean
    @Primary
    public ReactiveRedisConnectionFactory reactiveRedisConnectionFactory(RedisConfiguration defaultRedisConfig) {
        LettuceClientConfiguration clientConfig = LettucePoolingClientConfiguration.builder()
                .commandTimeout(Duration.ofMillis(60000)).build();
        return new LettuceConnectionFactory(defaultRedisConfig, clientConfig);
    }

    @Bean
    public RedisConfiguration defaultRedisConfig() {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
        String redisPort = String.valueOf(port);
        String redisPassword = password;
        config.setHostName(host);
        config.setPassword(RedisPassword.of(redisPassword));
        config.setPort(Integer.parseInt(redisPort));
        config.setDatabase(2);
        return config;
    }

    private RedisNode populateNode(String host, Integer port) {
        return new RedisNode(host, port);
    }
}