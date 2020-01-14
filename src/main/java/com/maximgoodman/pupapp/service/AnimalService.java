package com.maximgoodman.pupapp.service;

import com.maximgoodman.pupapp.dao.IAnimalDao;
import com.maximgoodman.pupapp.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
public class AnimalService {

    private final IAnimalDao animalDao;

    @Autowired
    public AnimalService(@Qualifier("hashDoa") IAnimalDao animalDao){
        this.animalDao = animalDao;
    }

    public int addAnimal(Animal animal){
        return animalDao.insertAnimal(animal);
    }

    public int addAnimal(UUID id, Animal animal){
        return animalDao.insertAnimal(id, animal);
    }

    public Collection<Animal> getAllAnimals(){
        return animalDao.getAllAnimals();
    }

    public Animal getAnimal(UUID id){
        return animalDao.getAnimal(id);
    }
}
