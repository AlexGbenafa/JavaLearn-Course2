package pack1;

import java.util.Scanner;

public class Fonctions {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int factoriel(int n) {
		
		int facto =1;
		if(n==0) {
			return 1;
		}else {
		for(int i = 1; i <= n; i++ ) {
			facto = facto*i;
		}
		return facto;
		}
	}
	
	public int puissance(int a, int n) {
		int pow = 1;
		
		for(int i=1; i<=n; i++) {
			pow = pow * a;
		}
		
		return pow;
	}
	
	public void permuter(int a, int b) {
		System.out.println("Avant permutation " + "a = " + a + " " + "et b = " + b);
		int stock = a;
		a = b;
		b = stock;
		System.out.println("Apres permutation " + "a = " + a + " " + "et b = " + b);
	}
	
	
	public static void main(String arg[]) {
		int x, y;
		//Objet pour acceder aux fonctions et procedures
		Fonctions f = new Fonctions();
		
		//Instancier l'input utilisateur
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valeur de x: ");
		x = scan.nextInt();
		System.out.println("Valeur de y: ");
		y = scan.nextInt();
		
		//Appel des fonctions
		System.out.println("La somme est: " + f.add(x,y));
		System.out.println("Le factoriel est: " + f.factoriel(x));
		System.out.println("La puissance est: " + f.puissance(x,y));
		//Appel des procedures
		f.permuter(x,y);
		
	}
}
