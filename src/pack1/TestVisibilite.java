package pack1;

public class TestVisibilite {
		
	public static void main(String arg[]) {
		Etudiant et = new Etudiant();
		System.out.println(et.getNom());
		
		et.setAdresse("London");
		System.out.println(et.getAdresse());
		
		Etudiant et2 = new Etudiant("Nguemi", "Nathan");
		System.out.println(et2.getNom() + " " + et2.getPrenom());
		
	}
}
