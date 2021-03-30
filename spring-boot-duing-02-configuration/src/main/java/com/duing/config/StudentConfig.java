package com.duing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;

/**
 * @Configuraion
 * 证明该类是一个配置类 在spring中可以替代xml文件
 * @ConfiurationProperties
 * 证明该类是一个配置文件类 并且声明前缀
 * @PropertySource
 */
@Configuration
@ConfigurationProperties(prefix = "student")
@PropertySource("classpath:application.yml")
@Data
public class StudentConfig implements Serializable {

    private static final long serialVersionUID = 1l;

    private String name;
    private Integer age;
    private String sex;
    private Integer weight;

}
