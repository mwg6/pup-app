package com.maximgoodman.pupapp.dao;

import com.maximgoodman.pupapp.model.Animal;
import org.springframework.stereotype.Repository;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository("hashDoa")
public class HashMapAnimalDoa implements IAnimalDao{

    private  static Map<UUID, Animal> DB = new HashMap<>();

    @Override
    public int insertAnimal(UUID id, Animal animal) {

        if(DB.containsKey(id)){
            DB.put(id, animal);
            return 2;
        }
        else{
            DB.put(id, animal);
            return 1;
        }

    }
}