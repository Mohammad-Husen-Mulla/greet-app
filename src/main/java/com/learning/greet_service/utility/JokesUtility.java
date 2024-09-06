package com.learning.greet_service.utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class JokesUtility {
	private static Random r = new Random();

	public static String[] getRandomJoke() {

		String spicyJokes = "Why did the tomato turn red?  It saw the salad dressing.\r\n"
				+ "Why shouldn’t you write with a broken pencil? Because it’s pointless.\r\n"
				+ "What do you call two monkeys that share an Amazon account? Prime mates.\r\n"
				+ "Why are teddy bears never hungry? Because they’re always stuffed!\r\n"
				+ "Why did the tree go to the dentist? It needed a root canal.\r\n"
				+ "If athletes get athlete’s foot, what do elves get? Mistle-toes.\r\n"
				+ "Why couldn’t the pony sing? Because she was a little hoarse.\r\n"
				+ "Where do cows go for entertainment? The mooooo-vies!How does NASA organize a party? They planet.\r\n"
				+ "Why did Adele cross the road?  To sing, “Hello from the other side!\r\n"
				+ "What runs around a yard without actually moving? A fence.\r\n"
				+ "What’s an astronaut’s favorite candy? A Mars bar.\r\n"
				+ "Where do sheep go to get their hair cut?  The baa-baa shop.\r\n"
				+ "Why are there gates around cemeteries? Because people are dying to get in.\r\n"
				+ "What do you get when you cross a snake with a pie? A pie-thon!\r\n"
				+ "Why is Peter Pan always flying? He Neverlands.How does NASA organize a party? They planet.\r\n"
				+ "Why did Adele cross the road?  To sing, “Hello from the other side!\r\n"
				+ "What runs around a yard without actually moving? A fence.\r\n"
				+ "What’s an astronaut’s favorite candy? A Mars bar.\r\n"
				+ "Where do sheep go to get their hair cut?  The baa-baa shop.\r\n"
				+ "Why are there gates around cemeteries? Because people are dying to get in.\r\n"
				+ "What do you get when you cross a snake with a pie? A pie-thon!\r\n"
				+ "Why is Peter Pan always flying? He Neverlands.\r\n"
				+ "What’s the most musical part of the chicken? The drumstick.";

		String goodOnes = "What did the tie say to the hat? You go on ahead. I’ll hang around.\r\n"
				+ "What do you call a musician with problems? A trebled man.\r\n"
				+ "What washes up on very small beaches? Micro-waves.\r\n"
				+ "What do you call a belt with a watch on it? A waist of time.\r\n"
				+ "What did the grape do when it got stepped on? It let out a little wine.\r\n"
				+ "What did the snail who was riding on the turtle’s back say? Wheeeee!\r\n"
				+ "What do you call a lazy kangaroo? A pouch potato.\r\n"
				+ "What does a pig put on dry skin? Oinkment.\r\n"
				+ "What do you call it when a snowman throws a tantrum? A meltdown.\r\n"
				+ "How do you open a banana? With a mon-key.\r\n"
				+ "Why do oranges wear sunscreen? So they don’t peel.\r\n"
				+ "What did the mama tomato say to the baby tomato? Catch up!\r\n"
				+ "How did the pig get to the hogspital? In a hambulance.\r\n"
				+ "Why does Humpty Dumpty love autumn? Because he had a great fall.\r\n"
				+ "What do you call a pudgy psychic? A four-chin teller.\r\n"
				+ "What do you get when you mix a cocker spaniel, a poodle, and a ghost? A cocker-poodle boo.\r\n"
				+ "How do celebrities stay cool? They have many fans.\r\n"
				+ "How much money does a pirate pay for corn? A buccaneer.\r\n"
				+ "Where do young trees go to learn? Elementree school.\r\n"
				+ "What do you call a hippie’s wife? Mississippi.\r\n"
				+ "How can you tell it’s a dogwood tree? By the bark.\r\n"
				+ "What’s the stinkiest planet? Poopiter.\r\n"
				+ "What did the full glass say to the empty glass? You look drunk.\r\n"
				+ "Did you hear the one about the roof? Never mind, it’s over your head.\r\n"
				+ "What’s the best smelling insect? A deodor-ant.\r\n"
				+ "Why did the can crusher quit his job? Because it was soda pressing.\r\n"
				+ "What do you call someone who doesn’t like carbs? Lack-Toast Intolerant.\r\n"
				+ "Why did the birthday boy wrap himself in paper? He wanted to live in the present.\r\n"
				+ "What’s a potato’s favorite form of transportation? The gravy train.\r\n"
				+ "Why did the woman go on the date with the mushroom? Because he was a fun-ghi.\r\n"
				+ "Why does Snoop Dogg use an umbrella? Fo drizzle.\r\n"
				+ "Why is it impossible to starve in the desert? Because of all the sand which is there!\r\n"
				+ "Why can’t Chuck Norris use the internet? Because he won’t submit.\r\n"
				+ "What do you call a dog that’s been run over by a steamroller? Spot!\r\n"
				+ "How does Lady Gaga like her steak? (sing) Raw-raw-raw-ra-ah-aww.\r\n"
				+ "What did the cheese say when it looked in the mirror? Haloumi!\r\n"
				+ "Why did the developer go broke? Because he used up all his cache.\r\n"
				+ "Why did the ghost go to rehab? He was addicted to boos.\r\n"
				+ "What’s orange and sounds like a parrot? A carrot!\r\n"
				+ "What do you call a dinosaur with only one eye? A Do-you-think-he-saw-us!\r\n"
				+ "What do you call sad coffee? Despresso.\r\n" + "What do you give to a sick lemon? Lemon aid!\r\n"
				+ "Why are pirates called pirates? Because they arrgh!\r\n"
				+ "What don’t ants get sick? They have anty-bodies.\r\n"
				+ "What type of candy is always late? A chocolate.\r\n"
				+ "What sound does a nut make when it sneezes? Ca-shew!\r\n"
				+ "What do you call a Frenchman wearing sandals? Phillipe Phillope.\r\n"
				+ "The past, present and future walked into a bar. It was tense.\r\n"
				+ "What do you call someone who can’t stick with a diet? A desserter.\r\n"
				+ "Which table fits in the fridge? VegeTABLE.\r\n"
				+ "Hear about the new restaurant called Karma? There’s no menu: You get what you deserve.\r\n"
				+ "Is Google male or female? Female, because it doesn’t let you finish a sentence before making a suggestion.\r\n"
				+ "What do you call it when you walk into a cafe you’re sure you’ve been to before? Déjà brew.\r\n"
				+ "How do you make holy water? You boil the hell out of it.\r\n"
				+ "Are you a cheetah? No, you lion!\r\n" + "Which bus never drove on any street? The globus.\r\n"
				+ "Where does the General keep his armies? In his sleevies!\r\n"
				+ "How do you get Pikachu on a bus? Poke him on.\r\n"
				+ "Why doesn’t the sun go to college? Because it has a million degrees!\r\n"
				+ "How did the hipster burn his mouth? He ate the pizza before it was cool.\r\n"
				+ "What’s red and moves up and down? A tomato in an elevator.\r\n"
				+ "Why can’t you hear a pterodactyl go to the bathroom? Because the “P” is silent!\r\n"
				+ "How did the blonde die ice fishing? She was hit by the zamboni.\r\n"
				+ "What do Alexander the Great and Winnie the Pooh have in common? Same middle name.\r\n"
				+ "Why did the nurse need a red pen at work? In case she needed to draw blood.\r\n"
				+ "What do you call a rooster staring at a pile of lettuce? A chicken sees a salad.\r\n"
				+ "Why don’t Calculus majors throw house parties? Because you should never drink and derive.\r\n"
				+ "Where are average things manufactured? The satisfactory.";

		String poorPerson = "Why did the poor man only play hide and seek with his bills? Because he always lost.\r\n"
				+ "What’s a poor person’s favorite meal? Leftovers. \r\n"
				+ "Why did the poor man take a ladder to the bar? Because he heard the drinks were on the house.\r\n"
				+ "What’s a poor person’s favorite game at the casino? Find the exit.\r\n"
				+ "Why did the poor man only have one shoe? Because he couldn’t afford the other one. \r\n"
				+ "Why did the poor man bring a ladder to the bar? He heard the drinks were on the house.\r\n"
				+ "What’s a poor person’s favorite exercise? Running out of money.\r\n"
				+ "Why don’t poor people play hide and seek? Because good luck hiding when the landlord comes knocking.\r\n"
				+ "What did the poor man say when he found a penny? Jackpot!\r\n"
				+ "Why don’t poor people play chess? Because they can’t afford the checkmate.\r\n"
				+ "What’s a poor person’s favorite card game? 52 Pickup.\r\n"
				+ "Why did the poor man become an astronaut? He heard there was no atmosphere.\r\n"
				+ "Why was the poor man’s vacation always short? He couldn’t afford the long stay.\r\n"
				+ "What’s a poor person’s favorite holiday? April 15th.\r\n"
				+ "Why did the poor man become a tailor? He was always good at sewing holes\r\n"
				+ "What’s a poor person’s favorite accessory? A coupon.\r\n"
				+ "Why did the poor man become a gardener? He heard money grows on trees.\r\n"
				+ "What’s a poor person’s favorite board game? Monopoly, because it’s the only time they can own property.\r\n"
				+ "Why did the poor man start a band? He heard it was a good way to make ends meet.\r\n"
				+ "Why did the poor man’s phone go to voicemail? Because he couldn’t afford the ring.\r\n"
				+ "What’s a poor person’s favorite music? Country, because it’s all about losing everything.\r\n"
				+ "Why did the poor man become a comedian? Because he was already living the punchline.\r\n"
				+ "What’s a poor person’s favorite part of the newspaper? The classifieds.\r\n"
				+ "Why did the poor man open a bakery? He kneaded the dough.\r\n"
				+ "What’s a poor person’s favorite type of transportation? The bus, because it’s always on the road to broke.\r\n"
				+ "Why did the poor man become a referee? He was used to making tough calls.\r\n"
				+ "What’s a poor person’s favorite movie? Brokeback Mountain.\r\n"
				+ "Why did the poor man start a petting zoo? He heard goats were easy to keep.\r\n"
				+ "What’s a poor person’s favorite pickup line? “Are you a bank loan? Because you have my interest.” \r\n"
				+ "Why did the poor man become a chef? He was always cooking the books.\r\n"
				+ "Why did the poor man bring a ladder to the grocery store? Because he heard they had high prices.\r\n"
				+ "What’s a poor person’s favorite magic trick? Turning empty pockets inside out.\r\n"
				+ "Why did the poor man become a photographer? He was always good at capturing the moment before the bill arrived.\r\n"
				+ "What’s a poor person’s favorite sport? Window shopping.\r\n"
				+ "Why did the poor man become a weather forecaster? He was used to predicting storms in his finances.\r\n"
				+ "What’s a poor person’s favorite app? LinkedIn, hoping for a better job.\r\n"
				+ "Why did the poor man become a lifeguard? He was used to swimming in debt.\r\n"
				+ "What’s a poor person’s favorite bedtime story? Jack and the Bankruptcy.\r\n"
				+ "Why did the poor man become a beekeeper? He heard there was a buzz about honey’s health benefits.\r\n"
				+ "What’s a poor person’s favorite exercise equipment? The treadmill, because they’re always running out of money.";
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

		try {
			
	
		String allJokes = pjs.concat(goodOnes).concat(spicyJokes).concat(poorPerson);
		String[] jokesArray = allJokes.split("\r");
		List<String> pjList = Arrays.asList(jokesArray).stream().distinct().collect(Collectors.toList());
		Collections.shuffle(pjList);
		jokesArray = pjList.toArray(jokesArray);

		int randomIndex = r.nextInt(jokesArray.length - 1);
		String jokeQNS = jokesArray[randomIndex];
		return jokeQNS.split("\\?");	
		
		}catch (Exception e) {
			return new String[] {"What do you call a dinosaur that is sleeping?", "A dino-snore!"};
		}
	}
}
