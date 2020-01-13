package com.maximgoodman.pupapp.dao;

import com.maximgoodman.pupapp.model.Animal;

import java.util.UUID;

public interface IAnimalDao {

    int insertAnimal(UUID id, Animal animal);

    default int insertAnimal(Animal animal){
        UUID id = UUID.randomUUID();
        return insertAnimal(id, animal);
    }

}
