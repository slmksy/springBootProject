package com.example.controller;

import com.example.entity.Station;
import com.example.repo.StationRepository;
import com.example.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/station")
public class StationController {
    private final StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping("/{stationId}")
    public ResponseEntity<Station> getAccountById(@PathVariable(value = "accountId") Long stationId) {
        Optional<Station> stationOpt = stationService.getStationById(stationId);
        return stationOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/list")
    public List<Station> getStations() {
        return stationService.getStations();
    }

}
