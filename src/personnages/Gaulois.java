package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.setForce(force);
		}
		public String getNom() {
		return nom;
		}
		public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		}
		private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
		public int getForce() {
			return force;
		}
		public void setForce(int force) {
			this.force = force;
		}
		public static void main(String[] args) {
			Gaulois asterix= new Gaulois("Astérix", 8);
			System.out.println(asterix);
		}
		@Override
		public String toString() {
			return "Gaulois [nom=" + nom + ", force=" + force + ", getNom()=" + getNom() + ", prendreParole()="
					+ prendreParole() + ", getForce()=" + getForce() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		
}

