package com.AlexZhangExamen.Model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("normalColor")
public class NormalColorsMode extends ListaColor{
	public NormalColorsMode() {
		setListaColores("rojo", "azul", "verde", "amarillo", naranja,negro,blanco)
	}
}
