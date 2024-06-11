package com.generalnitin.springdockercompose.controllers;

import com.generalnitin.springdockercompose.service.HomeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/data")
    public List<Object> getData() {
        return homeService.getAllData();
    }
}
