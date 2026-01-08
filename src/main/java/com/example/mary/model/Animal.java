package com.example.mary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animal {



    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)


    Long id;
    String name;

    public Animal(){

    }

    public Animal(String name){
        this.name=name;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }



    
}
