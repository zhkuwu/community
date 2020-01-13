package com.crow.coummunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*默认访问为主页*/
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
