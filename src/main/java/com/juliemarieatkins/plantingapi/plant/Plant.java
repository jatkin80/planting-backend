package com.juliemarieatkins.plantingapi.plant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity
@Data
@Table(name = "plant")
public class Plant {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;
  @Column(name = "description")
  private String description;
  @Column(name = "image_url")
  private String imageUrl;
  @Column(name="date_added")
  private String dateAdded;
}