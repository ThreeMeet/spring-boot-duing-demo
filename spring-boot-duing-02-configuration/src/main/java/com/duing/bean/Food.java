package com.duing.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class Food implements Serializable {

    private static final long serialVersionUID = 1L;

    private String rice;
    private String meat;
    private String[] sauce;

}
