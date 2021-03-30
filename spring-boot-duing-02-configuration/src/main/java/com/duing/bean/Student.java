package com.duing.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;
    private String sex;
    private Integer weight;


}
