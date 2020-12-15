package EXERCICES.EX3;

public class Etudiant {

	private Long id;
	private String nom;
	private String prenom;
	private double note1;
	private double note2;

	public Etudiant(Long id, String nom, String prenom, double note1, double note2) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.note1 = note1;
		this.note2 = note2;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNote1(double note1) {
		this.note1 = note1;
	}

	public void setNote2(double note2) {
		this.note2 = note2;
	}

	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public double getNote1() {
		return note1;
	}

	public double getNote2() {
		return note2;
	}
}
