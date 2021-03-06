package com.erisohv.testingapplication.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="metricresult", uniqueConstraints={@UniqueConstraint(columnNames={"testcycle_id", "metric_id"})})
public class MetricResult {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private BigDecimal measure;
	
	@ManyToOne
	private TestCycle testcycle;
	
	@ManyToOne
	private Metric metric;
	
	public MetricResult(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getMeasure() {
		return measure;
	}

	public void setMeasure(BigDecimal measure) {
		this.measure = measure;
	}

	public TestCycle getTestcycle() {
		return testcycle;
	}

	public void setTestcycle(TestCycle testCycle) {
		this.testcycle = testCycle;
	}

	public Metric getMetric() {
		return metric;
	}

	public void setMetric(Metric metric) {
		this.metric = metric;
	}

}
