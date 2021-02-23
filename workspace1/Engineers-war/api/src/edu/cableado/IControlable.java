package edu.cableado;

import java.util.EventListener;

public interface IControlable {

	EventListener configurar();

	void controlar(IControlable ic);
}
