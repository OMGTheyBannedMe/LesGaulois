package personnages;

import objets.Equipement;

public class Romain {
    private String nom;
    private int force;
    
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
        assert isInvariantVerified() : "La force d'un Romain est toujours positive";
    }

    public String getNom() {
        return nom;
    }

    private boolean isInvariantVerified() {
        return force >= 0;
    }

    private String prendreParole() {
        return "Le romain " + nom + " : ";
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force < 1) {
            force = 0;
            parler("J'abandonne !");
        } else {
            parler("Aïe");
        }
        assert isInvariantVerified() : "La force d'un Romain est toujours positive";
    }

    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 2:
                System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                break;
            case 1:
                if (equipements[0] == equipement) {
                    System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
                } else {
                    ajouterEquipement(equipement);
                }
                break;
            case 0:
                ajouterEquipement(equipement);
                break;
        }
    }

    private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
    }

    public static void main(String[] args) {
        Romain minus = new Romain("Minus", 6);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
    }
}