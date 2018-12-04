package dev.top.entities;

public class Action {
	public enum Avis {
		AIMER, DETESTER
	};

	private Avis action;

	public Action() {
	}

	public Avis getAction() {
		return action;
	}

	public void setAction(Avis action) {
		this.action = action;
	}

}
