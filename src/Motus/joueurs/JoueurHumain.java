package Motus.joueurs;

import Motus.GestionnaireMots;
import Motus.util.UtilSaisies;
/**
 * Cette classe correspond aux joueurs humains.
 * 
 * @author Ludovic Thérage - 2024
 */
final public class JoueurHumain extends Joueur {

	/**
	 * Constructeur permettant de créer un nouveau joueur humain.
	 * @param pseudo Le pseudo du joueur humain.
	 */
	public JoueurHumain(String pseudo) {
		super(pseudo);
	}


	@Override
	public String joue(String lettresBienPlacees,GestionnaireMots gestionnaireMots,String[] motsDejaProposes) {
		return UtilSaisies.saisieChaineCars().toLowerCase();
	}

}
