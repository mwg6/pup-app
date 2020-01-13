package com.maximgoodman.pupapp.api;

import com.maximgoodman.pupapp.model.Animal;
import com.maximgoodman.pupapp.service.AnimalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
