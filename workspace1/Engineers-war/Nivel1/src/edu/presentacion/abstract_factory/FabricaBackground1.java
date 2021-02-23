package edu.presentacion.abstract_factory;

public class FabricaBackground1 extends FabricaAbstractaBackgrounds {
	public ProductoAbstractoA crearProductoA(int x, int y) {
		return new BackgroundA1(x, y);
	}

	public ProductoAbstractoB crearProductoB(int x, int y) {
		return new BackgroundB1(x, y);
	}
}
