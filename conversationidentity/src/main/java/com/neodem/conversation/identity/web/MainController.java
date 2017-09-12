package com.neodem.conversation.identity.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Vincent Fumo (neodem@gmail.com)
 * Created on 9/11/17
 */
@Controller
@EnableAutoConfiguration
public class MainController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
