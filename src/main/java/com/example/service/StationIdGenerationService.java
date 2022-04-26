package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class StationIdGenerationService {
    public Long newStationId() {
        return System.nanoTime();
    }
}
