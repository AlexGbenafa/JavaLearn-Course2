package pack1;
import java.util.Date;

public class Etudiant {
	//Field definition
	private int id = 10;
	private String nom = "Gbenafa";
	private String prenom = "Alex";
	private Date date;
	private String adresse;
	private int num;
	
	//Constructor without parameters
	public Etudiant() {
		
	}
	
	//Constructor with parameters
	public Etudiant(int id, String nom, String prenom, Date date, String adresse, int num) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.adresse = adresse;
		this.num = num;
	}
	
	//Generate a specific constructor
	public Etudiant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	//Define getter
	public int getId() {return id;}
	
	//Define getter
	public String getNom() {return nom;}
	
	//Define getter
	public String getPrenom() {return prenom;}
	
	//Define getter
	public Date getDate() {return date;}
	
	//Define getter
	public String getAdresse() {return adresse;}
	
	//Define getter
	public int getNum() {return num;}
	
	
	//Define setter
	public void setId(int id) {
		this.id = id;
	}
	
	//Define setter
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//Define setter
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	//Define setter
	public void setDate(Date date) {
		this.date = date;
	}
	
	//Define setter
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	//Define setter
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	public static void main(String arg[]) {
		System.out.println("Wagwan?");
		
		//Instance of constructor without parameters
		Etudiant et = new Etudiant();
		System.out.print(et.nom);
	}
	
	
}