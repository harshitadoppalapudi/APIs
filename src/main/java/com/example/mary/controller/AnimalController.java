package com.example.mary.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import com.example.mary.service.AnimalService;
import com.example.mary.model.Animal;



@RestController
@RequestMapping("/animals")
public class AnimalController {

    final private AnimalService service;

    public AnimalController(AnimalService service){
        this.service=service;
    }
    @GetMapping
    public List<Animal>getAll(){
        return service.getAllAnimals();
    }
    @PostMapping
    public Animal add(@RequestBody Animal animal){
        return service.addAnimals(animal);

    }
    @PutMapping("/{id}")
    public Animal update(@PathVariable Long id, @RequestBody Animal animal){
        return service.updateAnimals(id,animal);

    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "deleted";
    }



    
    
}
