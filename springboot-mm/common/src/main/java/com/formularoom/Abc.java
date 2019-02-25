package com.formularoom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/cc")
public class Abc {

    @RequestMapping(value = "/cc", method = RequestMethod.GET)
    @ResponseBody
    public String test1() {
        return "cc spring boot multiple modules test";
    }
}
