package com.erisohv.testingapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.erisohv.testingapplication.domain.TestCycle;

@RepositoryRestResource(collectionResourceRel="testcycle", path="testcycle")
public interface TestCycleRepository extends CrudRepository<TestCycle, Integer>{

}
