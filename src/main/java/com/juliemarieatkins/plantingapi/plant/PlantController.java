package com.juliemarieatkins.plantingapi.plant;

import java.util.Map;
import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
@RequestMapping("plants")
public class PlantController {
  @Autowired
  private PlantService plantService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Map<String, Iterable<Plant>> list(){
    Iterable<Plant> plants = plantService.list();
    return createHashPlural(plants);
  }

  private Map<String, Iterable<Plant>> createHashPlural(Iterable<Plant> plants){
    Map<String, Iterable<Plant>> response = new HashMap<String, Iterable<Plant>>();
    response.put("plants", plants);

    return response;
  }
}