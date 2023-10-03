package personnages;
import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public int getEffetPotionMin() {
		return effetPotionMin;
	}
	public void setEffetPotionMin(int effetPotionMin) {
		this.effetPotionMin = effetPotionMin;
	}
	public int getEffetPotionMax() {
		return effetPotionMax;
	}
	public void setEffetPotionMax(int effetPotionMax) {
		this.effetPotionMax = effetPotionMax;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public int preparerPotion(int effetPotionMin, int effetPotionMax) {
		Random r = new Random();
		int effetPotion=r.nextInt(effetPotionMax);
		while (effetPotion<effetPotionMin) {
			effetPotion=r.nextInt(effetPotionMax);
		}
		if (effetPotion>7) {
			parler("J'ai préparé une super potion de force "+effetPotion);
		}
		else {
			parler("Je n'ai pas trouvé tous les ingredients, ma potion est seulement de force "+effetPotion);
		}
		return effetPotion;
	}
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obélix") {
			parler("Non,Oblélix !... Tu n'auras pas de potion magique !");
		}
	}
	
	public static void main(String[] args) { 
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion(panoramix.effetPotionMin,panoramix.effetPotionMax);
	}

	
}