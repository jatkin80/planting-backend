package com.juliemarieatkins.plantingapi.plant;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
@RequestMapping("plants")
public class PlantController {
  @Autowired
  private PlantService plantService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Map<String, Iterable<Plant>> list() {
    return plantService.list();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Map<String, Plant> create(@Validated @RequestBody Plant plant) {
return plantService.create(plant);
  }
}