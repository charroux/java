package tp2;

public class Main {
	
	public static void main(String[] args) {
		MonDossierMedical dossierMedical = new MonDossierMedical(10);	// dossierMedical objet du type MonDossierMedical
		// dossierMedical.age = 0; erreur age est private
		dossierMedical.anniversaire();
		int age = dossierMedical.getAge();
		System.out.println("age = " + age);
		dossierMedical.setAge(0);
		age = dossierMedical.getAge();
		System.out.println("age = " + age);
		
	}

}
