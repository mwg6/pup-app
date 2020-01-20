package com.maximgoodman.pupapp.api;

import com.maximgoodman.pupapp.model.Animal;
import com.maximgoodman.pupapp.service.AnimalService;
import lombok.Getter;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
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

    @GetMapping
    @RequestMapping("animal/{name}")
    public Animal getAnimalByName(@PathVariable String name){
        Optional<Animal> a = getAllAnimals()
                    .stream()
                    .filter(x -> x.getName().equals(name))
                    .findFirst();
        return a.isPresent()?a.get():null;
    }

    @PutMapping
    @RequestMapping("animal/{id}")
    public Animal updateAnimal(@PathVariable("id") UUID id, @RequestBody Animal animal){
        Animal temp = animalService.getAnimal(animal.getId());
        if(temp!=null && id == temp.getId()){
            Animal novel = Animal.builder()
                                    .id(animal.getId())
                                    .name(animal.getName())
                                    .coloration(animal.getColoration())
                                    .addressFound(animal.getAddressFound())
                                    .comments(animal.getComments())
                                    .build();
            animalService.addAnimal(novel.id, novel);

            return novel;
        }
        else{
            return null;
        }
    }
/*
    @DeleteMapping
    @RequestMapping("animal/{id}")
    public int deleteAnimal(@PathVariable("id") UUID id){
        if (animalService.getAnimal(id) != null) {
            //TODO
        }
        return 200;
    }
    */
}
