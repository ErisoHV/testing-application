package com.erisohv.testingapplication.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erisohv.testingapplication.domain.MetricResult;
import com.erisohv.testingapplication.domain.TestCycle;
import com.erisohv.testingapplication.repository.MetricResultRepository;
import com.erisohv.testingapplication.repository.TestCycleRepository;

@RestController
@RequestMapping("/metricresult/api")
public class MetricResultController {
	
	@Autowired
	private MetricResultRepository metricResultRepository;
	
	@Autowired
	private TestCycleRepository testCycleRepository;

	@GetMapping(value = "/metricTestCycle/{testcycle_id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Map<String, String>>> getListInfo(@PathVariable("testcycle_id") Integer id){
		
		TestCycle cycle = testCycleRepository.findOne(id);
		
		List<Map<String, String>> list = new ArrayList<>();
		
		if (cycle != null){
			Iterable<MetricResult> metrics = cycle.getMetricResult();
			
			if (metrics != null){
				for (MetricResult result : metrics){
					Map<String, String> metricReturn = new HashMap<>();
					
					metricReturn.put("name", result.getMetric().getName());
					metricReturn.put("measure", result.getMeasure().toString());
					
					list.add(metricReturn);
				}
			}
			
		}
		
		return new ResponseEntity<List<Map<String,String>>>(list, HttpStatus.OK);
		
	}
	
}
