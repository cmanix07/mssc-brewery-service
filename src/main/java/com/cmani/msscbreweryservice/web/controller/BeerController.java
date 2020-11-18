package com.cmani.msscbreweryservice.web.controller;


import com.cmani.msscbreweryservice.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

   // @Autowired
   // public BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){

        //to-do
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
        //return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@Validated @RequestBody BeerDto beer){

        //BeerDto beerDto = beerService.saveBeer(beer);
        HttpHeaders headers = new HttpHeaders();
        //Need to update the location full path, hostname- http://localhost:9191/api/v1/beer
       // headers.add("Location","/api/v1/beer"+beerDto.getId().toString());
        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping
    @RequestMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId,  @Validated @RequestBody BeerDto beerDto){
       // beerService.updateBeer(beerId,beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        //beerService.deleteBeer(beerId);
    }

}
