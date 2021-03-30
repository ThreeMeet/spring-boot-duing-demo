package com.duing.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(password);

//        9mB3Yi5ad7WjcneqjPd16Q==
//        2DZkT5tfg6SUMacXVA5ZSw==

//        OsSIb8bWSuEG0DqM+SCKZQ==
//        /MDsiISDWBj9NraIWzEoFQ==

    }
}
