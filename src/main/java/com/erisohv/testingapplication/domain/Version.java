package com.erisohv.testingapplication.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="version", uniqueConstraints={@UniqueConstraint(columnNames={"name", "application_id"})})
public class Version {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@ManyToOne
	private Application application;
	
	@JsonIgnore
	@OneToMany(mappedBy="version")
	private Set<TestCycle> testCycle;
	
	
	public Version(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public Set<TestCycle> getTestCycle() {
		return testCycle;
	}

	public void setTestCycle(Set<TestCycle> testCycle) {
		this.testCycle = testCycle;
	}
}
