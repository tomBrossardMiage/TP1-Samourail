package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	private int honneur;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.honneur = 1;
	}
	
	public void donner(int flouze, Commerçant commercant) {
		commercant.recevoir(flouze);
	}
	
	public void provoquer(Yakuza yaya) {
		if((this.honneur*2)> yaya.getReputation()) {
			this.gagnerArgent(yaya.getArgent());
			this.honneur+=1;
			yaya.perdreDuel();
			this.parler("Je t'ai eu salle caca de bas étages");
		}else {
			this.honneur-=1;
			this.parler("Rhooo je suis trop nul zbi");
			yaya.gagnerDuel();
		}
	}
	
}
