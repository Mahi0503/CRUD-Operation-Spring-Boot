package com.example.demo.service;

import com.example.demo.Repository.Repo;
import com.example.demo.Entity.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyMahindra {

    @Autowired
    private Repo repo; // No static keyword



    public List<MyEntity> getAllMyEntity(){
        return (List<MyEntity>) repo.findAll();
    }

    public Object saveEntity(MyEntity myEntity){
        
       return repo.save(myEntity);

    }
    public void deleteMyEntity(Long id) {
        repo.deleteById(id);
    }

    public MyEntity updateMyEntity(Long id, MyEntity myEntityDetails) {
        MyEntity myEntity = repo.findById(id).orElseThrow();
        myEntity.setName(myEntityDetails.getName());
        myEntity.setAge(myEntityDetails.getAge());
        myEntity.setAddress(myEntityDetails.getAddress());
        return repo.save(myEntity);
    }






    }

