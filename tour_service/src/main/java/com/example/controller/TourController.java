package com.example.controller;

import com.example.model.Tour;
import com.example.service.TourService;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/tours")
public class TourController {

    private final TourService service;

    public TourController(TourService service) {
        this.service = service;
    }

    @Post
    public Tour crear(@Body Tour tour) {
        return service.crearTour(tour);
    }

    @Get
    public List<Tour> listar() {
        return service.listarTours();
    }
}