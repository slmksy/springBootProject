package com.example.service;

import com.example.entity.Station;
import com.example.repo.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StationService {
    @Autowired
    private StationRepository stationRepository;

    public Optional<Station> getStationById(Long stationId) {
        return  stationRepository.findById(stationId);
    }

    public List<Station> getStations() {
        return stationRepository.findAll();
    }
}
