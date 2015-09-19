package functions;

import java.util.List;
import java.util.Scanner;

import questions.Questions;

public class function {

	static int chapterNumber = 1;
	static int questionNumber = 1;
	static String readyQuestionAnswer;
	static Scanner input = new Scanner(System.in);

	public static String[] listChapters() {

		// array with available chapters
		String availableChapters[] = { "Chapter3", "Chapter4", "Chapter5", "Chapter6", "Chapter7", "Chapter8",
				"Chapter9", "Chapter10", "Chapter11" };

		// Chapters are listed one after another
		for (String chapter : availableChapters) {
			String displayChapterNumber = chapterNumber++ + "." + chapter;
			System.out.println(displayChapterNumber);
		}

		return availableChapters;
	}

	@SuppressWarnings({})
	public static void userChoice() {

		// int choice ;
		System.out.println("Welcome to CISCO Quizz");
		System.out.println("-------------");

		// show user available chapters
		System.out.println("Please select a Chapter or all to be quizzed from: ");
		System.out.println("*******");
		listChapters();
		// input box
		System.out.println("Your Chapter of choice is : ");

		int choice = userInput();

		if (choice == 1) {

			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 3");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println("Type 'Ready' when you want to start the quizz");

			// if(readyQuestionAnswer.toLowerCase().equals("ready"))

			for (int i = 0; i < Questions.chapter3Questions().size(); i++) {

				String continueQuizz = input.nextLine();
				if (continueQuizz.toLowerCase().equals("ready")) {
					System.out.println("--------------------");
					System.out.println("Question No:" + questionNumber++ + " " + Questions.chapter3Questions().get(i)); // prin
																														// question
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(" >> Type 'Ready' again if you want another question << ");
				}
			}
		} else if (choice == 2) {
			System.out.println("You chose Chapter 4");
			System.out.println("*******************");
			System.out.println("Type 'Ready' when you want to start the quizz");
		} else if (choice == 3) {
			System.out.println("You chose Chapter 5");
			System.out.println("*******************");
			System.out.println("Type 'Ready' when you want to start the quizz");
		} else if (choice == 4) {
			System.out.println("You chose Chapter 6");
			System.out.println("*******************");
			System.out.println("Type 'Ready' when you want to start the quizz");
		} else if (choice == 5) {
			System.out.println("You chose Chapter 7");
			System.out.println("*******************");
			System.out.println("Type 'Ready' when you want to start the quizz");
		} else if (choice == 6) {
			System.out.println("You chose Chapter 8");
			System.out.println("*******************");
			System.out.println("Type 'Ready' when you want to start the quizz");
		} else if (choice == 7) {
			System.out.println("You chose Chapter 9");
			System.out.println("Unfortunatelly the Chapter 9 is not ready yet, our noobs are working on it");
		} else if (choice == 8) {
			System.out.println("You chose Chapter 10");
			System.out.println("Unfortunatelly the Chapter 10 is not ready yet, our noobs are working on it");
		} else if (choice == 9) {
			System.out.println("You chose chapter 11");
			System.out.println("Unfortunatelly the Chapter 11 is not ready yet, our noobs are working on it");
		} else if (choice == 0) {
			System.out.println("You chose to be quizzed from all chapters");
			System.out.println("*******************");
			System.out.println("Type 'Ready' when you want to start the quizz");
		}

	}

	public static int userInput() {

		int userInput;
		do {
			System.out.println("Please enter a positive number");
			while (!input.hasNextInt()) {
				System.out.println("Only numbers are allowed , please try again");
				input.next();
			}
			userInput = input.nextInt();
		} while (userInput < 0);
		return userInput;
	}

}
