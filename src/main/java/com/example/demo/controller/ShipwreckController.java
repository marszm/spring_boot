package com.example.demo.controller;

import com.example.demo.model.Shipwreck;
import com.example.demo.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
    private final ShipwreckRepository shipwreckRepository;

    @Autowired
    public ShipwreckController(ShipwreckRepository shipwreckRepository) {
        this.shipwreckRepository = shipwreckRepository;
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
        public List<Shipwreck> list(){
            return shipwreckRepository.findAll();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return shipwreckRepository.saveAndFlush(shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public Optional<Shipwreck> get(@PathVariable Long id) {
        return shipwreckRepository.findById(id);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
        Shipwreck existingShipwreck = shipwreckRepository.getOne(id);
        BeanUtils.copyProperties(shipwreck, existingShipwreck);
        return shipwreckRepository.saveAndFlush(existingShipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id) {
        Shipwreck existingShipwreck = shipwreckRepository.getOne(id);
        shipwreckRepository.delete(existingShipwreck);
        return existingShipwreck;
    }

}
