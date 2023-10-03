package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois [] villageois;
	private int nbVillageois=0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois=new Gaulois[nbVillageoisMaximum];
		
	}
	
	public void ajouterHabitant(Gaulois g) {
		villageois[nbVillageois]=g;
		nbVillageois++;
		
	}
	
	public Chef getChef() {
		return chef;
	}

	public Gaulois[] getVillageois() {
		return villageois;
	}

	public int getNbVillageois() {
		return nbVillageois;
	}

	public Gaulois trouverHabitant(int nbVillageois ) {
		return villageois[nbVillageois];
	}
	
	public void afficherVillageois(Chef chef){
		int i=0;
		System.out.println("Dans le village du chef "+chef.getNom()+"  vivent les l�gendaires gaulois:");
		while (i!=nbVillageois) {
			System.out.println("-"+villageois[i]);
			i++;
		}
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irr�ductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix",6, 0,village);
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Gaulois obelix = new Gaulois("Ob�lix",25);
		village.ajouterHabitant(obelix);
		village.ajouterHabitant(asterix);
		village.afficherVillageois(abraracourcix);
		//Gaulois gaulois = village.trouverHabitant(1);
		// il y a un probleme de variable qui sont dupliqu�
		//System.out.println(gaulois);
		
		
		

		
	}
}
