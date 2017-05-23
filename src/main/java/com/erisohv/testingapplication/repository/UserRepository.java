package com.erisohv.testingapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.erisohv.testingapplication.domain.User;

@RepositoryRestResource(collectionResourceRel="user", path="user")
public interface UserRepository extends CrudRepository<User, Integer>{

}
