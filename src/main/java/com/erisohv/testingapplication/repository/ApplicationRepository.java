package com.erisohv.testingapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.erisohv.testingapplication.domain.Application;

@RepositoryRestResource(collectionResourceRel="application", path="application")
public interface ApplicationRepository extends CrudRepository<Application, Integer>{

}
