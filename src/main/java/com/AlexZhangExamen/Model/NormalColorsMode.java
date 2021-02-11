package com.AlexZhangExamen.Model;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("normalColor")
public class NormalColorsMode extends ColorList{
	public NormalColorsMode() {
		setColores(Arrays.asList("Rojo", "azul", "verde", "amarillo", "naranja", "negro", "blanco"));
	}
}
