package Motus.util;

/**
 * Une classe contenant une méthode permettant d'afficher du texte en couleur.
 * 
 * @author Jean-François Condotta - 2024
 */
public class UtilAffichage {

	/**
	 * Les couleurs utilisables.
	 */
	public enum Couleur {ROUGE,VERT,BLEU,JAUNE,VIOLET,CYAN,BLANC,GRIS};

	/**
	 * 
	 * @param texte Le texte à afficher.
	 * @param couleurFond La couleur du fond (doit être non null).
	 * @param couleurTexte La couleur du texte (doit être non null).
	 * @param texteBarre Booléen indiquant si le texte doit être barré.
	 */
	public static void afficheTexteEnCouleur(String texte,Couleur couleurFond,Couleur couleurTexte,boolean texteBarre) {
		String couleurF = switch (couleurFond) {
	      case ROUGE 	-> "41";
	      case VERT 	-> "42";
	      case JAUNE 	-> "43";
	      case BLEU 	-> "44";
	      case VIOLET	-> "45";
	      case CYAN 	-> "46";
	      case GRIS 	-> "47";
	      case BLANC 	-> "107";
	      default   	-> "40";
	    };
	    String couleurT = switch (couleurTexte) {
	      case ROUGE 	-> "31";
	      case VERT 	-> "32";
	      case JAUNE 	-> "33";
	      case BLEU 	-> "34";
	      case VIOLET 	-> "35";
	      case CYAN 	-> "36";
	      case GRIS 	-> "37";
	      case BLANC 	-> "97";
	      default   	-> "37";
	    };
	    String debut="\033["+couleurT+";"+couleurF;
	    if (texteBarre)
	    	debut=debut+";9";
	    System.out.print(debut+"m"+texte+"\033[0m");
	   
	}
	
	
}
