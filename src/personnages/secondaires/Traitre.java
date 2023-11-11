package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.*;

public class Traitre extends Samourai{
	private int traitrise;
	
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
		this.traitrise = 0;
	}
	
	public void extorquer(Commerçant victime) {
		if(this.traitrise >= 3) {
			this.gagnerArgent(victime.getArgent());
			this.traitrise+=1;
			victime.seFaireExtorquer();
			this.parler("Je t'ai bien eu haha. Je suis " + this.getNom() + " le traitre !");
		}else {
			this.parler("Il faut que je me fasse discret. j'ai déjà extorqué " + this.traitrise + "personnes !");
		}
		
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traitrise est de : "+this.traitrise);
	}
	
	public void faireLeGentil(Humain naif, int flouze) {
		if(this.traitrise > 0) {
			this.traitrise -= this.traitrise/10;
		}
		this.perdreArgent(flouze);
		naif.gagnerArgent(flouze);
		this.parler("tiens je te donne "+ flouze + "sous " + naif.getNom()+ " !");
		naif.parler("Merci " + this.getNom() + "Tu es un bon samourai !");
	}
	
}
