package sn.maladie.dm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.maladie.dm.entity.Patient;
import sn.maladie.dm.repository.PatientRepos;

@Service
public class PatientService {
	@Autowired
	
	private PatientRepos patientRepos;

	public Patient createPatient(Patient p) {
		
		
		return patientRepos.save(p);
		
	}
}
