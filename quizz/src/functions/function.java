package functions;

import java.util.Scanner;

import questions.Questions;

public class function {

	static int chapterNumber = 0;
	static int questionNumber = 1;
	static String readyQuestionAnswer;
	static Scanner input = new Scanner(System.in);
	static String greetUser = "Welcome to CISCO CCNA - Quiz";
	static String chapterSelection = "Please select a Chapter or all to be quizzed from: ";
	static String prepareFirstQuestion = "Ready for the first question ? Type Yes/Y or No/N if you want to pause the quiz.";
	static String quizStopped = "Quiz has been stopped. To resume the quiz please type Yes/Y.";
	static String nextQuestion = "Ready for next question ? Type Yes or No.";
	static String availableChapters[] = { "All Chapters", "Chapter3", "Chapter4", "Chapter5", "Chapter6", "Chapter7",
			"Chapter8", "Chapter9", "Chapter10", "Chapter11" };

	public static void listChapters() {

		// Chapters are listed one after another
		for (String chapter : availableChapters) {
			String displayChapterNumber = chapterNumber++ + "." + chapter;
			System.out.println(displayChapterNumber);
		}
	}

	public static void userChoice() {

		// int choice ;
		System.out.println(greetUser);
		System.out.println("-------------");

		// show user available chapters
		System.out.println(chapterSelection);
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
			System.out.println(prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter3Questions().size() + 1;

			// prompt a question each time yes is typed
			for (int i = -1; i < numberOfQuestions;) {

				String continueQuizz = input.nextLine();
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					i++;
					System.out.println("--------------------");
					System.out.println("Question No" + questionNumber++ + ": " + Questions.chapter3Questions().get(i)); // printQuestion
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(nextQuestion);

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {

					System.out.println(quizStopped);
				} else {

					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N'  ");
				}
				if (questionNumber == numberOfQuestions) {

					System.out.println("You have finished the quiz , there are no more questions");
				}
			}

		} else if (choice == 2)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 4");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter4Questions().size() + 1;
			// prompt a question each time yes is typed
			for (int i = -1; i < numberOfQuestions;) {

				String continueQuizz = input.nextLine();
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					i++;
					System.out.println("--------------------");
					System.out.println("Question No" + questionNumber++ + ": " + Questions.chapter4Questions().get(i)); // printQuestion
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(nextQuestion);

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {

					System.out.println(quizStopped);
				} else {

					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N'  ");
				}
				if (questionNumber == numberOfQuestions) {

					System.out.println("You have finished the quiz , there are no more questions");
				}
			}

		} else if (choice == 3)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 5");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter5Questions().size() + 1;

			// prompt a question each time yes is typed
			for (int i = -1; i < numberOfQuestions;) {

				String continueQuizz = input.nextLine();
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					i++;
					System.out.println("--------------------");
					System.out.println("Question No" + questionNumber++ + ": " + Questions.chapter5Questions().get(i)); // printQuestion
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(nextQuestion);

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {

					System.out.println(quizStopped);
				} else {

					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N'  ");
				}
				if (questionNumber == numberOfQuestions) {

					System.out.println("You have finished the quiz , there are no more questions");
				}
			}

		} else if (choice == 4)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 6");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter6Questions().size() + 1;

			// prompt a question each time yes is typed
			for (int i = -1; i < numberOfQuestions;) {

				String continueQuizz = input.nextLine();
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					i++;
					System.out.println("--------------------");
					System.out.println("Question No" + questionNumber++ + ": " + Questions.chapter6Questions().get(i)); // printQuestion
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(nextQuestion);

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {

					System.out.println(quizStopped);
				} else {

					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N'  ");
				}
				if (questionNumber == numberOfQuestions) {

					System.out.println("You have finished the quiz , there are no more questions");
				}
			}
		} else if (choice == 5)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 7");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter7Questions().size() + 1;

			// prompt a question each time yes is typed
			for (int i = -1; i < numberOfQuestions;) {

				String continueQuizz = input.nextLine();
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					i++;
					System.out.println("--------------------");
					System.out.println("Question No" + questionNumber++ + ": " + Questions.chapter7Questions().get(i)); // printQuestion
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(nextQuestion);

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {

					System.out.println(quizStopped);
				} else {

					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N'  ");
				}
				if (questionNumber == numberOfQuestions) {

					System.out.println("You have finished the quiz , there are no more questions");
				}
			}

		} else if (choice == 6)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 8");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(prepareFirstQuestion);

			int numberOfQuestions = Questions.chapter8Questions().size() + 1;

			// prompt a question each time yes is typed
			for (int i = -1; i < numberOfQuestions;) {

				String continueQuizz = input.nextLine();
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					i++;
					System.out.println("--------------------");
					System.out.println("Question No" + questionNumber++ + ": " + Questions.chapter8Questions().get(i)); // printQuestion
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(nextQuestion);

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {

					System.out.println(quizStopped);
				} else {

					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N'  ");
				}
				if (questionNumber == numberOfQuestions) {

					System.out.println("You have finished the quiz , there are no more questions");
				}
			}

		} else if (choice == 7)

		{
			System.out.println("You chose Chapter 9");
			System.out.println("Unfortunatelly the Chapter 9 is not ready yet, our noobs are working on it");
		} else if (choice == 8)

		{
			System.out.println("You chose Chapter 10");
			System.out.println("Unfortunatelly the Chapter 10 is not ready yet, our noobs are working on it");
		} else if (choice == 9)

		{
			System.out.println("You chose chapter 11");
			System.out.println("Unfortunatelly the Chapter 11 is not ready yet, our noobs are working on it");
		} else if (choice == 0)

		{
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose all chapters");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println(prepareFirstQuestion);

			int numberOfQuestions = Questions.AllChaptersQuestions().size() + 1;

			// prompt a question each time yes is typed
			for (int i = -1; i < numberOfQuestions;) {

				String continueQuizz = input.nextLine();
				// System.out.println(numberOfQuestions);
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					i++;
					System.out.println("--------------------");
					System.out
							.println("Question No" + questionNumber++ + ": " + Questions.AllChaptersQuestions().get(i));
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(nextQuestion);

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {

					System.out.println(quizStopped);
				} else {

					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N'  ");
				}
				if (questionNumber == numberOfQuestions) {

					System.out.println("You have finished the quiz , there are no more questions");
				}
			}

		}

	}

	public static int userInput() {

		int userInput;

		for (;;) {
			if (!input.hasNextInt()) {
				System.out.println("Only numbers are allowed , please try again");
				input.next(); // discard
				continue;
			}
			userInput = input.nextInt();
			if (userInput >= 0) {
				return userInput;
			} else {
				System.out.print("Please enter a positive number");
				continue;
			}
		}
	}
}
