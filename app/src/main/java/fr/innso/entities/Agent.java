package fr.innso.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Agent {
	
	@Id @GeneratedValue
	private long numeroAgent;
	
	private String nomAgent;
	
	@OneToMany
	@JoinColumn(name="idClient")
	private List<DossierClient> dossierClients;

	public long getNumeroAgent() {
		return numeroAgent;
	}

	public void setNumeroAgent(long numeroAgent) {
		this.numeroAgent = numeroAgent;
	}

	public String getNomAgent() {
		return nomAgent;
	}

	public void setNomAgent(String nomAgent) {
		this.nomAgent = nomAgent;
	}

	public List<DossierClient> getDossierClients() {
		return dossierClients;
	}

	public void setDossierClients(List<DossierClient> dossierClients) {
		this.dossierClients = dossierClients;
	}

	public Agent() {
		super();
		
	}

	public Agent(String nomAgent, List<DossierClient> dossierClients) {
		super();
		this.nomAgent = nomAgent;
		this.dossierClients = dossierClients;
	}
	
	
}
