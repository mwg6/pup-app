package com.maximgoodman.pupapp.service;

import com.maximgoodman.pupapp.dao.IAnimalDao;
import com.maximgoodman.pupapp.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    public Collection<Animal> getAllAnimals(){
        return animalDao.getAllAnimals();
    }
}
