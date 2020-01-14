package com.maximgoodman.pupapp.api;

import com.maximgoodman.pupapp.model.Animal;
import com.maximgoodman.pupapp.service.AnimalService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService){
        this.animalService=animalService;
    }

    @PostMapping
    @RequestMapping("addAnimal")
    public void addAnimal(@RequestBody Animal animal){
        animalService.addAnimal(animal);
    }

    @GetMapping
    @RequestMapping("listAll")
    public Collection<Animal> getAllAnimals(){
        return animalService.getAllAnimals();
    }
}
