package com.duing.bean;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter@Setter
public class Vegetables implements Serializable {

    private static final long serialVersionUID = 1L;

    private String potato;
    private String eggplant;
    private String greenpeper;

    public Vegetables() {
    }

    public Vegetables(String potato, String eggplant, String greenpeper) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.greenpeper = greenpeper;
    }

}
