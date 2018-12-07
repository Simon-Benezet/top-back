package dev.top.entities;

public class AjoutCollegue {

	private String matricule;
	private String pseudo;
	private String photo;

	public AjoutCollegue(String matricule, String pseudo, String photo) {
		super();
		this.matricule = matricule;
		this.pseudo = pseudo;
		this.photo = photo;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
