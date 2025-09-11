package Motus.joueurs;


import Motus.GestionnaireMots;

/**
 * Une instance de cette classe représente un joueur du jeu Motus.
 * 
 * @author Ludovic Thérage - 2024
 */
public abstract class Joueur {
	
	/**
	 * Le pseudo du joueur (une chaîne de caractères d'au moins trois caractères).
	 */
	public final String pseudo;
	
	/**
	 * Le score du joueur.
	 */
	
	private int score;
	/**
	 * Le nombre de mots trouvés par le joueur.
	 */
	private int nbMotsTrouves;
	
	/**
	 * Constructeur permettant de créer un nouveau joueur avec un score et un nombre de mots trouvés à zéro.
	 * @param pseudo Le pseudo du nouveau joueur (doit être une chaîne de caractères d'au moins trois caractères).
	 */
	protected Joueur(String pseudo) {
		super();
		this.pseudo = pseudo;
		score=0;
		nbMotsTrouves=0;
	}
	
	/**
	 * Méthode permettant de modifier le score.
	 * @param score Le nouveau score du joueur.
	 */
	public void setScore(int score) {
		this.score=score;
	}
	
	/**
	 * Méthode retournant le score.
	 * @return Le score du joueur.
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * Méthode permettant d'incrémenter de 1 le nombre de mots trouvés.
	 */
	public void incrementeNbMotsTrouves() {
		nbMotsTrouves++;
	}
	
	/**
	 * Méthode retournant le nombre de mots trouvés.
	 * @return Le nombre de mots trouvés.
	 */
	public int getNbMotsTrouves() {
		return nbMotsTrouves;
	}
	
	/**
	 * Retourne une chaîne de caractères représentant le joueur sous la forme :
	 * Pseudo : XXXXX Score : YYYYY Nombre de mots trouvés : ZZZZZ
	 */
	public String toString() {
		return "Pseudo : "+pseudo+" Score : "+score+" Nombre de mots trouvés : "+nbMotsTrouves;
	}
	
	/**
	 * Méthode appelée pour qu'un joueur joue et retourne une chaîne de caractères correspondant au mot proposé.
	 * En paramètre de cette méthode est donnée une chaîne de caractères de même taille que le mot cherché et
	 * le motif correspondant aux lettres déjà trouvées dans le mot à chercher (par exemple BON!O!R). Les mots déjà proposés sont également donnés.
	 * @return Une chaîne de caractères correspondant au mot proposé par le joueur.
	 * @param gestionnaireMots Le gestionnaire de mots utilisé par les joueurs ordinateur pour jouer.
	 * @param lettresBienPlacees Les lettres trouvées et bien placées lors des tentatives précédentes.
	 * @param motsDejaProposes Les mots déjà proposés.
	 * @return Le mot joué par le joueur.
	 */
	abstract public String joue(String lettresBienPlacees, GestionnaireMots gestionnaireMots, String[] motsDejaProposes);
}
