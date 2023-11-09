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
	
	

}
