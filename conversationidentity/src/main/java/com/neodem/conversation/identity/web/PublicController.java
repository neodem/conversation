package com.neodem.conversation.identity.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Vincent Fumo (neodem@gmail.com)
 * Created on 9/11/17
 */
@Controller
public class PublicController {

    // public facing

    @RequestMapping(value = "new", method = RequestMethod.POST)
    public String newUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        // ultimately we should do a lot of stuff here, like validate the users email address, etc.

        // return a token (good for 24h or until logged out)
        return "newUser";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        return "newUser";
    }

    @RequestMapping(value = "logout", method = RequestMethod.POST)
    public String logout(@RequestParam("username") String username, @RequestParam("password") String password) {
        return "newUser";
    }


}
