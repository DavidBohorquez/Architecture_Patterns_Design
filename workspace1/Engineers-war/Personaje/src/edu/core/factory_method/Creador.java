package edu.core.factory_method;

public abstract class Creador{
public abstract Personaje metodoFabrica();
public void crear(){
	  Personaje producto = metodoFabrica();
	}
}
