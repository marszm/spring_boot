package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipwreck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String condition;
    private Integer depth;
    private Double latitude;
    private Double longtitude;
    private Integer yearDiscovered;

    public Shipwreck(Long id,
                     String name,
                     String description,
                     String condition,
                     Integer depth,
                     Double latitude,
                     Double longtitude,
                     Integer yearDiscovered) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.condition = condition;
        this.depth = depth;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.yearDiscovered = yearDiscovered;
    }

    public Shipwreck() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Integer getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(Integer yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }
}
