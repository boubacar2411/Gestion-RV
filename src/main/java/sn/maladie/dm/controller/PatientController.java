package sn.maladie.dm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sn.maladie.dm.entity.Patient;
import sn.maladie.dm.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/CreatePatient")
	public Patient CreerPatient(@RequestBody Patient p) {
	
		return patientService.createPatient(p);
		
	}
		
	}


