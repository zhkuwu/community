package com.crow.coummunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
    @GetMapping("/hello")
    //@RequestParam 中是接收请求参数
    public String hello(@RequestParam(name = "name")String name, Model model){
        //将接受到的name传入model中
        model.addAttribute("name",name);
        return "Hello";
    }
}
