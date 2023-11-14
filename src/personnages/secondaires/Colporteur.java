package personnages.secondaires;

import personnages.principaux.*;

public class Colporteur extends Commerçant{
	
	
	public Colporteur (String nom, int argent) {
		super(nom, argent);
	}
	
	@Override
	
	public int seFaireExtorquer() {
		this.perdreArgent(this.getArgent()/2);
		parler("le monde est méchant, mais pas trop hehe. J'ai caché la moitier de mes sous dans ma chaussette");
		return this.getArgent();
	}
}
