package edu.cableado;

import java.awt.Component;
import java.awt.Graphics;

public interface IEscenario {

	Component crear();

	void mostrar(IPintable p);

	Graphics pincel();
}
