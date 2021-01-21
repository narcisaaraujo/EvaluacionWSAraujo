package ec.ups.edu.EvaluacionWSaraujo.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.EvaluacionWSaraujo.modelo.Persona;
import ec.ups.edu.EvaluacionWSaraujo.modelo.Titulos;



@Stateless
public class TitulosDAO {

	@PersistenceContext(name = "EvaluacionWSaraujoPersistenceUnit")
	private EntityManager em;
	public boolean insert(Titulos titulos) throws Exception {
		em.persist(titulos);
		System.out.println("estamos aqui");
		return true;
	}
	
	public Persona findByCedula(String cedula) throws Exception {
		return em.find(Persona.class, cedula);

	}
}
