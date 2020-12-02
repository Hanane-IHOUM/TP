package jpa.ficheIncident;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jpa.ficheIncident.dao.Chauffeur;
import jpa.ficheIncident.dao.ChauffeurDao;
import jpa.ficheIncident.dao.ChauffeurDaoFactory;
import jpa.ficheIncident.dao.Vehicule;
import jpa.ficheIncident.dao.VehiculeDao;
import jpa.ficheIncident.dao.VehiculeDaoFactory;

public class TestJpaVehiculeDao {

	public static void main(String[] args) {
		TestJpaVehiculeDao.testerCrudVehiculeChauffeur(VehiculeDaoFactory.JPA_DAO);
	}
	
	
	private static void testerCrudVehiculeChauffeur(String typeDao) {
		try {
		/*
			VehiculeDao vehiculeDao = VehiculeDaoFactory.getVehiculeDao(typeDao);
			ChauffeurDao chauffeurDao = ChauffeurDaoFactory.getChauffeurDao(typeDao);
		
			long id1 = 1;
			long id2 = 2;
		
			List<Chauffeur> listeChauffeurs = new ArrayList<>();
		
			listeChauffeurs.add(chauffeurDao.rechercherChauffeurParId(id1));
			listeChauffeurs.add(chauffeurDao.rechercherChauffeurParId(id2));
		
			Vehicule veh3 = new Vehicule();
			veh3.setCodeInterne("veh7");
			veh3.setImmatriculation("KK-LL-CC");
			veh3.setChauffeurs(listeChauffeurs);
		
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MMdd");
			Date utildate = simpleDateFormat.parse("2016-07-09");
			veh3.setDateMiseEnCirculation(utildate);
		
			vehiculeDao.insererVehicule(veh3);
		*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	

	/*
	private static void testerVehicule(String typeDao) {
		try {
			
			
			VehiculeDao vehiculeDao = VehiculeDaoFactory.getVehiculeDao(typeDao);

			vehiculeDao.insererVehicule("veh1", "12-H-38779", "2018-10-24");
			vehiculeDao.insererVehicule("veh2", "10-A-66759", "2019-06-25");
			vehiculeDao.insererVehicule("veh3", "1-H-91226", "2018-12-26");
			
			Vehicule veh1 = new Vehicule();
			veh1.setCodeInterne("veh4");
			veh1.setImmatriculation("AA-BB-CC");
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date utildate = simpleDateFormat.parse("2010-11-11");
			veh1.setDateMiseEnCirculation(utildate);
			vehiculeDao.insererVehicule(veh1);
			
			Vehicule veh2 = new Vehicule();
			veh2.setCodeInterne("veh5");
			veh2.setImmatriculation("JJ-BB-CC");
			Date utildate1 = simpleDateFormat.parse("2012-12-12");
			veh2.setDateMiseEnCirculation(utildate1);
			vehiculeDao.insererVehicule(veh2);
			
			// Rechercher tous les véhicules
			List<Vehicule> listeTousLesVehicules = vehiculeDao.rechercherTousLesVehicules();
			
			for (Vehicule vehicule : listeTousLesVehicules) {
				System.out.println("#- id:" + vehicule.getId().longValue() + ", codeInterne:" + vehicule.getCodeInterne() 
									+ ", immat:" + vehicule.getImmatriculation() + ", dateMEC:"
									+ (vehicule.getDateMiseEnCirculation()));
			}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

}

