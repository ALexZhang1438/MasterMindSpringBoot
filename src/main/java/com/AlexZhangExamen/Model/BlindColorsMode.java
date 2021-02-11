package com.AlexZhangExamen.Model;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("blindColor")
public class BlindColorsMode extends ColorList{
	public BlindColorsMode() {
		setColores(Arrays.asList("rosa", "gris", "blanco", "negro", "morado", "cyan", "marron"));
	}
}
