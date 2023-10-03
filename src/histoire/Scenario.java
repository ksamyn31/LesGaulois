package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Gaulois obelix = new Gaulois("Ob�lix",25);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide ("Panoramix",5,10);
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		int effetPotion=panoramix.preparerPotion(panoramix.getEffetPotionMin(),panoramix.getEffetPotionMax());
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.boirePotion(effetPotion);
		asterix.parler("Bonjour");
		minus.parler("UNA GAU.. UN GAUGAU...");
		asterix.frapper(minus);	

	}

}

