package tp3;

public class Passager {
	
	private String nom;
	
	public Passager(String nom) {
		this.nom = nom;
	}
	
	public  String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return "Passager [nom=" + nom + "]";
	}

}
