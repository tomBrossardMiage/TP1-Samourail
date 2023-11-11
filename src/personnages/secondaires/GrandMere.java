package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.*;

public class GrandMere extends Humain{
	private Humain [] memoire;
	
	public GrandMere(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.memoire = new Humain [30];
	}
	
	private void humainHasard() {
		//utiliser la méthode random, voir doc
	}
}

