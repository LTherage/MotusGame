package Motus;

import java.util.ArrayList;
import java.util.Collection;

import Motus.util.LexiqueFr;
import Motus.GestionnaireMots;
import Motus.util.UtilAleatoire;
/*
 * Les occurences de cette classe correspondent aux gestionnaires de mots du jeu Motus.
 * Un gestionnaire de mots du jeu Motus permettent de gérer des mots français de taille comprise
 * entre 5 et 12 caractères.
 * 
 * @author Ludovic Thérage - 2024
 * 
 */
final public class LexiqueMotus extends LexiqueFr implements GestionnaireMots {
/*
 * Un constructeur permettant de construire un nouveau gestionnaire de mots Motus.
 */
	public LexiqueMotus() {
		super(5,12);
	}
	
	@Override
	public boolean motExiste(String mot) {
		return chercheMotsAvecOrthographe(mot).size()!=0;
	}

    private Collection<Object> chercheMotsAvecOrthographe(String mot) {
        return null;
    }

    @Override
	public String fournitMotAleatoirement() {
		int index=UtilAleatoire.genereEntierAleatoirement(getNbMots());
		return this.getMot(index).getOrthographe();
	}



    @Override
	public String[] donneMotsAvecMotif(String motif) {
		ArrayList<String> res=new ArrayList<String>();
		motif=motif.replace(CARACTERE_MOTIF,'.');
		for (int i=0;i<this.getNbMots();i++) {
			Mot mot=this.getMot(i);
			String m=mot.getOrthographe();
			if (m.matches(motif))
				res.add(m);
		}
		String[] resultat=new String[res.size()];
		for (int i=0;i<resultat.length;i++)
			resultat[i]=res.get(i);
		return resultat;
	}

    private int getNbMots() {
        return 0;
    }

}
