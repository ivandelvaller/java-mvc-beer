package com.ivandelvaller.mvcbeer.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.ivandelvaller.mvcbeer.models.Beer;
import com.ivandelvaller.mvcbeer.models.BeerStyle;

public class BeerServiceImpl implements BeerService {

    @Override
    public Beer getBeerById(UUID id) {
        return Beer.builder()
                .id(UUID.randomUUID())
                .name("Carta Blanca")
                .style(BeerStyle.PALE_ALE)
                .upc("125346568")
                .price(new BigDecimal("10.99"))
                .quantityOnHand(1)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
    }

}
