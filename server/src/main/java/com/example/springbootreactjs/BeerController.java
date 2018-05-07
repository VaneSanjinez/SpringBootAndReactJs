package com.example.springbootreactjs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class BeerController {
    BeerRepository beerRepository;

    public BeerController(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }
    @GetMapping("/good-beers")
    public Collection<Beer> goodBeers(){
        return beerRepository.findAll().stream().
                filter(this:: isGreat)
                .collect(Collectors.toList());
    }

    private boolean isGreat(Beer beer){
        return !beer.getName().equals("Budweiser") &&
                !beer.getName().equals("Coors Light") &&
                !beer.getName().equals("PBR");

    }
}
