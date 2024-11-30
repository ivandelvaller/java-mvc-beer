package com.ivandelvaller.mvcbeer.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivandelvaller.mvcbeer.models.Beer;
import com.ivandelvaller.mvcbeer.services.BeerService;

import io.micrometer.common.lang.Nullable;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/beers")
public class BeerController {
    private final BeerService beerService;

    @GetMapping("/all")
    public List<Beer> getAll() {
        return beerService.getAll();
    }

    @GetMapping("/{beerId}")
    public Beer getById(@PathVariable UUID beerId) {
        return beerService.getById(beerId);
    }

    @PostMapping("")
    public ResponseEntity<UUID> create(@RequestBody Beer beer) {
        var uuid = beerService.save(beer);

        var headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beers/" + uuid.toString());

        return new ResponseEntity<>(uuid, headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Nullable> update(
            @PathVariable UUID beerId,
            @RequestBody Beer beer) {
        beerService.update(beerId, beer);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity<Nullable> delete(@PathVariable UUID beerId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}