package com.duing.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig implements Serializable {

    private static final long serialVersionUID = 1L;


    private String rice;
    private String meat;
    private String[] sauce;



}
