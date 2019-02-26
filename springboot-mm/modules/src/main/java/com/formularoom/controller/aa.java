package com.formularoom.controller;

import com.formularoom.mata_annotation.Apple;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/dd")
public class aa {

    @RequestMapping(value = "/aa", method = RequestMethod.GET)
    @ResponseBody
    public String test1() {
        Apple apple = new Apple();
        return apple.toString();
    }
}
