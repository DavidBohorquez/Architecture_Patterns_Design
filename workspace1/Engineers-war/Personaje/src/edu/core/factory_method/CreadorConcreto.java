package edu.core.factory_method;

public class CreadorConcreto extends Creador {
	public static void main(String[] args) {
		Creador cre = new CreadorConcreto();
		cre.crear();
	}

	public Personaje metodoFabrica() {
		return new PersonajeConcreto();
	}
}
