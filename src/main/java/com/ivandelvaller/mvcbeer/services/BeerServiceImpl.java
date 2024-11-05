package com.ivandelvaller.mvcbeer.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ivandelvaller.mvcbeer.models.Beer;
import com.ivandelvaller.mvcbeer.models.BeerStyle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    private Map<UUID, Beer> beerMap;

    public BeerServiceImpl() {

        // For testing porpouses. This will be removed.
        var beer1 = Beer.builder()
                .id(UUID.randomUUID())
                .name("Carta Blanca")
                .style(BeerStyle.LAGER)
                .upc("125346568")
                .price(new BigDecimal("10.99"))
                .quantityOnHand(1)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

        var beer2 = Beer.builder()
                .id(UUID.randomUUID())
                .name("Indio")
                .style(BeerStyle.PILSNER)
                .upc("2784623")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(1)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

        var beer3 = Beer.builder()
                .id(UUID.randomUUID())
                .name("XX Lager")
                .style(BeerStyle.LAGER)
                .upc("354621")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(1)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

        beerMap.put(beer1.getId(), beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);
    }

    @Override
    public List<Beer> getAll() {
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Beer getById(UUID id) {
        return beerMap.get(id);
    }

}
