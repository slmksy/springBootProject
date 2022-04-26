package com.example.service;

import com.example.entity.Station;
import com.example.repo.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MockStationGenerateService {
    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private StationIdGenerationService stationIdGenerationService;

    public void generateAccounts() {
        Station station=  new Station(stationIdGenerationService.newStationId(),"Istasyon 1");

        stationRepository.save(station);

        Station station2=  new Station(stationIdGenerationService.newStationId(),"Istasyon 2");

        stationRepository.save(station2);
    }
}
