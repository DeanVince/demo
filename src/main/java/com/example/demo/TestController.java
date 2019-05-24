package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangshaohua
 * @Date: 2019-05-24 22:46
 * @Description:
 */
@RestController
public class TestController {
    @RequestMapping("say")
    public String say(String word){
        return "say:" + word;
    }

}
