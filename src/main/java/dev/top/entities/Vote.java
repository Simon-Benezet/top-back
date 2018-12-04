package dev.top.entities;

public class Vote {

	private Collegue collegue;
	private Action avis;
	public Action getAvis() {
		return avis;
	}
	public void setAvis(Action avis) {
		this.avis = avis;
	}
	public Collegue getCollegue() {
		return collegue;
	}
	public void setCollegue(Collegue collegue) {
		this.collegue = collegue;
	}
}
