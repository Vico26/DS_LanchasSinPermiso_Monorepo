package com.example.service;

import com.example.model.Tour;
import com.example.repository.TourRepository;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class TourService {

    private final TourRepository repository;

    public TourService(TourRepository repository) {
        this.repository = repository;
    }

    public Tour crearTour(Tour tour) {
        return repository.save(tour);
    }

    public List<Tour> listarTours() {
        return (List<Tour>) repository.findAll();
    }
}