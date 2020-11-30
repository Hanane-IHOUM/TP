package jpa.ficheIncident.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class ChauffeurDaoJpaImpl implements ChauffeurDao {
	private EntityManager em;
	
	public ChauffeurDaoJpaImpl(EntityManager em) {
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

	
	public void insererChauffeur(Chauffeur _Chauffeur) {
		EntityTransaction etx = null;
		
		try {
			// Initialiser une transaction JPA
			etx = this.em.getTransaction();
			etx.begin();
		
			// Insérer
			this.em.persist(_Chauffeur);
			
			// Commiter la transaction JPA
			etx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (etx != null) {
					etx.rollback();
				}
			}
	}

	
	
	public List<Chauffeur> rechercherTousLesChauffeurs() {
		String queryString = "select * from Chauffeur;";
		Query query = this.em.createNativeQuery(queryString, Chauffeur.class);
		return query.getResultList();
	}

	
	
	public Chauffeur rechercherChauffeurParId(Long _id) {
		// Find retourne l'entité si elle existe sinon null
		return this.em.find(Chauffeur.class, _id);
	}

	
	
	
	public void modifierChauffeur(Chauffeur _chauffeur) {
		EntityTransaction etx = null;
		try {
			// Initialiser une transaction JPA
			etx = this.em.getTransaction();
			etx.begin();
		
			// Pour modifier l'entité il faut la rattacher au contexte persisant
			this.em.merge(_chauffeur);
		
			// Commiter la transaction JPA
			etx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (etx != null) {
					etx.rollback();
				}
			}
	}


	
	public void supprimerChauffeur(Chauffeur _chauffeur) {
		
		this.em.getTransaction().begin();
		em.remove(_chauffeur);
						
		em.getTransaction().commit();
	}

	
	
	/*
	public void insererChauffeur(String _matricule, String _nom, String _prenom, String _telephone) {
		EntityTransaction etx = null;
		
		try {
			// Initialiser une transaction JPA
			etx = this.em.getTransaction();
			etx.begin();
		
			// Construire l'objet Vehicule
			Chauffeur chauffeur = new Chauffeur();
			chauffeur.setMatricule(_matricule);
			chauffeur.setNom(_nom);
			chauffeur.setPrenom(_prenom);
			chauffeur.setTelephone(_telephone);
		
			// Insérer
			this.em.persist(chauffeur);
			// Commiter la transaction JPA
			etx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (etx != null) {
					etx.rollback();
				}
			}
	}

	*/
	/*
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

	*/
	/*
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
	
	*/
	
	
}