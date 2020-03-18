package com.example.loggingusinglog4j2.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.log4j.Log4j2;

import com.example.loggingusinglog4j2.models.*;
import com.example.loggingusinglog4j2.service.*;

@Log4j2
@RestController
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping("/pets")
    public void addPet(@RequestHeader("userId") Integer userID, @RequestBody Pet pet) {
        petService.addPet(pet);
        log.debug(userID);
    }

    @GetMapping("/pets/{petId}")
    public Pet getPet(@RequestHeader("userId") Integer userID, @PathVariable("petId") Integer petId) {
        log.debug(userID);
        return petService.getPet(petId);
    }

    @GetMapping("/pets")
    public List<Pet> getAllPet(@RequestHeader("userId") Integer userID) {
        log.debug(userID);
        log.warn(userID);
        return petService.getAllPet();
    }

    @PutMapping("/pets/{petId}")
    public void updatePet(@RequestHeader("userId") String userID, @PathVariable("petId") Integer petId, @RequestBody Pet pet){
        log.debug(userID);
        petService.updatePet(petId, pet);
    }

    @DeleteMapping("/pets/{petId}")
    public void deletePet(@RequestHeader("userId") String userID, @PathVariable("petId") Integer petId){
        log.debug(userID);
        petService.deletePet(petId);
    }

}