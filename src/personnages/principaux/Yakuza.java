package personnages.principaux;
import personnages.Humain;
public class Yakuza extends Humain{
	private String clan;
	private int reputation;
	
	public Yakuza (String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commerçant commercant){
		this.gagnerArgent(commercant.getArgent());
		this.reputation+=1;
		commercant.seFaireExtorquer();
		this.parler("Je t'ai eu gros caca");
	}
	
	public void gagnerDuel() {
		this.reputation+=1;
		this.parler("Victoire mouhahahaha");
	}
	
	public void perdreDuel() {
		this.reputation-=1;
		this.perdreArgent(this.getArgent());
		this.parler("J'ai perdu zbi :(");
	}
	
	public int getReputation() {
		return this.reputation;
	}
	
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est le clan : " + this.clan);
	}
	

}
