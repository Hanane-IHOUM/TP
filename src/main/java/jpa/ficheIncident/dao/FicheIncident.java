package jpa.ficheIncident.dao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;


@Entity
@Table(name = "FicheIncident")

public class FicheIncident implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_Incident")
	private Date dateIncident;

	@Column(name = "numero_Fiche", nullable = false)
	private String numeroFiche;
	
	@Column(name = "incident_Critique", nullable = false)
	private boolean incidentCritique;
	
	@Column(name = "lieu_Incident", nullable = false)
	private String lieuIncident;
	
	@Column(name = "nombre_Voyageur", nullable = false)
	private Integer nombreVoyageur;
	
	@Column(name = "description_Incident", nullable = false)
	private String descriptionIncident;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_Declaration")
	private Date dateDeclaration;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_Reprise")
	private Date dateReprise;

	@ManyToOne(cascade = { CascadeType.PERSIST , CascadeType.MERGE })
	private AgentDeclarant agentDeclarant;
	
	@ManyToOne
	private Vehicule vehicule;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDateIncident() {
		return dateIncident;
	}
	public void setDateIncident(Date dateIncident) {
		this.dateIncident = dateIncident;
	}
	public String getNumeroFiche() {
		return numeroFiche;
	}
	public void setNumeroFiche(String numeroFiche) {
		this.numeroFiche = numeroFiche;
	}
	
	public boolean getIncidentCritigue() {
		return incidentCritique;
	}
	public void setIncidentCritique(boolean incidentCritique) {
		this.incidentCritique = incidentCritique;
	}
	
	public String getLieuIncident() {
		return lieuIncident;
	}
	public void setLieuIncident(String lieuIncident) {
		this.lieuIncident = lieuIncident;
	}
	
	public Integer getNombreVoyageur() {
		return nombreVoyageur;
	}
	public void setNombreVoyageur(Integer nombreVoyageur) {
		this.nombreVoyageur = nombreVoyageur;
	}
	
	public String getDescriptionIncident() {
		return descriptionIncident;
	}
	public void setDescriptionIncident(String descriptionIncident) {
		this.descriptionIncident = descriptionIncident;
	}
	
	public Date getDateDeclaration() {
		return dateDeclaration;
	}
	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}
	
	public Date getDateReprise() {
		return dateReprise;
	}
	public void setDateReprise(Date dateReprise) {
		this.dateReprise = dateReprise;
	}
	
	public AgentDeclarant getAgentDeclarant() {
		return agentDeclarant;
	}
	public void setAgentDeclarant(AgentDeclarant agentDeclarant) {
		this.agentDeclarant = agentDeclarant;
	}
	
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
	
	
}