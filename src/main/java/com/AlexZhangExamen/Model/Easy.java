package com.AlexZhangExamen.Model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("easy")
public class Easy extends Nivel{
	public Easy(){
		setIntentos(20);
		setNumColor(3);
	}
}
