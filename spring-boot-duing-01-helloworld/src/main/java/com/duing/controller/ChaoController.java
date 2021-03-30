package com.duing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChaoController {

    @RequestMapping("/chao")
    @ResponseBody
    public String hello(){
        return "超超,叫爸爸";
    }


}
