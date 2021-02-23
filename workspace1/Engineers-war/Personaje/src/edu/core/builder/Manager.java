package edu.core.builder;

public class Manager {

	private Game construct = new Control();
	
	public void build() {
		construct.controlAvatar();
		construct.paintPicture();
	}
	
	public void director() {
		Manager man = new Manager();
		man.build();
	}
}
