package Motus;

import java.util.ArrayList;

import Motus.joueurs.Joueur;
import Motus.util.UtilAffichage;
import Motus.util.UtilAleatoire;
/**
 * Une occurence de cette classe correspond à une partie du jeu Motus.
 */
public class Partie {

	/**
	 * Le nombre maximum de tentatives possibles.
	 */
	static final private int MAX_TENTATIVES = 10;

	/**
	 * Les joueurs de la partie.
	 */
	final private ArrayList<Joueur> joueurs;

	/**
	 * Le gestionnaire de mots utilisé pour la vérification des mots saisies.
	 */
	final private GestionnaireMots gestionnaireMots;

	/**
	 * Une chaîne de caractères donnant les lettres trouvées et bien placées durant
	 * la partie (cette chaîne de caractères pourra par exemple être BON!O!R.
	 */
	private String lettresBienPlacees;

	/**
	 * Le mot qui devra être trouvé durant la partie.
	 */
	final private String motATrouver;

	/**
	 * L'indice du joueur courant.
	 */
	private int indiceJoueurCourant;

	/**
	 * Les tentatives de la partie.
	 */
	final private ArrayList<Tentative> tentatives;

	/**
	 * Constructeur permettant de créer une nouvelle partie.
	 * 
	 * @param joueurs          Les joueurs jouant à la partie.
	 * @param gestionnaireMots Le gestionnaire de mots utilisé pour la génération du
	 *                         mot à trouver et la vérification des mots saisis.
	 */
	public Partie(ArrayList<Joueur> joueurs, GestionnaireMots gestionnaireMots) {
		this.joueurs = null;
		this.gestionnaireMots = null;
		this.motATrouver=null;
		this.lettresBienPlacees=null;
		this.tentatives = null;
		
	}

	/**
	 * Méthode indiquant si la partie est terminée.
	 * 
	 * @return true si et seulement si la partie est terminée.
	 */
	private boolean estTerminee() {
		return false;
	}

	/**
	 * Méthode indiquant si le mot a été trouvé.
	 * 
	 * @return true si et seulement si le mot a été trouvé.
	 */
	private boolean motTrouve() {
		return false;
	}

	/**
	 * Méthode permettant de jouer un coup : fait jouer le joueur courant, créé,
	 * affiche et ajoute la tentative correspondant, met à jour les lettre bien
	 * placées.
	 */
	private void faitJouerJoueurCourant() {
	}

	/**
	 * Méthode permettant de démarrer la partie.
	 */
	public void demarre() {

	}

	/**
	 * Méthode retournant les mots déja joués par les différents joueurs.
	 * 
	 */
	public String[] donneMotsJoues() {
		return null;
	}
}
