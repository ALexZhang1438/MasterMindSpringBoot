package com.AlexZhangExamen.Model;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("normalColor")
public class NormalColorsMode extends ColorList{
	public NormalColorsMode() {
		setColores(Colores.add("rojo"));
	}
}
