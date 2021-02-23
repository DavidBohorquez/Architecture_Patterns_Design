package edu.core.observer;

public class ConcretSubject extends Subject {
	
	private Object estadoDeSujeto;

	public static void main(String[] args) {
		ConcretSubject sub = new ConcretSubject();
		sub.setEstado(new Object());
		ConcretObserver obs = new ConcretObserver();
		obs.setSubject(sub);
		sub.notificar();
	}

	public Object getEstado() {
		return estadoDeSujeto;
	}

	public void setEstado(Object state) {
		this.estadoDeSujeto = state;
	}
}
