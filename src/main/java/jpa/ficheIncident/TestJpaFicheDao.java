package jpa.ficheIncident;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jpa.ficheIncident.dao.*;


public class TestJpaFicheDao {
	
	public static void main(String[] args) {
		TestJpaFicheDao.testerCrudFiche(FicheIncidentDaoFactory.JPA_DAO);
	}

	
	private static void testerCrudFiche(String typeDao) {
		
		try {
			/*
			
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
			
			*/
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
