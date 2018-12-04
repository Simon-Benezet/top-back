package dev.top.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collegue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String photo;
	private String nom;
	private Avis avis;
	private int score;

	public Collegue() {

	}

	public Collegue(String photo, String nom, Avis avis, int score) {
		super();
		this.photo = photo;
		this.nom = nom;
		this.avis = avis;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Avis getAvis() {
		return avis;
	}

	public void setAvis(Avis avis) {
		this.avis = avis;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
