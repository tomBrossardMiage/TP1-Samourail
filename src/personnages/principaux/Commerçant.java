package personnages.principaux;

import personnages.Humain;

public class Commerçant extends Humain{
	public Commerçant(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent(this.getArgent());
		parler("le monde est méchant");
		return this.getArgent();
	}
	
	public void recevoir(int flouze) {
		this.gagnerArgent(flouze);
		parler("Merci mon brave !");
	}
}
