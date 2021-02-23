package edu.logica.composite;

import edu.logica.Derecha;

public class Leaf extends Component {
	public void move() {
		
		Derecha der = new Derecha();
		der.orientarDerecha();
		der.velocidad();
		
	}
}
