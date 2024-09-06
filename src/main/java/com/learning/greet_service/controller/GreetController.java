package com.learning.greet_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learning.greet_service.utility.JokesUtility;

@Controller
public class GreetController {

	@GetMapping("/")
	public String getPj(Model model) {
		updateRandomPjToModel(model);
		return "jokes.html";
	}

	@GetMapping("/update-pj")
	public String updatePj(Model model) {
		updateRandomPjToModel(model);
		return "short-pj.html";
	}

	private void updateRandomPjToModel(Model model) {
		String[] pj = JokesUtility.getRandomJoke();
		try {
			model.addAttribute("pj", pj[0] + " ?");
			model.addAttribute("pja", pj[1]);

		} catch (ArrayIndexOutOfBoundsException e) {
			model.addAttribute("pj","Why don’t eggs tell jokes" + " ?");
			model.addAttribute("pja", "They’d crack each other up.");
		}
	}

}
