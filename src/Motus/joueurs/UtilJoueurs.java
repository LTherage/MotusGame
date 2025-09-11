package Motus.joueurs;

import java.util.ArrayList;

import util.UtilAffichage;
import util.UtilSaisies;
/**
 * Classe contenant une méthode permettant de paramètrer les joueurs du jeu Motus.
 * @author Jean-François Condotta - 2024
 */
public class UtilJoueurs {
	/**
	 * Méthode permettant de créer un ensemble de joueurs pouvant être humain ou
	 * ordinateur.
	 * 
	 * @param gestionnaireMots Le gestionnaire de mots qui sera utilisé par les
	 *                         joueurs ordinateurs créés.
	 * @return Une liste de joueurs contenant au moins un joueur.
	 */
	static public ArrayList<Joueur> creeJoueurs() {
		UtilAffichage.afficheTexteEnCouleur("***** Paramétrage des joueurs *****", UtilAffichage.Couleur.VERT,
				UtilAffichage.Couleur.BLANC, false);
		System.out.println("\n");
		int nbJoueurs = UtilSaisies.saisieEntier("Veuillez taper le nombre de joueurs : ");
		ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
		for (int i = 0; i < nbJoueurs; i++) {
			UtilAffichage.afficheTexteEnCouleur("\n> Pramètrage du joueur " + i + " <", UtilAffichage.Couleur.JAUNE,
					UtilAffichage.Couleur.BLANC, false);
			System.out.println("\n");
			String pseudo;
			boolean pseudoExiste=false;
			do {
				pseudo="";
				while (pseudo.length() < 3)
					pseudo = UtilSaisies.saisieChaineCars("Son pseudo (au moins 3 caractères) : ");
				pseudoExiste=false;	
				for (Joueur joueur : joueurs)
					if (joueur.pseudo.equals(pseudo)) {
						pseudoExiste=true;
						System.out.println("Un joueur avec le même pseudo existe déjà !");
					}
			}while (pseudoExiste);
			boolean humain = UtilSaisies.poseQuestionOuiNon("Est-ce un joueur humain ? Réponse o/n : ");
			if (humain)
				joueurs.add(new JoueurHumain(pseudo));
			else
				joueurs.add(new JoueurOrdinateur(pseudo));
		}
		return joueurs;
	}
}
