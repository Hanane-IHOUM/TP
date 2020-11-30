package jpa.ficheIncident.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class FicheIncidentDaoJpaImpl implements FicheIncidentDao {
	private EntityManager em;
	
	public FicheIncidentDaoJpaImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	protected void finalize() throws Throwable {
		if ((this.em != null) && this.em.isOpen()) {
			try {
				this.em.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		super.finalize();
	}

	

	
	
	public void insererFicheIncidentVoyage(FicheIncident _ficheIncidentVoyage) {
		EntityTransaction etx = null;
		
		try {
			// Initialiser une transaction JPA
			etx = this.em.getTransaction();
			etx.begin();
		
			// Insérer
			this.em.persist(_ficheIncidentVoyage);
			
			// Commiter la transaction JPA
			etx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (etx != null) {
					etx.rollback();
				}
			}
	}

	
	
	public List<FicheIncident> rechercherTousLesFicheIncidentVoyages() {
		String queryString = "select * from FicheIncident;";
		Query query = this.em.createNativeQuery(queryString, FicheIncident.class);
		return query.getResultList();
	}

	
	
	public FicheIncident rechercherFicheIncidentVoyageParId(Long _id) {
		// Find retourne l'entité si elle existe sinon null
		return this.em.find(FicheIncident.class, _id);
	}

	
	
	public void modifierFicheIncidentVoyage(FicheIncident _ficheIncidentVoyage){
		EntityTransaction etx = null;
		try {
			// Initialiser une transaction JPA
			etx = this.em.getTransaction();
			etx.begin();
		
			// Pour modifier l'entité il faut la rattacher au contexte persisant
			this.em.merge(_ficheIncidentVoyage);
		
			// Commiter la transaction JPA
			etx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (etx != null) {
					etx.rollback();
				}
			}
	}


	
	
	public void supprimerFicheIncidentVoyageParId(FicheIncident _ficheIncidentVoyage) {
		
		this.em.getTransaction().begin();
		em.remove(_ficheIncidentVoyage);
						
		em.getTransaction().commit();
	}

}
