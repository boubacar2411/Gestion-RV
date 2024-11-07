package sn.maladie.dm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Medecin {
	@Id @GeneratedValue
private Long idMedecin;
private String nomMed;
private String Specialite;
public Medecin(Long idMedecin, String nomMed, String specialite) {
	super();
	this.idMedecin = idMedecin;
	this.nomMed = nomMed;
	Specialite = specialite;
}


}
