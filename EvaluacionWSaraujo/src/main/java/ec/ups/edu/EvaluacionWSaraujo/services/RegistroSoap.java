package ec.ups.edu.EvaluacionWSaraujo.services;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.ups.edu.EvaluacionWSaraujo.modelo.Persona;
import ec.ups.edu.EvaluacionWSaraujo.modelo.Titulos;
import ec.ups.edu.EvaluacionWSaraujo.on.GestionTitulos;

@WebService
public class RegistroSoap {
	@Inject
	private GestionTitulos on;
	@Inject
	private Persona per;
	
	@WebMethod

	public String registrar(String cedula) throws Exception {
		
		if(on.validarCedula(cedula)) {
			per=on.buscarCedula(cedula);
			if(per != null) {
				System.out.println("si existe");
			}
			
		}return "ok";
	}
	

}
