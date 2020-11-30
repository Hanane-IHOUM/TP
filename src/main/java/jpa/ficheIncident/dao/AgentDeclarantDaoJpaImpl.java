package jpa.ficheIncident.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class AgentDeclarantDaoJpaImpl implements AgentDeclarantDao {
	private EntityManager em;
	
	public AgentDeclarantDaoJpaImpl(EntityManager em) {
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

	
	public void insererAgentDeclarant(AgentDeclarant _agentDeclarant) {
		EntityTransaction etx = null;
		
		try {
			// Initialiser une transaction JPA
			etx = this.em.getTransaction();
			etx.begin();
		
			// Insérer
			this.em.persist(_agentDeclarant);
			
			// Commiter la transaction JPA
			etx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (etx != null) {
					etx.rollback();
				}
			}
	}

	
	
	public List<AgentDeclarant> rechercherTousLesAgentDeclarants() {
		String queryString = "select * from AgentDeclarant;";
		Query query = this.em.createNativeQuery(queryString, AgentDeclarant.class);
		return query.getResultList();
	}

	
	
	public AgentDeclarant rechercherAgentDeclarantParId(Long _id) {
		// Find retourne l'entité si elle existe sinon null
		return this.em.find(AgentDeclarant.class, _id);
	}

	
	
	
	public void modifierAgentDeclarant(AgentDeclarant _agentDeclarant) {
		EntityTransaction etx = null;
		try {
			// Initialiser une transaction JPA
			etx = this.em.getTransaction();
			etx.begin();
		
			// Pour modifier l'entité il faut la rattacher au contexte persisant
			this.em.merge(_agentDeclarant);
		
			// Commiter la transaction JPA
			etx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (etx != null) {
					etx.rollback();
				}
			}
	}


	
	public void supprimerAgentDeclarantParId(AgentDeclarant _agentDeclarant) {
		
		this.em.getTransaction().begin();
		em.remove(_agentDeclarant);
						
		em.getTransaction().commit();
	}
}