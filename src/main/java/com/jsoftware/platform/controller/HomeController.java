package com.jsoftware.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String findUid(HttpSession session) {
        return session.getId();
    }
}
