package edu.presentacion.command;

public class MovDer extends Command {

	private Derecha der;

	public MovDer(Derecha der) {
		this.der = der;
	}

	@Override
	public void ejecutar() {
		der.mover();
	}

}
