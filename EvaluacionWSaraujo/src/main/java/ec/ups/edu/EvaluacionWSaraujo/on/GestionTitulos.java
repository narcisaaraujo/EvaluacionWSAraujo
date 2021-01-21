package ec.ups.edu.EvaluacionWSaraujo.on;

import javax.ejb.Stateless;
import javax.inject.Inject;


import ec.ups.edu.EvaluacionWSaraujo.dao.TitulosDAO;
import ec.ups.edu.EvaluacionWSaraujo.modelo.Persona;
import ec.ups.edu.EvaluacionWSaraujo.modelo.Titulos;



@Stateless
public class GestionTitulos {
	@Inject
	private TitulosDAO tidao;
	
	public boolean guardar(Titulos titulos) throws Exception {
            tidao.insert(titulos);
        return true;
    }
	 public Persona buscarCedula(String cedula) throws Exception {
         return tidao.findByCedula(cedula);
 }
	
	public boolean validarCedula(String ced) {
        boolean verdadera = false;
        int num = 0;
        int ope = 0;
        int suma = 0;
        for (int cont = 0; cont < ced.length(); cont++) {
            num = Integer.valueOf(ced.substring(cont, cont + 1));
            if (cont == ced.length() - 1) {
                break;
            }
            if (cont % 2 != 0 && cont > 0) {
                suma = suma + num;
            } else {
                ope = num * 2;
                if (ope > 9) {
                    ope = ope - 9;
                }
                suma = suma + ope;
            }
        }
        if (suma != 0) {
            suma = suma % 10;
            if (suma == 0) {
                if (suma == num) {
                    verdadera = true;
                }
            } else {
                ope = 10 - suma;
                if (ope == num) {
                    verdadera = true;
                }
            }
        } else {
            verdadera = false;
        }
        return verdadera;
    }
	public String codAlfanum() {
		// La variable palabra almacena el resultado final
		String palabra = "";
		// La variable caracteres es un número aleatorio entre 2 y 20 que define la
		// longitud de la palabra.
		int caracteres = (int) (Math.random() * 20) + 2;
		// Con un bucle for, que recorreremos las veces que tengamos almacenadas en la
		// variable caracteres, que será como mínimo 2, iremos concatenando los
		// caracteres aleatorios.
		for (int i = 0; i < caracteres; i++) {
			// Para generar caracteres aleatorios hay que recurrir al valor numérico de
			// estos
			// caracteres en el alfabeto Ascii. En este programa vamos a generar palabras
			// con
			// letras minúsculas, que se encuentran en el rango 97-122. El método floor
			// devuelve el máximo entero.
			int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
			// para pasar el código a carácter basta con hacer un cast a char
			palabra = palabra + (char) codigoAscii;
		}
		return palabra;
	}
}
