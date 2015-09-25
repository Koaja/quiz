package functions;

import java.util.List;
import java.util.Scanner;

import questions.Questions;

public class function {

	static int chapterNumber = 0;
	static int questionNumber = 1;
	static String readyQuestionAnswer;
	static Scanner input = new Scanner(System.in);
	static Scanner input2 = new Scanner(System.in);
	static String availableChapters[] = { "All Chapters", "Chapter3", "Chapter4", "Chapter5", "Chapter6", "Chapter7",
			"Chapter8", "Chapter9", "Chapter10", "Chapter11" };
	static String answers[] = { "yes", "y", "n", "no" };

	public static void listChapters() {

		// Chapters are listed one after another
		for (String chapter : availableChapters) {
			String displayChapterNumber = chapterNumber++ + "." + chapter;
			System.out.println(displayChapterNumber);
		}
		chapterNumber = 0; // resets the chapters back to 0
	}

	public static void userselectedChapter() {

		System.out.println(Strings.greetUser);
		System.out.println("-------------");
		while (true) {

			// show user available chapters
			System.out.println(" ");
			System.out.println(Strings.chapterSelection);
			System.out.println("*******");

			listChapters();
			// input box
			System.out.println("Your Chapter of choice is : ");
			int selectedChapter = userChaperSelectionInput();

			switch (selectedChapter) {

			case 1:

				// ask for input
				readyQuestionAnswer = input.nextLine();

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 3");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				int numberOfQuestions = Questions.chapter3Questions().size();
				List<String> question = Questions.chapter3Questions();

				QuestionDisplay.promptQuestion(numberOfQuestions, question);
				break;

			case 2:

				// ask for input
				readyQuestionAnswer = input.nextLine();

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 4");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				int numberOfQuestions1 = Questions.chapter4Questions().size();
				List<String> question1 = Questions.chapter4Questions();

				QuestionDisplay.promptQuestion(numberOfQuestions1, question1);
				break;

			case 3:

				// ask for input
				readyQuestionAnswer = input.nextLine();

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 5");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				int numberOfQuestions2 = Questions.chapter5Questions().size();
				List<String> question2 = Questions.chapter5Questions();
				QuestionDisplay.promptQuestion(numberOfQuestions2, question2);
				break;

			case 4:

				// ask for input
				readyQuestionAnswer = input.nextLine();

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 6");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				int numberOfQuestions3 = Questions.chapter6Questions().size();

				List<String> question3 = Questions.chapter6Questions();
				QuestionDisplay.promptQuestion(numberOfQuestions3, question3);
				break;

			case 5:

				// ask for input
				readyQuestionAnswer = input.nextLine();

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 7");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				int numberOfQuestions4 = Questions.chapter7Questions().size();

				List<String> question4 = Questions.chapter7Questions();

				QuestionDisplay.promptQuestion(numberOfQuestions4, question4);

				break;

			case 6:

				// ask for input
				readyQuestionAnswer = input.nextLine();

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 8");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				int numberOfQuestions5 = Questions.chapter8Questions().size();

				List<String> question5 = Questions.chapter8Questions();

				QuestionDisplay.promptQuestion(numberOfQuestions5, question5);

				break;

			case 7:

				System.out.println("You chose Chapter 9");
				System.out.println("Unfortunatelly the Chapter 9 is not ready yet, our noobs are working on it.");
				break;

			case 8:

				System.out.println("You chose Chapter 10");
				System.out.println("Unfortunatelly the Chapter 10 is not ready yet, our noobs are working on it.");
				break;

			case 9:

				System.out.println("You chose chapter 11");
				System.out.println("Unfortunatelly the Chapter 11 is not ready yet, our noobs are working on it.");
				break;

			case 0:

				// ask for input
				readyQuestionAnswer = input.nextLine();

				// let the user know the chapter he chose
				System.out.println("You chose all Chapters");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				int numberOfQuestions6 = Questions.AllChaptersQuestions().size();

				List<String> question6 = Questions.AllChaptersQuestions();
				QuestionDisplay.promptQuestion(numberOfQuestions6, question6);
				break;
			}

			if (repeatQuiz().equals("QUIT")) {
				System.out.println("Program Terminated");
				break;
			}

		}
	}

	public static int userChaperSelectionInput() {

		int userInput;

		for (;;) {

			if (!input.hasNextInt()) {
				System.out.println("Only numbers are allowed , please try again.");
				input.next(); // discard
				continue;
			}
			userInput = input.nextInt();

			if (userInput >= 0 && userInput <= 9) {
				return userInput;

			} else if (userInput < 0) {

				System.out.print("Please enter a positive number.");
			} else if (userInput >= availableChapters.length) {

				System.out.println("Selected Chapter is not available.");
			}
		}
	}

	public static String repeatQuiz() {

		String repeat;

		for (;;) {
			repeat = input2.nextLine();

			if (repeat.toLowerCase().equals("yes") || repeat.toLowerCase().equals("y")) {
				return repeat;

			} else if (repeat.toLowerCase().equals("quit")) {

				return repeat;
			} else

				System.out.println("Wrong input , please type 'Yes/Y' or 'Quit");
		}
	}
}
