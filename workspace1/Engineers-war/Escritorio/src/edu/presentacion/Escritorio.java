package edu.presentacion;

import java.awt.Component;

import edu.cableado.IEntrada;
import edu.cableado.IEscenario;
import edu.cableado.IPersonaje;
import edu.cableado.IPintable;
import edu.cableado.ISalida;

public class Escritorio implements IEscenario, IEntrada, ISalida{
	
	BoardView tablero;

	@Override
	public Component crearEscenario() {
		if(tablero == null) {
			System.out.println("ESCENARIO CREADO..............");
			tablero = new BoardView();
		}
		return tablero.getLienzo();
	}
	
	public void pintar(IPersonaje p) {
		
	}

	@Override
	public void activar(IPintable p) {
		tablero.getLienzo().setTrazo(p);
		tablero.getLienzo().repaint();
	}

	@Override
	public void desplegarInformacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibirInformacion() {
		// TODO Auto-generated method stub
		
	}
	
}
