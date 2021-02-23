package edu.cableado;

public interface IMovibleDer {
	
	void orientarDerecha();
	
	void moverDer(IControlable ic);
	
	void asignarVelocidad(int velocidad);
	
	int velocidad();
}
