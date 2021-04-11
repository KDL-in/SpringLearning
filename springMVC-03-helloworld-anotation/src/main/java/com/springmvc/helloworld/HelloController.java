package com.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    @RequestMapping(value = "/getPost", method = RequestMethod.POST)
    public String hello(Model model) {
        model.addAttribute("msg", "method post only");
        return "hello";
    }
    @RequestMapping(value = "/params", params = {"user=123","!pwd"})
    public String testParams(Model model) {
        model.addAttribute("msg", "test Params");
        return "hello";
    }
}
