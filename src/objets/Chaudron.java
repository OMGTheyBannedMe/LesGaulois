package objets;

public class Chaudron {
	private Integer quantitePotion = 0;
    private Integer forcePotion = 0;

    public void remplirChaudron(Integer quantite, Integer forcePotion) {
        	this.quantitePotion = quantite;
            this.forcePotion = forcePotion;
    }

    public Boolean resterPotion() {
        return quantitePotion > 0;
    }

    public Integer prendreLouche() {
    	if (this.quantitePotion > 0) {
            this.quantitePotion--;
        }
        
        if (this.quantitePotion == 0) {
            this.forcePotion = 0; 
        }
        
        return this.forcePotion;
    }
}
