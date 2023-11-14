package personnages.secondaires;

import java.util.*;
import personnages.Humain;

public class GrandMere extends Humain{
	private Humain [] memoire;
	private int compteur;
	
	public GrandMere(String nom, int argent) {
		super(nom, argent, "thé");
		this.memoire = new Humain [30];
		this.compteur = 0;
		
	}
	
	private String humainHasard() {
		Random random = new Random();
		int hasard = random.nextInt(3);
		switch(hasard) {
		case 0:
			return "Commerçant";
		case 1:
			return "Yakuza";
		case 2:
			return "Ronin";
		default : 
			return "erreur";	
		}
	}
	
	public void faireConnaissanceAvec(Humain x) {
		if (memoire.length == 30) {
			this.parler("Je connais trop de monde, j'arrive plus à mettre en mémoire d'autres personnes !");
		}else {
			memoire[this.compteur] = x;
			this.compteur+=1;
			}
	}
	
	public void Ragoter() {
		for (int i = 0; i<memoire.length;i++) {
			if (memoire[i] instanceof Traitre) {
				this.parler("je sais que "+memoire[i].getNom()+" est un traitre !");
			}
			this.parler("je pense que "+memoire[i].getNom()+" est un "+this.humainHasard()+" !");
		}
	}
	
	
	
}

