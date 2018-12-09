package com.example.demo.repository;

import com.example.demo.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
