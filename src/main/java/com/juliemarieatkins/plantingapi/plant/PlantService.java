package com.juliemarieatkins.plantingapi.plant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
  @Autowired
  private PlantRepository plantRepository;

  public Iterable<Plant> list(){
    return plantRepository.findAll();
  }
}