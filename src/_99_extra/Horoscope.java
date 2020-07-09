package _99_extra;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String StarSign = JOptionPane.showInputDialog("What is your star sign?");
	if (StarSign.contentEquals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "You cannot live in other peoples realities and it isnt an option to dream out of the world that surrounds you. \nKeep your physiology as clear as possible and think about approaches to your \nroutine that will cleanse your world of unnecessary and self-destructive ways.\n" + 
				"\n" + 
				"Some beliefs are only holding you down, repeated numerous times and received a form that puts\n weight on your shoulders. You need more and it is perfectly all right to ask for more and\n search for ways to feed your needs.");
	}
	else if (StarSign.contentEquals("Pisces")) {
		JOptionPane.showMessageDialog(null, "There is an area in the middle of the Pacific Ocean known as the White Shark Café, where white sharks gather for\n reasons that we dont understand yet. Not knowing what is going on in shoes of other\n people and heads that arent your own, you could be puzzled \nby information that reaches you.\n" + 
				"\n" + 
				"Numerous things are going on around you, even if you cant \nreally see the progress or the actual circumstances changing every day.");
	}
	else if (StarSign.contentEquals("Aries")) {
		JOptionPane.showMessageDialog(null, "You arent exactly in the mood to spill out all support and resources on other peoples problems until you have handled your own. Make sure you arent pushing\n yourself to give more than you have taken for yourself, aware that you must remain your own priority at all times.\n" + 
				"\n" + 
				"The set of responsibilities goes selflessly forwards \nonly towards your children and creative efforts that you wish\n to commit to. Work towards the future and invest in it smartly.");
	}
	else if (StarSign.contentEquals("Taurus")) {
		JOptionPane.showMessageDialog(null, "The past and the future intertwine today, making you worried and pushing you off guard. \nSome things have been lost along the way, but this doesnt mean you have lost the capacity to feel certain things and\n find the confidence and the energy to succeed in your current projects.\n" + 
				"\n" + 
				"With enough time on your hands, you would do miracles, but this way, \nyou must set priorities and move with them. Set things in order so you can achieve your own promise \nto you and leave everything else aside for the time being.");
	}
	else if (StarSign.contentEquals("Gemini")) {
		JOptionPane.showMessageDialog(null, "The oldest factory for perfume production was found in Cyprus\n and dated back to the Bronze Age. You can trace back your own history and it would be a good idea \nto close certain doors in order for other ones to open in front of you,\n but you still have certain ties to set free from.\n" + 
				"\n" + 
				"It seems impossible to deal with things on a rational plane, as your heart is calling them in and \nmaking you hesitant about the future that you wish to create. Seek balance instead of overthinking.");
	}
			
		else if (StarSign.contentEquals("Cancer")) {
			JOptionPane.showMessageDialog(null, "You dont fully understand the mental concepts of your current situation, and you need more time to learn and\n try to comprehend what is going on in your inner world. \nAlthough you cant have a hold of all your states and conditions, \nyou can rationally work your way through burning issues.\n" + 
					"\n" + 
					"This is a good moment for therapy and alternative methods of healing, \nas well as all sorts of self-help books and courses that will allow you to dive out and move on.");
	}
		else if (StarSign.contentEquals("Leo")) {
			JOptionPane.showMessageDialog(null, "Although you may be wondering what someone will consider normal, you are finally ready to do things freely \nand separate from all opinions and conclusions coming from the outer world. You normally respect authority and understand\n that the final call must come from within, but there has been a lot of moving and strange \nsituations that threw you off track lately.\n" + 
					"\n" + 
					"To be as realistic as you wish to be, you must assess any situation with no rush,\n asking yourself what fits your internal voice and makes you calm over time.");
		}
			else if (StarSign.contentEquals("Virgo")) {
				JOptionPane.showMessageDialog(null, "More than $30 million were spent by Mark Zuckerberg so he would buy all neighboring houses. Ready and willing to evolve, you could be pushed\n to spend a lot more on some of\n your ideals than you have planned or anticipated, but you will still feel satisfied as time goes on.\n" + 
						"\n" + 
						"Investments you make today are meant to pay off over time, \nbut some should be done out of pure pleasure. Create balance instead of seeking only practical sides \nof your approach.");
}
}
}

