package com.yuchiu.config.controller;

import com.yuchiu.config.domain.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @RequestMapping("/")
    public String welcome(){
        return "Hello World Spring Config";
    }

    @RequestMapping(value = "/hello/{reqName}",  method = RequestMethod.GET)
    public Message showMessage(@PathVariable String reqName){
        Message msg = new Message(reqName, "Hello "+ reqName);
        return msg;
    }

    @RequestMapping(value = "hello/{reqName}" , method = RequestMethod.POST)
    public Message createMessage(@PathVariable String reqName){
        Message msg = new Message(reqName, "Hello POST"+ reqName);
        //Insert msg to DB
        return msg;
    }
}
