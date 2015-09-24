package functions;

import java.util.List;
import java.util.Scanner;

import questions.Questions;

public class function {

	static int chapterNumber = 0;
	static int questionNumber = 1;
	static String readyQuestionAnswer;
	static Scanner input = new Scanner(System.in);
	static String availableChapters[] = { "All Chapters", "Chapter3", "Chapter4", "Chapter5", "Chapter6", "Chapter7",
			"Chapter8", "Chapter9", "Chapter10", "Chapter11" };
	static String answers[] = { "yes", "y", "n", "no" };

	public static void listChapters() {

		// Chapters are listed one after another
		for (String chapter : availableChapters) {
			String displayChapterNumber = chapterNumber++ + "." + chapter;
			System.out.println(displayChapterNumber);
		}
	}

	public static void userselectedChapter() {

		System.out.println(Strings.greetUser);
		System.out.println("-------------");

		// show user available chapters
		System.out.println(Strings.chapterSelection);
		System.out.println("*******");

		listChapters();
		// input box
		System.out.println("Your Chapter of choice is : ");

		int selectedChapter = userChaperSelectionInput();

		if (selectedChapter == 1) {

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

		} else if (selectedChapter == 2)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 4");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(Strings.prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter4Questions().size();
			List<String> question = Questions.chapter4Questions();

			QuestionDisplay.promptQuestion(numberOfQuestions, question);

		} else if (selectedChapter == 3)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 5");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(Strings.prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter5Questions().size();
			List<String> question = Questions.chapter5Questions();
			QuestionDisplay.promptQuestion(numberOfQuestions, question);
		} else if (selectedChapter == 4)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 6");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(Strings.prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter6Questions().size();

			List<String> question = Questions.chapter6Questions();
			QuestionDisplay.promptQuestion(numberOfQuestions, question);

		} else if (selectedChapter == 5)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 7");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(Strings.prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter7Questions().size();

			List<String> question = Questions.chapter7Questions();

			QuestionDisplay.promptQuestion(numberOfQuestions, question);

		} else if (selectedChapter == 6)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 8");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(Strings.prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter8Questions().size();

			List<String> question = Questions.chapter8Questions();
			QuestionDisplay.promptQuestion(numberOfQuestions, question);

		} else if (selectedChapter == 7)

		{
			System.out.println("You chose Chapter 9");
			System.out.println("Unfortunatelly the Chapter 9 is not ready yet, our noobs are working on it");
		} else if (selectedChapter == 8)

		{
			System.out.println("You chose Chapter 10");
			System.out.println("Unfortunatelly the Chapter 10 is not ready yet, our noobs are working on it");
		} else if (selectedChapter == 9)

		{
			System.out.println("You chose chapter 11");
			System.out.println("Unfortunatelly the Chapter 11 is not ready yet, our noobs are working on it");
		} else if (selectedChapter == 0)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose all Chapters");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(Strings.prepareFirstQuestion);

			int numberOfQuestions = Questions.AllChaptersQuestions().size();

			List<String> question = Questions.AllChaptersQuestions();
			QuestionDisplay.promptQuestion(numberOfQuestions, question);

		}

	}

	public static int userChaperSelectionInput() {

		int userInput;

		for (;;) {
			if (!input.hasNextInt()) {
				System.out.println("Only numbers are allowed , please try again");
				input.next(); // discard
				continue;
			}
			userInput = input.nextInt();
			if (userInput >= 0 && userInput <= 9) {
				return userInput;

			} else if (userInput < 0) {
				System.out.print("Please enter a positive number");
			} else if (userInput >= availableChapters.length) {
				System.out.println("Selected Chapter is not available");
			}
		}
	}

}
