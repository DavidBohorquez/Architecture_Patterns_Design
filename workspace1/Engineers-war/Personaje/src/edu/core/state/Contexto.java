package edu.core.state;


public class Contexto {
	private EstadoPersonaje estadoComando;

	public Contexto(EstadoPersonaje estadoComando) {
		this.estadoComando = estadoComando;
	}

	public void peticion() {
		estadoComando.manejar();
	}
}