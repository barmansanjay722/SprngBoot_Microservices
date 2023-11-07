package com.contact.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("contact")
public class AllContacts {

    @GetMapping("/contacts")
    public List<String> contacts() {
        List<String> userData = new ArrayList<>();
        userData.add("99824820");
        userData.add("9945612");
        userData.add("32598425");
        userData.add("565874111");

        return userData;
    }
}
