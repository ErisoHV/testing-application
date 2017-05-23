package com.erisohv.testingapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.erisohv.testingapplication.domain.Version;

@RepositoryRestResource(collectionResourceRel="version", path="version")
public interface VersionRepository extends CrudRepository<Version, Integer>{

}
