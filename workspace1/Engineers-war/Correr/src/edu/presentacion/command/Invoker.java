package edu.presentacion.command;

public class Invoker {
	private Command comando;

	public Invoker(Command comando) {
		this.comando = comando;
	}

	public void click() {
		comando.ejecutar();
	}
}
