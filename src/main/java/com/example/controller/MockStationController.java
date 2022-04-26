package com.example.controller;

import com.example.service.MockStationGenerateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mockstation")
public class MockStationController {
    private final MockStationGenerateService dummyStationGenerateService;

    public MockStationController(MockStationGenerateService dummyStationGenerateService) {
        this.dummyStationGenerateService = dummyStationGenerateService;
    }

    @GetMapping("/generatedummystations")
    public void generateDummyAccounts() {
        dummyStationGenerateService.generateAccounts();
    }

}
