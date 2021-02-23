package edu.core.observer;

public class ConcretObserver extends Observer {
	private ConcretSubject subject;
	private Object estadoDeObservador;

	public void setSubject(ConcretSubject subject) {
		this.subject = subject;
	}

	public void update() {
		estadoDeObservador = subject.getEstado();
	}
}