package com.navi8.Day1SEcurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	
	
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome to Naveen world..!!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Good Morning..!!";
    }
}