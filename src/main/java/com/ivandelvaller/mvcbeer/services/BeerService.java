package com.ivandelvaller.mvcbeer.services;

import java.util.List;
import java.util.UUID;

import com.ivandelvaller.mvcbeer.models.Beer;

public interface BeerService {
    List<Beer> getAll();

    Beer getById(UUID id);
}
