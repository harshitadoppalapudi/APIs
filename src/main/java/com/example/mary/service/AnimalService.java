package com.example.mary.service;

import org.springframework.stereotype.Service;

import com.example.mary.repository.AnimalRepo;
import com.example.mary.model.Animal;
import java.util.List;


@Service
public class AnimalService {

    private final AnimalRepo repo;

    public AnimalService(AnimalRepo repo){
        this.repo=repo;

    }
    public List<Animal>getAllAnimals(){
        return repo.findAll();
    }
    public Animal addAnimals(Animal animal){
        return repo.save(animal);
    }
    public Animal updateAnimals(Long id,Animal animal){
        Animal existing =repo.findById(id).orElse(null);
        if(existing==null) return null;

        existing.setName(animal.getName());
        return repo.save(existing);
    }

    public void delete(Long id){
        repo.deleteById(id);
    }




    
}
