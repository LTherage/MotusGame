package Motus.joueurs;

import motus.GestionnaireMots;
import util.UtilAleatoire;

/**
 * Cette classe correspond aux joueurs de type ordinateur.
 * 
 * @author Jean-François Condotta - 2024
 */
public class JoueurOrdinateur extends Joueur {


	/**
	 * Constructeur permettant de créer un nouveau joueur ordinateur.
	 * @param pseudo Le pseudo du joueur ordinateur.
	 */
	protected JoueurOrdinateur(String pseudo) {
		super(pseudo);
	}



	@Override
	public String joue(String lettresBienPlacees,GestionnaireMots gestionnaireMots,String[] motsDejaProposes) {
		String[] mots=gestionnaireMots.donneMotsAvecMotif(lettresBienPlacees);
		int i=UtilAleatoire.genereEntierAleatoirement(mots.length);
		do {
			String mot=mots[i];
			boolean dejaPropose=false;
			for (String m : motsDejaProposes) {
				if (m.equals(mot)) {
					dejaPropose=true;
					i=(i+1)%mots.length;
					break;
				}
			}
			if (! dejaPropose)
				return mot;
		}while(true);
	}


}
