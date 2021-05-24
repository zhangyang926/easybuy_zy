package com.zy.controller;

import com.zy.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(name = "orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

}
