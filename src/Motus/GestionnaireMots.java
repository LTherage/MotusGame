package Motus;

/**
 * GestionnaireMots est une interface spécifiant les différents services
 * attendus concernant la gestion des mots pour pouvoir implanter le jeu Motus.
 * Lors du jeu Motus les lettres du mot découvertes seront représentées par un motif.
 * Un motif est simplement une chaîne de caractères contenant le caractère ! pour indiquer que la lettre correspondante n'a pas encore été trouvée.
 * 
 * @author Ludovic Thérage - 2024
 */
public interface GestionnaireMots {
	
	/**
	 * Le caractère de base pour définir un motif.
	 */
	final static char CARACTERE_MOTIF='!';
	
	/**
	 * Méthode retournant true si et seulement le mot donné en paramètre existe.
	 * 
	 * @param mot La chaîne de caractères à tester (peu être en minuscule ou
	 *                    majuscule mais est toujours non null).
	 * @return true si et seulement si ce mot existe.
	 */
	public boolean motExiste(String mot);

	/**
	 * Méthode fournissant aléatoirement un mot en majuscule. d'une certaine catégorie et d'une certaine
	 * fréquence.
	 * 
	 * @return Le mot fourni aléatoirement en majuscule.
	 */
	public String fournitMotAleatoirement();
	
	/**
	 * Retourne une liste de mots satisfaisant un motif donné en paramètre.
	 * @param motif Le motif devant satifaire les mots.
	 * @return
	 */
	public String[] donneMotsAvecMotif(String motif);
	
	/**
	 * Créé un motif représentant les lettres bien placées dans le mot proposé.
	 * @param motATrouver Le mot à trouver (non null).
	 * @param motPropose Le mot proposé (non null et même longueur que motATrouver).
	 * @return Un motif représentant les lettres bien placées(cette chaîne de caractères pourra par exemple être bon!o!r pour le mot à trouver bonjour).
	 */
	static public String donneLettresBienPlacees(String motATrouver,String motPropose) {
		String resultat="";
		char lettre;
		for (int i=0;i<motATrouver.length();i++)
			if ((lettre=motATrouver.charAt(i))==motPropose.charAt(i))
				resultat=resultat+lettre;
			else
				resultat=resultat+GestionnaireMots.CARACTERE_MOTIF;
		return resultat;
	}
	
	/**
	 * Créé un motif représentant les lettres d'un mot non présente dans un motif de même longueur.
	 * @param mot Le mot considéré (non null).
	 * @param motif Le motif considéré  (non null et même longueur que mot).
	 * @return Un motif représentant les lettres de mot non présentes dans motif.
	 */
	static private String donneLettresPasPresentesDansMotif(String mot,String motif) {
		String resultat="";
		for (int i=0;i<motif.length();i++)
			if (motif.charAt(i)==GestionnaireMots.CARACTERE_MOTIF)
				resultat=resultat+mot.charAt(i);
			else
				resultat=resultat+GestionnaireMots.CARACTERE_MOTIF;
		return resultat;
	}
	

	/**
	 * Créé un motif représentant les lettres mal placées dans le mot proposé.
	 * @param motATrouver Le mot à trouver (non null).
	 * @param motPropose Le mot proposé (non null et même longueur que motATrouver).
	 * @return Un motif représentant les lettres mal placées(cette chaîne de caractères pourra par exemple être BON!O!R).
	 */
	static public String donneLettresMalPlacees(String motATrouver,String motPropose) {
		String lettresBienPlacees=donneLettresBienPlacees(motATrouver,motPropose);
		String lettresATrouver=donneLettresPasPresentesDansMotif(motATrouver,lettresBienPlacees);
		String lettresProposition=donneLettresPasPresentesDansMotif(motPropose,lettresBienPlacees);
		String resultat="";
		char lettre;
		int position;
		for (int i=0;i<lettresProposition.length();i++) {
				if (((lettre=lettresProposition.charAt(i))!=GestionnaireMots.CARACTERE_MOTIF)&&((position=lettresATrouver.indexOf(lettre))!=-1)) {
					lettresATrouver=lettresATrouver.substring(0, position)+GestionnaireMots.CARACTERE_MOTIF+lettresATrouver.substring(position+1, lettresATrouver.length());
					resultat=resultat+lettre;
				} else
					resultat=resultat+GestionnaireMots.CARACTERE_MOTIF;
		}
		return resultat;
	}
	
	/**
	 * Retourne un nouveau motif (chaîne de caractères composée d'uniquement du caractère !) d'un certain nombre de caractères
	 * @param nbCars Le nombre de caractères du nouveau motif.
	 * @return Une chaîne de caractères composée de nbCars occurences du caractère ! (point d'exclamation).
	 */
	static public String donneNouveauMotifVierge(int nbCars) {
		String res="";
		for (int i=0;i<nbCars;i++)
			res=res+GestionnaireMots.CARACTERE_MOTIF;
		return res;
	}
	
	/**
	 * Fusionne deux motifs.
	 * @param premierMotif Un premier motif (non null).
	 * @param secondMotif Un second motif (non null et de même longueur que premier motif).
	 * @return La fusion des deux motifs.
	 */
	static public String fusionneMotifs(String premierMotif,String secondMotif) {
		String resultat="";
		char lettre;
		for (int i=0;i<premierMotif.length();i++)
			if ((lettre=premierMotif.charAt(i))!=GestionnaireMots.CARACTERE_MOTIF)
				resultat=resultat+lettre;
			else
				resultat=resultat+secondMotif.charAt(i);
		return resultat;
	}
	
	/**
	 * Retourne le nombre de lettres dans le motif.
	 * @param motif Le motif considéré (non null).
	 * @return Le nombre de lettres dans le motif.
	 */
	static public int nbLettresMotif(String motif) {
		int nbLettres=0;
		for (int i=0;i<motif.length();i++)
			if (motif.charAt(i)!=GestionnaireMots.CARACTERE_MOTIF)
				nbLettres++;
		return nbLettres;
	}
}
