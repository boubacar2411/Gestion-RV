package sn.maladie.dm.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class RendezVous {
@Id @GeneratedValue
	private Long idRV;
	private Date heureRv;
	private Date dateRv;
	private String rapportConsult;
	public RendezVous(Long idRV, Date heureRv, Date dateRv, String rapportConsult) {
		super();
		this.idRV = idRV;
		this.heureRv = heureRv;
		this.dateRv = dateRv;
		this.rapportConsult = rapportConsult;
	}
	public RendezVous(Long idRV, Date heureRv, Date dateRv) {
		super();
		this.idRV = idRV;
		this.heureRv = heureRv;
		this.dateRv = dateRv;
	}
	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
