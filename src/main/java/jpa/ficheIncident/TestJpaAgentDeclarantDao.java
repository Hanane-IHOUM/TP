package jpa.ficheIncident;

import java.util.ArrayList;
import java.util.List;

import jpa.ficheIncident.dao.*;

public class TestJpaAgentDeclarantDao {

	public static void main(String[] args) {
		TestJpaAgentDeclarantDao.testerManyToOneAfficherFichesAgent(AgentDeclarantDaoFactory.JPA_DAO);
	}
	
	
	private static void testerManyToOneAfficherFichesAgent(String typeDao) {
		try {
			/*
			
			AgentDeclarantDao agentDeclarantDao = AgentDeclarantDaoFactory.getAgentDeclarantDao(typeDao);
			
			AgentDeclarant agDec3 = new AgentDeclarant();
			
			agDec3 = agentDeclarantDao.rechercherAgentDeclarantParId(1L);
			
			List<FicheIncident> listeFiche = new ArrayList<>();
		
			listeFiche = agDec3.getFichesIncidentsDeclarees();
			
			for (FicheIncident fiche : listeFiche) {
				System.out.println("#- id:" + fiche.getId().longValue() + ", Date de l'incident:" + fiche.getDateIncident() 
									+ ", Nombre Voyageurs:" + fiche.getNombreVoyageur() + ", Description:" + fiche.getDescriptionIncident() 
									+ ", Lieu de l'incident:" + fiche.getLieuIncident());
			}
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

	/*
	private static void testerCrudAgentDeclarant(String typeDao) {
		
		try {
			
			AgentDeclarantDao agentDeclarantDao = AgentDeclarantDaoFactory.getAgentDeclarantDao(typeDao);

			AgentDeclarant agDec = new AgentDeclarant();
			agDec.setMatricule("AG123");
			agDec.setNom("Youssef");
			agDec.setPrenom("Abdellah");

			agentDeclarantDao.insererAgentDeclarant(agDec);

			AgentDeclarant agDec1 = new AgentDeclarant();
			agDec1.setMatricule("AG567");
			agDec1.setNom("Wassel");
			agDec1.setPrenom("Naoufal");

			agentDeclarantDao.insererAgentDeclarant(agDec1);
			
			
			List<AgentDeclarant> listeAgDeclarants = new ArrayList<>();
			listeAgDeclarants = agentDeclarantDao.rechercherTousLesAgentDeclarants();

			for (AgentDeclarant ag : listeAgDeclarants) {
				System.out.println("#- id:" + ag.getId().longValue() + ", matricule:" + ag.getMatricule() 
									+ ", Nom:" + ag.getNom() + ", Prénom:" + ag.getPrenom());
			}

			
			long id = 1;
			AgentDeclarant agDec2 = new AgentDeclarant();
			agDec2 = agentDeclarantDao.rechercherAgentDeclarantParId(id);
			
			agDec2.setNom("Youssoufi");
			agentDeclarantDao.modifierAgentDeclarant(agDec2);


			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	*/
}



