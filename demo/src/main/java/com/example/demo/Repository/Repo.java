package com.example.demo.Repository;

import com.example.demo.Entity.MyEntity;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<MyEntity, Long>  {
}
