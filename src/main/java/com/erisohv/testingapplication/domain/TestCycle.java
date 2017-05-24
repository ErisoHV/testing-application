package com.erisohv.testingapplication.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="testcycle", uniqueConstraints={@UniqueConstraint(columnNames={"name", "version_id"})})
public class TestCycle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@ManyToOne
	private Version version;
	
	@OneToMany(mappedBy="testcycle")
	private List<MetricResult> metricResult;
	
	public TestCycle(){
		
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

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	public List<MetricResult> getMetricResult() {
		return metricResult;
	}

	public void setMetricResult(List<MetricResult> metricResult) {
		this.metricResult = metricResult;
	}
	
}
