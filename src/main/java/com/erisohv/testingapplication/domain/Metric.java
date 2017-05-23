package com.erisohv.testingapplication.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Metric entity definition
 * @author Erika
 *
 */
@Entity
public class Metric {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@Column(nullable=true)
	private String description;
	
	@OneToMany(mappedBy="metric")
	private List<MetricResult> metricResults;
	
	public Metric(){
		
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<MetricResult> getMetricResults() {
		return metricResults;
	}

	public void setMetricResults(List<MetricResult> metricResults) {
		this.metricResults = metricResults;
	}
	
	
	
}
