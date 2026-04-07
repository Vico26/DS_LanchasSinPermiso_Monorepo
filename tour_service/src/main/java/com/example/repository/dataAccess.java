package com.example.repository;

import com.example.model.Tour;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface TourRepository extends CrudRepository<Tour, Long> {
}