package com.learning.greet_service.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
	private String[] arr = null;

	{
		String pjs = "Why don’t eggs tell jokes? They’d crack each other up.\r\n"
				+ "What do you get when you cross a snowman and a dog? Frostbite.\r\n"
				+ "Why did the cookie go to the hospital? Because it felt crummy.\r\n"
				+ "What do you call a bear that's stuck in the rain? A drizzly bear.\r\n"
				+ "Why did the math book look sad? Because it had too many problems.\r\n"
				+ "How does a penguin build its house? Igloos it together.\r\n"
				+ "Why did the scarecrow become a successful neurosurgeon? He was outstanding in his field.\r\n"
				+ "What did one hat say to the other? Stay here, I’m going on ahead!\r\n"
				+ "How does a scientist freshen her breath? With experi-mints.\r\n"
				+ "Why was the baseball team always in trouble? Because they kept getting caught stealing bases.\r\n"
				+ "What’s a skeleton’s least favorite room in the house? The living room.\r\n"
				+ "Why don’t you ever see elephants hiding in trees? Because they’re so good at it.\r\n"
				+ "What do you call a fish with no eyes? Fsh.\r\n"
				+ "Why did the golfer bring extra pants? In case he got a hole in one.\r\n"
				+ "What do you get when you cross a snowman with a vampire? Frostbite.\r\n"
				+ "How do cows stay up to date with current events? They read the moos-paper.\r\n"
				+ "Why did the math teacher break up with the calculator? He felt like she was just adding to his problems.\r\n"
				+ "What do you call a sleeping bull? A bulldozer.\r\n"
				+ "Why don’t scientists trust atoms? Because they make up everything!\r\n"
				+ "What do you call a dog magician? A labracadabrador.\r\n"
				+ "Why did the bicycle fall over? It was two-tired.\r\n"
				+ "What do you call a fake noodle? An impasta.\r\n"
				+ "How do you organize a space party? You planet.\r\n"
				+ "Why don’t skeletons fight each other? They don’t have the guts.\r\n"
				+ "What do you call a group of musical whales? An orca-stra.\r\n"
				+ "What’s a skeleton’s favorite instrument? The trom-bone.\r\n"
				+ "How does a farmer count his cows? With a cow-culator.\r\n"
				+ "Why was the math book sad? It had too many problems.\r\n"
				+ "What did the grape do when it got stepped on? Nothing but let out a little wine.\r\n"
				+ "What kind of shoes do ninjas wear? Sneakers.\r\n"
				+ "What do you call cheese that isn’t yours? Nacho cheese.\r\n"
				+ "How does a snowman get around? By riding an icicle.\r\n"
				+ "Why did the coffee file a police report? It got mugged.\r\n"
				+ "What did one ocean say to the other ocean? Nothing, they just waved.\r\n"
				+ "What do you call a can opener that doesn’t work? A can’t opener.\r\n"
				+ "How do you make holy water? You boil the hell out of it.\r\n"
				+ "What do you get when you cross a snowman with a dog? Frostbite.\r\n"
				+ "Why did the scarecrow win an award? Because he was outstanding in his field.\r\n"
				+ "What do you call a bear with no teeth? A gummy bear.\r\n"
				+ "How do you catch a squirrel? Climb a tree and act like a nut.\r\n"
				+ "Why did the mushroom go to the party alone? Because he’s a fungi.\r\n"
				+ "What’s orange and sounds like a parrot? A carrot.\r\n"
				+ "Why did the bicycle stand up by itself? It was two-tired.\r\n"
				+ "What’s brown and sticky? A stick.\r\n" + "How do you organize a space party? You planet.\r\n"
				+ "What do you call a dinosaur with an extensive vocabulary? A thesaurus.\r\n"
				+ "What did the big flower say to the little flower? “Hey, bud!”\r\n"
				+ "Why did the chicken join a band? Because it had the drumsticks.\r\n"
				+ "How do you make a tissue dance? You put a little boogie in it.\r\n"
				+ "What did one wall say to the other? “I’ll meet you at the corner.”\r\n"
				+ "Why can’t you trust stairs? They’re always up to something.\r\n"
				+ "What did the left eye say to the right eye? “Between you and me, something smells.”\r\n"
				+ "Why did the computer go to the doctor? It had a virus.\r\n"
				+ "How does a scientist freshen her breath? With experi-mints.\r\n"
				+ "What do you call an alligator in a vest? An investigator.\r\n"
				+ "Why don’t ants get sick? Because they have tiny ant-bodies.\r\n"
				+ "What do you call a fish wearing a bowtie? Sofishticated.\r\n"
				+ "Why did the tomato turn red? Because it saw the salad dressing.\r\n"
				+ "What do you call a lazy kangaroo? A pouch potato.\r\n"
				+ "How does a penguin build its house? Igloos it together.\r\n"
				+ "What did one plate say to the other plate? “Lunch is on me.”\r\n"
				+ "Why did the golfer bring two pairs of pants? In case he got a hole in one.\r\n"
				+ "How does a lion greet the other animals? “Pleased to eat you!”\r\n"
				+ "Why did the bicycle fall over? It was two-tired.\r\n"
				+ "What do you call a dog magician? A labracadabrador.\r\n"
				+ "What do you call a cow with no legs? Ground beef.\r\n"
				+ "Why did the coffee file a police report? It got mugged.\r\n"
				+ "What did one hat say to the other hat? “Stay here, I’m going on ahead!”\r\n"
				+ "How do you organize a space party? You planet.\r\n"
				+ "What did one ocean say to the other ocean? Nothing, they just waved.\r\n"
				+ "Why did the scarecrow become a successful neurosurgeon? He was outstanding in his field!\r\n"
				+ "What do you call a snowman with a six-pack? An abdominal snowman.\r\n"
				+ "Why don’t some couples go to the gym? Because some relationships don’t work out.\r\n"
				+ "What did one wall say to the other wall? “I’ll meet you at the corner.”\r\n"
				+ "What’s brown and sticky? A stick.\r\n"
				+ "Why don’t you ever see elephants hiding in trees? Because they’re so good at it.\r\n"
				+ "What did one grape say to the other grape? “Stop playing around, we’re in a jam!”\r\n"
				+ "How do cows stay up to date with current events? They read the moos-paper.\r\n"
				+ "What do you call a fish with no eyes? Fsh.\r\n"
				+ "What did the zero say to the eight? “Nice belt!”\r\n"
				+ "How does a scientist freshen her breath? With experi-mints.\r\n"
				+ "What do you call a bear with no teeth? A gummy bear.\r\n"
				+ "Why did the math teacher break up with the calculator? He felt like she was just adding to his problems.\r\n"
				+ "What’s a vampire’s favorite fruit? A necktarine.\r\n"
				+ "Why did the golfer bring two pairs of pants? In case he got a hole in one.\r\n"
				+ "What did the big flower say to the little flower? “Hey, bud!”\r\n"
				+ "What do you call a fake noodle? An impasta.\r\n"
				+ "Why did the computer go to the doctor? It had a virus.\r\n"
				+ "What do you call a dinosaur that is sleeping? A dino-snore!\r\n"
				+ "Why don’t eggs tell jokes? They’d crack each other up.\r\n"
				+ "What do you call a bear stuck in the rain? A drizzly bear.\r\n"
				+ "How does a farmer count his cows? With a cow-culator.\r\n"
				+ "What do you call a fish with no eyes? Fsh.\r\n"
				+ "Why don’t some couples go to the gym? Because some relationships don’t work out.\r\n"
				+ "What do you get when you cross a snowman with a dog? Frostbite.\r\n"
				+ "Why did the scarecrow win an award? Because he was outstanding in his field.\r\n"
				+ "What do you call cheese that isn’t yours? Nacho cheese.\r\n"
				+ "How do you make holy water? You boil the hell out of it.\r\n"
				+ "What do you get when you cross a snowman and a vampire? Frostbite.\r\n"
				+ "How do you make a tissue dance? You put a little boogie in it.";
		arr = pjs.split("\r");
	}

	private String getRandomPj() {
		Random r = new Random();
		int randomPj = r.nextInt(arr.length - 1);
		return arr[randomPj];
	}


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
		String randomPj = getRandomPj();
		String[] pj = randomPj.split("\\?");
		model.addAttribute("pj", pj[0]+" ?");
		model.addAttribute("pja", pj[1]);
	}

}
