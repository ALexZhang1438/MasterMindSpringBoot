package com.AlexZhangExamen.Model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("normal")
public class Normal extends Nivel{
	public Normal() {
		setIntentos(10);
		setNumColores(3);
	}
}
