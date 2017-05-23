package com.erisohv.testingapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.erisohv.testingapplication.domain.Metric;

@RepositoryRestResource(collectionResourceRel="metric", path="metric")
public interface MetricRepository extends CrudRepository<Metric, Integer> {

}
