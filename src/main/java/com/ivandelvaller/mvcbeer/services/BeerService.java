package com.ivandelvaller.mvcbeer.services;

import java.util.UUID;

import com.ivandelvaller.mvcbeer.models.Beer;

public interface BeerService {
    Beer getBeerById(UUID id);
}
