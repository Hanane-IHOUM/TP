package jpa.ficheIncident.dao;


import java.util.List;


public interface FicheIncidentDao {

	void insererFicheIncidentVoyage(FicheIncident _ficheIncidentVoyage);

	List<FicheIncident> rechercherTousLesFicheIncidentVoyages();

	FicheIncident rechercherFicheIncidentVoyageParId(Long _id);

	void modifierFicheIncidentVoyage(FicheIncident _ficheIncidentVoyage);

	void supprimerFicheIncidentVoyageParId(FicheIncident _ficheIncidentVoyage);

}
