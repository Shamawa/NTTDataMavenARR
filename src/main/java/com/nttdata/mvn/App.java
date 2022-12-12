package com.nttdata.mvn;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Metodo en la clase principal que utiliza la libreria Apache Commons Lang
 * @author Alexandra Rodriguez​
 */
public class App {
	/**
	 * Metodo principal de entrada de la aplicacion
	 * @param args Argumentos del metodo
	 */
	public static void main(String[] args) {
		
		// Imprime:  "En un lugar"y
		System.out.println(StringUtils.abbreviate("En un lugar de Java", 14));

		// Imprime: "Hola Maven, Hola Maven"
		System.out.println(StringUtils.replace("Hola mundo, Hola mundo", "mundo", "Maven"));
		
		// Crea un array con nombres de colores
		String[] colores = new String[1];
		colores[0] ="Rojo";
		
		// Agrega elementos a un array
		colores = (String[]) ArrayUtils.add(colores, "Azul");
		colores = (String[]) ArrayUtils.add(colores, "Morado");
		
		for (int i = 0; i < colores.length; i++) {
			System.out.println(colores[i]);
			
		}
	}
}