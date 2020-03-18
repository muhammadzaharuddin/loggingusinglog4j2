package com.example.loggingusinglog4j2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.example.loggingusinglog4j2.models.*;
import com.example.loggingusinglog4j2.repository.*;

@Service
public class PetService {

    @Autowired
    PetRepository petRepo;

    public void addPet(Pet pet) {
        petRepo.addPet(pet);
    }

    public Pet getPet(Integer petId) {
        return petRepo.getPet(petId);
    }

    public List<Pet> getAllPet() {
        return petRepo.getAllPet();
    }

    public void updatePet(Integer petId, Pet newPet) {
        petRepo.updatePet(petId, newPet);
    }

    public void deletePet(Integer petId) {
        petRepo.deletePet(petId);
    }

}