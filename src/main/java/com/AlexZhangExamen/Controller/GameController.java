package com.AlexZhangExamen.Controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.AlexZhangExamen.Model.ColorList;
import com.AlexZhangExamen.Model.Nivel;

@Controller
public class GameController {
	private static Logger log = LogManager.getLogger(Controller.class);

	@Autowired
	ColorList colorList;

	@Autowired
	Nivel nivel;

	private List<String> CorrectList = new ArrayList<>();
	String colorRandom;
	Integer tries;
	int tryUsed;
	private List<String> inputList = new ArrayList<>();
	String puntuacion;
	int word;
	private List<String> Winner = new ArrayList<>();

	@GetMapping("/start")
	private ModelAndView randomList(@RequestParam List<String> inputList) {
		log.debug("La respuesta a encontrar es:" + inputList);
		for (int i = 0; i < nivel.getNumColor(); i++) {
			CorrectList.add(colorRandom);
		}
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;

	}

	@GetMapping("win")
	public ModelAndView championInsert(@RequestParam String championIsHere) {
		log.debug("WinnerInsert:" + this.Winner.toString());
		ModelAndView modelAndView = new ModelAndView();
		Winner.add("Winner is " + championIsHere + " with " + tryUsed + " Try used");
		modelAndView.addObject("Winner", Winner);
		modelAndView.setViewName("hallOfTheFame");
		return modelAndView;
	}

}
