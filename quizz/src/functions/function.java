package functions;

import questions.Questions;

public class function {

	@SuppressWarnings("unused")
	public static void listChapters() {

		// array with available chapters
		String availableChapters[] = { "Chapter3", "Chapter4", "Chapter5", "Chapter6", "Chapter7", "Chapter8" };

		// Chapters are listed one after another
		for (String chapter : availableChapters) {
			System.out.println(chapter);
		}
	}

	public static void userChoice(int choice) {

		System.out.println("Welcome to CISCO Quizz");
		System.out.println("You can choose a chapter or go through them all");
		if (choice == 1) {
			System.out.println("You chose Chapter 1");
			if (choice == 2)
				System.out.println("You chose Chapter 2");
			if (choice == 3)
				System.out.println("You chose Chapter 3");
		}
	}
}
