package edu.logica.composite;

import java.util.List;
import java.util.ArrayList;

public class Composite extends Component{
	
	private List<Component> son = new ArrayList<Component>();

	public void move() {
		for (Component c : son) {
			c.move();
		}
	
	}
	
	public void add(Component compo) {
		son.add(compo);
	}

	public void delete(Component compo) {
		son.remove(compo);
	}

	public Component getSon(int s) {
		return son.get(s);
	}


}

