package com.juliemarieatkins.plantingapi.plant;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
  @Autowired
  private PlantRepository plantRepository;

  public Map<String, Iterable<Plant>> list(){
Iterable<Plant> plants=plantRepository.findAll();
    return createHashPlural(plants);
  }

  public Map<String, Plant>create(Plant plant) {
  Plant savedPlant= plantRepository.save(plant);
  return createHashSingular(savedPlant);
  }

  private Map<String, Plant> createHashSingular(Plant plant){
  Map<String, Plant> response=new HashMap<String, Plant>();
  response.put("plant", plant);

  return response;
  }

  private Map<String, Iterable<Plant>>createHashPlural(Iterable<Plant> plants){
Map<String, Iterable <Plant>>response= new HashMap<String, Iterable<Plant>>();
response.put("plants", plants);
return response;
  }

}