package Motus.util;

import java.util.Random;
/**
 * Cette classe contient une méthode permettant de générer aléatoirement un nombre entier.
 * 
 * @author Ludovic Thérage - 2024
 */
public class UtilAleatoire {
	
	/**
	 * Le générateur aléatoire permettant d'effectuer la génération.
	 */
	private final static Random generateurAleatoire=new Random(0);
	
	/**
	 * Méthode générant aléatoirement un nombre entre 0 (compris) et max (non compris).
	 * @param max La borne maximale.
	 */
	static public int genereEntierAleatoirement(int max) {
		return generateurAleatoire.nextInt(max);
	}
}
