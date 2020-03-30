package fr.innso.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Message implements Serializable {

	@Id 
	private Long idMessage;

	private Date dateMessage;

	private String nomAuteur;

	private String contenuMessage;

	private Canal canal;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private DossierClient dossierClient;

	public Message() {
		super();
	
	}




	public Message(Long idMessage, Date dateMessage, String nomAuteur,
			String contenuMessage, Canal canal, DossierClient dossierClient) {
		super();
		this.idMessage = idMessage;
		this.dateMessage = dateMessage;
		this.nomAuteur = nomAuteur;
		this.contenuMessage = contenuMessage;
		this.canal = canal;
		this.dossierClient = dossierClient;
	}




	public Message(DossierClient dossierClient) {
		super();
		this.dossierClient = dossierClient;
	}




	public Long getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}

	public Date getDateMessage() {
		return dateMessage;
	}

	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}

	public String getNomAuteur() {
		return nomAuteur;
	}

	public DossierClient getDossierClient() {
		return dossierClient;
	}


	public void setDossierClient(DossierClient dossierClient) {
		this.dossierClient = dossierClient;
	}


	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

	public String getContenuMessage() {
		return contenuMessage;
	}

	public void setContenuMessage(String contenuMessage) {
		this.contenuMessage = contenuMessage;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	



}
