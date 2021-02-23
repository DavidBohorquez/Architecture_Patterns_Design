package edu.presentacion.abstract_factory;

public class FabricaBackground2 extends FabricaAbstractaBackgrounds {
	public ProductoAbstractoA crearProductoA(int x, int y) {
		return new BackgroundA2(x,y);
	}

	public ProductoAbstractoB crearProductoB(int x, int y) {
		return new BackgroundB2(x,y);
	}
}
