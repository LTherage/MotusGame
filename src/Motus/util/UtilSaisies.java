package Motus.util;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Une classe contenant différentes méthodes permettant d'effectuer des saisies.
 * 
 * @author Jean-François Condotta - 2024
 */
public class UtilSaisies {

	/**
	 * Le scanner qui permettra de réaliser les saisies.
	 */
	static final private Scanner scanner = new Scanner(System.in);

	/**
	 * Méthode permettant la saisie d'une chaîne de caractères.
	 * @return Une chaîne de caractères saisie au clavier.
	 */
	public static String saisieChaineCars() {
		return scanner.nextLine();
	}
	
	/**
	 * Méthode permettant la saisie d'une chaîne de caractères.
	 * Avant la saisie, le message passé en paramètre est affiché.
	 * @param message Le message affiché avant la saisie.
	 * @return Une chaîne de caractères saisie au clavier.
	 */
	public static String saisieChaineCars(String message) {
		System.out.print(message);
		return scanner.nextLine();
	}
	
	/**
	 * Méthode permettant la saisie d'un entier strictement positif.
	 * Avant la saisie, le message passé en paramètre est affiché.
	 * @param message Le message affiché avant la saisie.
	 * @return Un entier strictement positif saisi au clavier.
	 */
	public static int saisieEntier(String message) {
		return saisieEntier(message,Integer.MAX_VALUE);
	}
	
	/**
	 * Méthode permettant la saisie d'un entier strictement positif inférieur ou égal à une valeur maximale.
	 * Avant la saisie, le message passé en paramètre est affiché.
	 * @param message Le message affiché avant la saisie.
	  * @param max La valeur maximale.
	 * @return Un entier strictement positif saisi au clavier.
	 */
	public static int saisieEntier(String message,int max) {
		System.out.print(message);
		try {
		String saisieS=scanner.nextLine();
		int saisie=Integer.parseInt(saisieS);
		if ((saisie>=0)&&(saisie<=max))
			return saisie;
		}catch(Exception e) {}
		return saisieEntier(message,max);
	}
	
	/**
	 * Méthode permettant de poser une question Oui/Non.
	 * @param question La question.
	 * @return true si et seulement si Oui a été répondu.
	 */
	public static boolean poseQuestionOuiNon(String question) {
		System.out.print(question);
		String saisie=scanner.nextLine();
		return saisie.equals("o")||saisie.equals("0");
	}
	
	public static Object saisieItemListe(String message,ArrayList<Object> liste) {
		return saisieItemListe(message,liste.toArray());
	}
	
	public static Object saisieItemListe(String message,Object liste[]) {
		System.out.println(message);
		for (int i=0;i<liste.length;i++)
			System.out.println(i+" : "+liste[i]);
		int i=saisieEntier("Taper l'entier correspondant à votre choix >>> ",liste.length-1);
		return liste[i];
	}
}
