package jpa.ficheIncident;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jpa.ficheIncident.dao.*;


public class TestJpaFicheDao {
	
	public static void main(String[] args) {
		TestJpaFicheDao.testerManyToOneAfficherVehicule(FicheIncidentDaoFactory.JPA_DAO);
	}
	
	private static void testerManyToOneAfficherVehicule(String typeDao) {
		try {
			/*
			FicheIncidentDao ficheDao = FicheIncidentDaoFactory.getFicheIncidentDao(typeDao);
		
			FicheIncident fiche = ficheDao.rechercherFicheIncidentVoyageParId(4L);
			
			Vehicule v = new Vehicule();
			v = fiche.getVehicule();
			
			System.out.println("matricule du véhicule sujet de la fiche dont l’id est égal à 4 :" + v.getImmatriculation() );
			
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	/*
	private static void testerCascadeAgentDeclarant(String typeDao) {
		try {
			FicheIncidentDao ficheDao = FicheIncidentDaoFactory.getFicheIncidentDao(typeDao);
			VehiculeDao vehiculeDao = VehiculeDaoFactory.getVehiculeDao(typeDao);
		
			Vehicule vehicule = vehiculeDao.rechercherVehiculeParId(3L);
		
			// Test Cascade
			AgentDeclarant agDec = new AgentDeclarant();
			agDec.setMatricule("AG787");
			agDec.setNom("Anouar");
			agDec.setPrenom("Youness");
		
			FicheIncident fiche4 = new FicheIncident();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date dateIncident = simpleDateFormat.parse("2019-10-10 06:05");
			fiche4.setDateIncident(dateIncident);
		
			Date dateDeclaration = simpleDateFormat.parse("2019-10-10 07:05");
			fiche4.setDateDeclaration(dateDeclaration);
		
			Date dateReprise = simpleDateFormat.parse("2019-10-10 12:30");
			fiche4.setDateReprise(dateReprise);
		
			fiche4.setLieuIncident("Taounate");
			fiche4.setIncidentCritique(false);
			fiche4.setDescriptionIncident("léger");
			fiche4.setNombreVoyageur(56);
			fiche4.setNumeroFiche("F2019-10-10-N590");
		
			fiche4.setAgentDeclarant(agDec);
		
			fiche4.setVehicule(vehicule);
		
			ficheDao.insererFicheIncidentVoyage(fiche4);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	*/
	
	
	
	
	
	
	/*
	private static void testerManyToOneFicheVehicule(String typeDao) {
		try {
			FicheIncidentDao ficheDao = FicheIncidentDaoFactory.getFicheIncidentDao(typeDao);
			AgentDeclarantDao agentDeclarantDao = AgentDeclarantDaoFactory.getAgentDeclarantDao(typeDao);
			VehiculeDao vehiculeDao = VehiculeDaoFactory.getVehiculeDao(typeDao);
		
			
			Vehicule veh1 = vehiculeDao.rechercherVehiculeParId(3L);
		
			AgentDeclarant agDec = agentDeclarantDao.rechercherAgentDeclarantParId(1L);
		
			FicheIncident fiche1 = new FicheIncident();
			fiche1.setLieuIncident("GrandCasaBlanca");
			fiche1.setDescriptionIncident("Critique");
			fiche1.setIncidentCritique(true);
			fiche1.setNombreVoyageur(123);
			fiche1.setNumeroFiche("F2019-09-10-N190");
		
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date dateIncident = simpleDateFormat.parse("2019-09-10 06:05");
			fiche1.setDateIncident(dateIncident);
		
			Date dateDeclaration = simpleDateFormat.parse("2019-09-10 07:05");
			fiche1.setDateDeclaration(dateDeclaration);
		
			Date dateReprise = simpleDateFormat.parse("2019-09-10 12:30");
			fiche1.setDateReprise(dateReprise);
		
			fiche1.setAgentDeclarant(agDec);
			fiche1.setVehicule(veh1);
		
			ficheDao.insererFicheIncidentVoyage(fiche1);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	*/
	
	
	/*
	private static void testerManyToOneAfficherAgDec(String typeDao) {
		try {
			FicheIncidentDao ficheDao = FicheIncidentDaoFactory.getFicheIncidentDao(typeDao);
		
			FicheIncident fiche = ficheDao.rechercherFicheIncidentVoyageParId(3L);
			
			AgentDeclarant ag = new AgentDeclarant();
			ag = fiche.getAgentDeclarant();
			
			System.out.println("#- id:" + ag.getId().longValue() + ", matricule:" + ag.getMatricule() 
			+ ", Nom:" + ag.getNom() + ", Prénom:" + ag.getPrenom());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	*/
	
	
	/*
	private static void testerManyToOneFicheAgDec(String typeDao) {
		try {
			FicheIncidentDao ficheDao = FicheIncidentDaoFactory.getFicheIncidentDao(typeDao);
			AgentDeclarantDao agentDeclarantDao = AgentDeclarantDaoFactory.getAgentDeclarantDao(typeDao);
		
			
			// Création d'une fiche à laquelle on associe l'agent n°1
		
			AgentDeclarant agDec = agentDeclarantDao.rechercherAgentDeclarantParId(1L);
			
			FicheIncident fiche1 = new FicheIncident();
			fiche1.setLieuIncident("Ifrane");
			fiche1.setDescriptionIncident("Panne moteur");
			fiche1.setIncidentCritique(true);
			fiche1.setNombreVoyageur(70);
			fiche1.setNumeroFiche("F2019-09-10-N1");
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date dateIncident = simpleDateFormat.parse("2019-09-10 06:05");
			fiche1.setDateIncident(dateIncident);
			
			Date dateDeclaration = simpleDateFormat.parse("2019-09-10 07:05");
			fiche1.setDateDeclaration(dateDeclaration);
		
			Date dateReprise = simpleDateFormat.parse("2019-09-10 12:30");
			fiche1.setDateReprise(dateReprise);
			
			fiche1.setAgentDeclarant(agDec);
			ficheDao.insererFicheIncidentVoyage(fiche1);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	*/
	/*
	private static void testerCrudFiche(String typeDao) {
		
		try {
			
			
			FicheIncidentDao ficheDao = FicheIncidentDaoFactory.getFicheIncidentDao(typeDao);
			
			FicheIncident fiche1 = new FicheIncident();
			fiche1.setLieuIncident("Marrakech");
			fiche1.setDescriptionIncident("mortel");
			fiche1.setIncidentCritique(true);
			fiche1.setNombreVoyageur(123);
			fiche1.setNumeroFiche("F2019-01-01-N1");
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date dateIncident = simpleDateFormat.parse("2019-01-01 06:05");
			fiche1.setDateIncident(dateIncident);
			
			Date dateDeclaration = simpleDateFormat.parse("2019-01-01 07:05");
			fiche1.setDateDeclaration(dateDeclaration);

			Date dateReprise = simpleDateFormat.parse("2019-01-01 12:30");
			fiche1.setDateReprise(dateReprise);
			
			ficheDao.insererFicheIncidentVoyage(fiche1);
			
			
			FicheIncident fiche2 = new FicheIncident();
			fiche2.setLieuIncident("Agadir");
			fiche2.setIncidentCritique(false);
			fiche2.setDescriptionIncident("léger");
			fiche2.setNombreVoyageur(12);
			fiche2.setNumeroFiche("F2019-08-01-N10");
			
			dateIncident = simpleDateFormat.parse("2019-08-01 08:05");
			fiche2.setDateIncident(dateIncident);
			
			dateDeclaration = simpleDateFormat.parse("2019-08-01 09:10");
			fiche2.setDateDeclaration(dateDeclaration);

			dateReprise = simpleDateFormat.parse("2019-08-01 12:30");
			fiche2.setDateReprise(dateReprise);

			ficheDao.insererFicheIncidentVoyage(fiche2);

			
			// rechercher toutes les fiches
			List<FicheIncident> listeFiches = new ArrayList<>();
			listeFiches = ficheDao.rechercherTousLesFicheIncidentVoyages();

			for (FicheIncident fiche : listeFiches) {
				System.out.println("#- id:" + fiche.getId().longValue() + ", Numéro:" + fiche.getNumeroFiche()
									+ ", date:" + fiche.getDateIncident() + ", Lieu:" + fiche.getLieuIncident()
									+ ", Date Déclaration:" + fiche.getDateDeclaration() + ", date de Reprise:"
									+ fiche.getDateReprise() + ", Nombre de Voyageurs:" + fiche.getNombreVoyageur());

			}
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	*/
	
	
}
