package fr.innso.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DossierClient implements Serializable{
	@Id 
	private Long idClient;

	private String nomClient;

	private Date dateOuverture;

	private String reference;

	@OneToMany(mappedBy="dossierClient", fetch=FetchType.EAGER)
	private List<Message> listMessage;

	public DossierClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public DossierClient(Long idClient, String nomClient, Date dateOuverture,
			String reference, List<Message> listMessage) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.dateOuverture = dateOuverture;
		this.reference = reference;
		this.listMessage = listMessage;
	}

	public DossierClient(Long idClient) {
		super();
		this.idClient = idClient;
	}




	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}



	public List<Message> getListMessage() {
		return listMessage;
	}



	public void setListMessage(List<Message> listMessage) {
		this.listMessage = listMessage;
	}


}
