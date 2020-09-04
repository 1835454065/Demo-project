package com.wll.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebJarsController {     

	@RequestMapping("/show")
	public String index() {
        return "gg";
    } 
	
}