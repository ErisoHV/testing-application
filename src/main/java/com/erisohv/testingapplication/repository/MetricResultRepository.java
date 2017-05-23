package com.erisohv.testingapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.erisohv.testingapplication.domain.MetricResult;

@RepositoryRestResource(collectionResourceRel="metricresult", path="metricresult")
public interface MetricResultRepository extends CrudRepository<MetricResult, Integer>{

}
