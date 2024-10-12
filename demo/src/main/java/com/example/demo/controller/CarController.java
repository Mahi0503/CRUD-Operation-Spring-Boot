package com.example.demo.controller;

import com.example.demo.Entity.MyEntity;
import com.example.demo.service.MyMahindra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController { // Renamed to follow Java naming conventions
    @Autowired
    private MyMahindra myMahindra;


    @GetMapping
    public List<MyEntity> getAllMyEntity() {
        return myMahindra.getAllMyEntity();
    }

    @PostMapping
    public String createentity(@RequestBody MyEntity myEntity){
      myMahindra.saveEntity(myEntity);
       return "save data";
    }
    @PutMapping("/{id}")
    public MyEntity updatePerson(@PathVariable Long id, @RequestBody MyEntity myEntityDetails) {
        return myMahindra.updateMyEntity(id, myEntityDetails);
    }
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        myMahindra.deleteMyEntity(id);
    }

}
