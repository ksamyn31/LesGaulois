package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
public Gaulois(String nom, int force) { 
	this.nom = nom;
	this.force = force;
	}

public String getNom() { 
	return nom;
	}

public int getForce() { 
	return force;
	}

public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
	}

private String prendreParole() {
	String texte = "Le gaulois " + nom + " : ";
	return texte;
	}

public void frapper(Romain romain) {
	System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
	romain.recevoirCoup((force / 3)*effetPotion);
}

public void boirePotion(int effetPotion) {
	parler("Merci Druide, je sens que ma force est "+effetPotion+" fois décuplée.");
}
@Override
public String toString() {  
	return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
}
public static void main(String[] args) { 
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix);
		System.out.println(asterix.nom);
		System.out.println(asterix.prendreParole());
		asterix.parler("euh oui");
		Romain remi = new Romain("Remi",1);
		asterix.frapper(remi);
		asterix.boirePotion(10);

		}

}