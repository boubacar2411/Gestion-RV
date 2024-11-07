package sn.maladie.dm.entity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Patient {
	@Id @GeneratedValue
 private Long idPatient;
private String nom;
private String email;


public Patient(Long idPatient, String nom, String email) {
	super();
	this.idPatient = idPatient;
	this.nom = nom;
	this.email = email;
	
	
}


public Long getIdPatient() {
	return idPatient;
}


public void setIdPatient(Long idPatient) {
	this.idPatient = idPatient;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public Patient() {
	super();
	// TODO Auto-generated constructor stub
}


}
