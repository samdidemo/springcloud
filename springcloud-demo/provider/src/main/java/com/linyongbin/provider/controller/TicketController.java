package com.linyongbin.provider.controller;

import com.linyongbin.provider.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;
    @GetMapping("get/ticket")
    public String getTicket(){
        return  "使用8001"+ticketService.getTicket();
    }
}
