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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erisohv.testingapplication.domain.TestCycle;
import com.erisohv.testingapplication.repository.TestCycleRepository;

@RestController
@RequestMapping("/testcycle/api")
public class TestCycleController {

	@Autowired
	private TestCycleRepository testCycleRepository;
	
	@GetMapping(value = "/listInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Map<String, String>>> getListInfo(){
		
		Iterable<TestCycle> list = testCycleRepository.findAll();
		
		List<Map<String, String>> tests = new ArrayList<>();
		
		for (TestCycle test : list){
			Map<String, String> testReturn = new HashMap<>();
					
			testReturn.put("version_id", String.valueOf(test.getVersion().getId()));
			testReturn.put("version_name", test.getVersion().getName());
			
			testReturn.put("name", test.getName());
			testReturn.put("id", String.valueOf(test.getId()));
			
			testReturn.put("application_name", test.getVersion().getApplication().getName());
			testReturn.put("application_id", String.valueOf(test.getVersion().getApplication().getId()));
			tests.add(testReturn);
		}
		
		return new ResponseEntity<List<Map<String,String>>>(tests, HttpStatus.OK);
		
	}
	
}
