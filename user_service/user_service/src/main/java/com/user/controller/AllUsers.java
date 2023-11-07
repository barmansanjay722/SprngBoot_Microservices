package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class AllUsers {

    @GetMapping("/allusers")
    public List<String> users() {
        List<String> userData = new ArrayList<>();
        userData.add("Sanjay");
        userData.add("Ritu");
        userData.add("Monika");
        userData.add("Shivani");

        return userData;
    }
}
