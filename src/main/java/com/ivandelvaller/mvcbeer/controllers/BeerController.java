package com.ivandelvaller.mvcbeer.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivandelvaller.mvcbeer.models.Beer;
import com.ivandelvaller.mvcbeer.services.BeerService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
public class BeerController {
    private final BeerService beerService;

    @GetMapping("/api/v1/beers/all")
    public String getMethodName() {
        return new String();
    }

    public List<Beer> getAll() {
        return beerService.getAll();
    }

}
