package personnages;

public class Romain {
	private String nom;
	private int force=0;
	private Equipement[] equipements;
	private int nbEquipement=0;
	
	private boolean isForcePositive() {
		return force>0;
	}
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isForcePositive();
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert isForcePositive();
		force = force - forceCoup;
		if (force > 0) {
		parler("Aïe");
		assert isForcePositive();
		} 
		else {
		parler("J'abandonne...");
		assert isForcePositive();
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		
	
	}
}