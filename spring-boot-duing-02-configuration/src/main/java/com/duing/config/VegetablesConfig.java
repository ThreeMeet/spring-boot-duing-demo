package com.duing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;

/**
 * vegetables.potato=土豆
 * vegetables.eggplant=茄子
 * vegerables.greenpeper=青椒
 *
 * @Confiuration
 * 声明这是一个配置类 在Spring中可以替代xml文件
 * @ConfigurationProperties
 * 声明这是一个配置文件类 并且声明前缀
 * @PropertySource("")
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
public class VegetablesConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private String potato;
    private String eggplant;
    private String greenpeper;

    public VegetablesConfig() {
    }

    public VegetablesConfig(String potato, String eggplant, String greenpeper) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.greenpeper = greenpeper;
    }

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenpeper() {
        return greenpeper;
    }

    public void setGreenpeper(String greenpeper) {
        this.greenpeper = greenpeper;
    }
}
