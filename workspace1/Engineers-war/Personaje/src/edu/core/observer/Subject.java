package edu.core.observer;

import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;

public abstract class Subject {
	
	private List<Observer> observadores;

	public Subject() {
		this.observadores = new ArrayList<Observer>();
	}

	public void atar(Observer ob) {
		observadores.add(ob);
	}

	public void desatar(Observer ob) {
		observadores.remove(ob);
	}

	public void notificar() {
		//para todos los observadores
		for (Observer obs : observadores) {
			obs.update();
		}
	}
}
