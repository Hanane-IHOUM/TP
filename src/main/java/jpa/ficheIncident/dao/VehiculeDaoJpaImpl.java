package jpa.ficheIncident.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class VehiculeDaoJpaImpl implements VehiculeDao {
	private EntityManager em;
	
	public VehiculeDaoJpaImpl(EntityManager em) {
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

	
	public void insererVehicule(String _codeInterne, String _immatriculation, String _dateMiseEnCirculation) {
		EntityTransaction etx = null;
		
		try {
			// Initialiser une transaction JPA
			etx = this.em.getTransaction();
			etx.begin();
		
			// Construire l'objet Vehicule
			Vehicule vehicule = new Vehicule();
			vehicule.setCodeInterne(_codeInterne);
			vehicule.setImmatriculation(_immatriculation);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date utildate = simpleDateFormat.parse(_dateMiseEnCirculation);
			vehicule.setDateMiseEnCirculation(utildate);
		
			// Insérer
			this.em.persist(vehicule);
			// Commiter la transaction JPA
			etx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (etx != null) {
					etx.rollback();
				}
			}
	}

	
	
	public void insererVehicule(Vehicule _vehicule) {
		EntityTransaction etx = null;
		
		try {
			// Initialiser une transaction JPA
			etx = this.em.getTransaction();
			etx.begin();
		
			// Insérer
			this.em.persist(_vehicule);
			
			// Commiter la transaction JPA
			etx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (etx != null) {
					etx.rollback();
				}
			}
	}

	
	
	public List<Vehicule> rechercherTousLesVehicules() {
		String queryString = "select * from Vehicule;";
		Query query = this.em.createNativeQuery(queryString, Vehicule.class);
		return query.getResultList();
	}

	
	
	public Vehicule rechercherVehiculeParId(Long _id) {
		// Find retourne l'entité si elle existe sinon null
		return this.em.find(Vehicule.class, _id);
	}

	
	
	public List<Vehicule> rechercherVehiculeParImmatriculation(String _immatriculation){
		// Find retourne l'entité si elle existe sinon null
		Query query = em.createQuery("select v from Vehicule v where v.immatriculation like ?1");
	            
	    query.setParameter(1, _immatriculation);
	    
	    List<Vehicule> liste =query.getResultList();
	    return liste ;
		
	}

	
	
	public void modifierVehiculeCodeInterneParId(Long _id, String _codeInterne) {
		// Chercher le vehicule
		Vehicule vehicule = this.em.find(Vehicule.class, _id);
		if (vehicule != null) {
			EntityTransaction etx = null;
			try {
				// Initialiser une transaction JPA
				etx = this.em.getTransaction();
				etx.begin();
				
				// Modifier l'entité
				// La modification ne nécessite pas d'instruction particulière
				vehicule.setCodeInterne(_codeInterne);
		
				// Commiter la transaction JPA
				etx.commit();
				} catch (Exception e) {
					e.printStackTrace();
					if (etx != null) {
						etx.rollback();
					}
				}
		}
	}

	
	
	public void modifierVehiculeCodeInterneParId(Vehicule _vehicule) {
		EntityTransaction etx = null;
		try {
			// Initialiser une transaction JPA
			etx = this.em.getTransaction();
			etx.begin();
		
			// Pour modifier l'entité il faut la rattacher au contexte persisant
			this.em.merge(_vehicule);
		
			// Commiter la transaction JPA
			etx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (etx != null) {
					etx.rollback();
				}
			}
	}


	
	public void supprimerVehiculeParId(Long _id) {
		// Chercher le vehicule
		Vehicule vehicule = this.em.find(Vehicule.class, _id);
		if (vehicule != null) {
			// Initialiser une transaction JPA
			this.em.getTransaction().begin();
			em.remove(vehicule);
				
			// Commiter la transaction JPA
			em.getTransaction().commit();
				
			
			}
	}
	
	
	
	public void supprimerVehiculeParId(Vehicule _vehicule) {
		
		this.em.getTransaction().begin();
		em.remove(_vehicule);
						
		em.getTransaction().commit();
	}

}