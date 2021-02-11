package com.AlexZhangExamen.Model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("hard")
public class Hard extends Nivel{
	public Hard() {
		setIntentos(5);
		setNumColor(6);
	}
}
