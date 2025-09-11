package Motus;

import java.util.ArrayList;

import Motus.joueurs.Joueur;
import Motus.util.UtilAleatoire;

/**
 * Cette classe représente une tentative (un mot proposé par un joueur ou la tentative initiale).
 */
final public class Tentative {
	/**
	 * Le mot proposé.
	 */
	final public String motPropose;
	
	/**
	 * Le motif représentant les lettres bien placées (vaut null si le mot n'est pas correct).
	 */
	final public String lettresBienPlacees;
	
	/**
	 * Le motif représentant les lettres mal placées (vaut null si le mot n'est pas correct).
	 */
	final public String lettresMalPlacees;
	
	/**
	 * Le joueur qui a fait la tentative.
	 */
	final public Motus.joueurs.Joueur joueur;
	
	/**
	 * Constructeur permettant de créer une nouvelle tentative.
	 * @param motATrouver Le mot à trouver.
	 * @param motPropose Le mot proposé pour cette tentative.
	 * @param motValide Indique si le mot est un mot valide.
	 * @param joueur Le joueur ayant fait la tentative.
	 */
	protected Tentative(String motATrouver,String motPropose,boolean motValide, Motus.joueurs.Joueur joueur) {
		this.motPropose = null;
		this.lettresBienPlacees = null;
		this.lettresMalPlacees = null;
		this.joueur=null;
	}
	
	
	/**
	 * Constructeur permettant de créer une nouvelle tentative correspondant à la première tentative de la partie.
	 * @param motATrouver Le mot à trouver.
	 */
	protected Tentative(String motATrouver) {
		this.motPropose = null;
		this.lettresBienPlacees = null;
		this.lettresMalPlacees = null;
		this.joueur=null;
		
	}
	
	/**
	 * Affiche les lettres bien et mal placées de la tentative sur deux lignes. 
	 */
	public void afficheLettresBienEtMalPlacees() {
	}
	
	/**
	 * Affiche les lettres bien et mal placées en couleur sur une ligne.
	 */
	public void afficheLettresBienEtMalPlaceesEnCouleur() {
	
	}
	
	/**
	 * Affiche les lettres bien et mal placées d'un ensemble de tentatives.
	 * @param modeCouleur Un booléen indiquant si l'affichage se fait en couleur ou non.
	 */
	static void afficheTentatives(ArrayList<Tentative> tentatives,boolean modeCouleur) {
	}
	
}
