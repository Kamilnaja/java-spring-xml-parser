package com.strefatekstu.www.controllers;

import com.strefatekstu.www.service.XmlParseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {

    @Autowired
    XmlParseService xmlParseService;

    @ResponseBody
    @RequestMapping("/first")
    public String getFirst(){
        return xmlParseService.getData();
    }
}
