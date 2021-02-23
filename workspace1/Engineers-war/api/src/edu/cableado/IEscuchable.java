package edu.cableado;

import java.util.EventListener;

public interface IEscuchable {

	EventListener escuchar();

	void escuchar(IEscuchable ie);
}
