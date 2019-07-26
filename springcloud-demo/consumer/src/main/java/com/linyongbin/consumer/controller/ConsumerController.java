package com.linyongbin.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/cloud/get/ticket")
    @ResponseBody
    public String buyTicket(){
        String s=restTemplate.getForObject("http://PROVIDER/get/ticket",String.class);

        return "成功购买"+s;
    }
}
