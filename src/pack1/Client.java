package pack1;

public class Client {
	private int codeCl;
	private String prenom, nom, addresse;
	private int tel;
	
	public Client() {
		super();
	}

	public Client(int codeCl, String prenom, String nom, String addresse, int tel) {
		super();
		this.codeCl = codeCl;
		this.prenom = prenom;
		this.nom = nom;
		this.addresse = addresse;
		this.tel = tel;
	}

	public int getCodeCl() {
		return codeCl;
	}

	public void setCodeCl(int codeCl) {
		this.codeCl = codeCl;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
