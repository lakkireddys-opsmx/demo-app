package com.example.sampleapp.controller;

import com.example.sampleapp.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/")
    public Object greeting(){
        return mainService.getIndex();
    }
    @GetMapping("/delay")
    public Object delay() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return mainService.getIndex();
    }
}
