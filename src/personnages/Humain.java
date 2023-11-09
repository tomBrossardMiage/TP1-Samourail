package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain (String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler(String texte) {
		System.out.println(this.nom+"- " + texte);
	}
	
	public void bonjour() {
		parler("Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du " + this.boisson);
	}
	public void boire() {
		parler("Mmmm, un bon verre de" + this.boisson + "! GLOUPS !");
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getBoisson() {
		return this.boisson;
	}
	
	public void gagnerArgent(int flouze) {
		this.argent += flouze;
	} 
	
	public void perdreArgent(int flouze) {
		this.argent -= flouze;
	}
	
	
}
