package village_gaulois;

import personnages.Gaulois;

public class Village {
    private String nom;
    private Integer nbVillageois = 0;
    
    private Gaulois chef;
    private Gaulois[] villageois;

    public Village(String nom, int nbVillageoisMax, Gaulois chef) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMax];
        this.chef = chef;
        this.chef.setVillage(this); 
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            gaulois.setVillage(this);
            nbVillageois++;
        }
    }

    public Gaulois trouverVillageois(Integer numVillageois) {
        if (numVillageois <= 0 || numVillageois > nbVillageois) {
            System.out.println("Il n'y a pas autant d'habitants dans notre village !");
            return null;
        }
        return villageois[numVillageois - 1]; 
    }

    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom() + "\nvivent les légendaires gaulois :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }

    public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", 30, abraracourcix);
        
        village.trouverVillageois(30); 
        
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);
        
        Gaulois gaulois = village.trouverVillageois(1);
        System.out.println(gaulois.getNom()); 
        
        gaulois = village.trouverVillageois(2);
        System.out.println(gaulois); 
        
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        
        village.afficherVillageois();
        
        Gaulois doublePolemix = new Gaulois("Doublepolémix", 4);
        
        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublePolemix.sePresenter();
    }
}