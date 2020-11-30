package jpa.ficheIncident;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jpa.ficheIncident.dao.*;

public class TestJpaAgentDeclarantDao {

	public static void main(String[] args) {
		TestJpaAgentDeclarantDao.testerCrudAgentDeclarant(AgentDeclarantDaoFactory.JPA_DAO);
	}

	
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

			for (AgentDeclarant chau : listeAgDeclarants) {
				System.out.println("#- id:" + chau.getId().longValue() + ", matricule:" + chau.getMatricule() 
									+ ", Nom:" + chau.getNom() + ", Prénom:" + chau.getPrenom());
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
}



