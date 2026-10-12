package personnages;

import objets.Chaudron;

public class Druide {
    private String nom;
    private Integer force;
    private Chaudron chaudron;
    
    public Druide(String nom, Integer force) {
        this.nom = nom;
        this.force = force;
        this.chaudron = new Chaudron(); 
    }
    public void parler(String texte) {
    	System.out.println(prendreParole() + texte);
    }

    private String prendreParole() {
         return "Le Druide " + nom + " : ";
    }

    public void fabriquerPotion(Integer quantite, Integer forcePotion) {
    	chaudron.remplirChaudron(quantite, forcePotion);
        parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
    }

    public void booster(Gaulois gaulois) {
    	Boolean contientPotion = chaudron.resterPotion();
        String nomGaulois = gaulois.getNom();
        
        if (contientPotion) {
            if ("Obélix".equals(nomGaulois)) {
                parler("Non, " + nomGaulois + " Non !... Et tu le sais très bien !");
            } else {
                Integer forcePotion = chaudron.prendreLouche();
                gaulois.boirePotion(forcePotion);
                parler("Tiens " + nomGaulois + " un peu de potion magique.");
            }
        } else {
            parler("Désolé " + nomGaulois + " il n'y a plus une seule goutte de potion.");
            }
    }

    public String getNom() {
        return nom; 
    }
}
