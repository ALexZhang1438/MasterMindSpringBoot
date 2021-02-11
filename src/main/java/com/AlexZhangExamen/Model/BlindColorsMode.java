package com.AlexZhangExamen.Model;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("blindColor")
public class BlindColorsMode {
	private List<String> Colores;

	public List<String> getColores() {
		return Colores;
	}

	public void setColores(List<String> colores) {
		Colores.add("rosa");
		Colores.add("gris");
		Colores.add("blanco");
		Colores.add("negro");
		Colores.add("morado");
		Colores.add("cyan");
		Colores.add("marron");
	}
}
