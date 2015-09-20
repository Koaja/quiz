package functions;

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
			System.out.println("Write 'Yes/Y' to start quizz");

			int numberOfQuestions = Questions.chapter3Questions().size() + 1;

			// prompt a question each time yes is typed
			for (int i = -1; i < numberOfQuestions;) {

				String continueQuizz = input.nextLine();
				// System.out.println(numberOfQuestions);
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					i++;
					System.out.println("--------------------");
					System.out.println("Question No:" + questionNumber++ + " " + Questions.chapter3Questions().get(i)); // print
																														// question
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(" >> Ready for NEXT question ? Type Yes/No ! << ");

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {
					
					
					System.out.println(
							"Quizz has been paused. Get some fresh air and when you're ready to resume type 'Ready' ! ");
					String breakPauseAnswer = input.nextLine();
					while (breakPauseAnswer.toLowerCase().equals("ready")) {

						System.out.println("--------------------");
						System.out.println(
								"Question No:" + questionNumber++ + " " + Questions.chapter3Questions().get(i)); // print
																													// question
						System.out.println("--------------------");
						System.out.println(" ");
						System.out.println(" >> Are you ready for the next question ? Type Yes/No << ");
						} 

						System.out.println("Press ready m8");
					

				} else {

					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N' ");
				}
				if (questionNumber == numberOfQuestions) {

					System.out.println("You have finished the quiz , there are no more questions");
				}
			}

		} else if (choice == 2) {
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 4");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println("Write 'Yes/Y' to start quizz");

			//
			for (int i = 0; i < Questions.chapter4Questions().size(); i++) {

				String continueQuizz = input.nextLine();
				int numberOfQuestions = Questions.chapter4Questions().size();
				// System.out.println(numberOfQuestions);
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					System.out.println("--------------------");
					System.out.println("Question No:" + questionNumber++ + " " + Questions.chapter4Questions().get(i)); // prin
																														// question
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(" >> Ready for NEXT question ? Type Yes/No ! << ");

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {
					System.out.println(
							"Quizz has been paused. Get some fresh air and when you're ready to resume type 'Ready' ! ");
					String breakPauseAnswer = input.nextLine();
					if (breakPauseAnswer.toLowerCase().equals("ready")) {

						System.out.println("--------------------");
						System.out.println(
								"Question No:" + questionNumber++ + " " + Questions.chapter4Questions().get(i)); // prin
																													// question
						System.out.println("--------------------");
						System.out.println(" ");
						System.out.println(" >> Are you ready for the next question ? Type Yes/No << ");
					}

				} else
					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N' ");

				if (i == numberOfQuestions) {

					String quizzIsOver = input.nextLine();

					System.out.println("You have finished the quiz , there are no more questions");

				}
			}

		} else if (choice == 3) {
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 5");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println("Write 'Yes/Y' to start quizz");

			//
			for (int i = 0; i < Questions.chapter5Questions().size(); i++) {

				String continueQuizz = input.nextLine();
				int numberOfQuestions = Questions.chapter5Questions().size();
				// System.out.println(numberOfQuestions);
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					System.out.println("--------------------");
					System.out.println("Question No:" + questionNumber++ + " " + Questions.chapter5Questions().get(i)); // prin
																														// question
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(" >> Ready for NEXT question ? Type Yes/No ! << ");

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {
					System.out.println(
							"Quizz has been paused. Get some fresh air and when you're ready to resume type 'Ready' ! ");
					String breakPauseAnswer = input.nextLine();
					if (breakPauseAnswer.toLowerCase().equals("ready")) {

						System.out.println("--------------------");
						System.out.println(
								"Question No:" + questionNumber++ + " " + Questions.chapter5Questions().get(i)); // prin
																													// question
						System.out.println("--------------------");
						System.out.println(" ");
						System.out.println(" >> Are you ready for the next question ? Type Yes/No << ");
					}

				} else
					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N' ");

				if (i == numberOfQuestions) {

					String quizzIsOver = input.nextLine();

					System.out.println("You have finished the quiz , there are no more questions");

				}
			}

		} else if (choice == 4) {
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 6");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println("Write 'Yes/Y' to start quizz");

			//
			for (int i = 0; i < Questions.chapter6Questions().size(); i++) {

				String continueQuizz = input.nextLine();
				int numberOfQuestions = Questions.chapter6Questions().size();
				// System.out.println(numberOfQuestions);
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					System.out.println("--------------------");
					System.out.println("Question No:" + questionNumber++ + " " + Questions.chapter6Questions().get(i)); // prin
																														// question
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(" >> Ready for NEXT question ? Type Yes/No ! << ");

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {
					System.out.println(
							"Quizz has been paused. Get some fresh air and when you're ready to resume type 'Ready' ! ");
					String breakPauseAnswer = input.nextLine();
					if (breakPauseAnswer.toLowerCase().equals("ready")) {

						System.out.println("--------------------");
						System.out.println(
								"Question No:" + questionNumber++ + " " + Questions.chapter6Questions().get(i)); // prin
																													// question
						System.out.println("--------------------");
						System.out.println(" ");
						System.out.println(" >> Are you ready for the next question ? Type Yes/No << ");
					}

				} else
					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N' ");

				if (i == numberOfQuestions) {

					String quizzIsOver = input.nextLine();

					System.out.println("You have finished the quiz , there are no more questions");

				}
			}

		} else if (choice == 5) {
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 7");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println("Write 'Yes/Y' to start quizz");

			//
			for (int i = 0; i < Questions.chapter7Questions().size(); i++) {

				String continueQuizz = input.nextLine();
				int numberOfQuestions = Questions.chapter7Questions().size();
				// System.out.println(numberOfQuestions);
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					System.out.println("--------------------");
					System.out.println("Question No:" + questionNumber++ + " " + Questions.chapter7Questions().get(i)); // prin
																														// question
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(" >> Ready for NEXT question ? Type Yes/No ! << ");

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {
					System.out.println(
							"Quizz has been paused. Get some fresh air and when you're ready to resume type 'Ready' ! ");
				}
				String breakPauseAnswer = input.nextLine();
				if (breakPauseAnswer.toLowerCase().equals("ready")) {

					System.out.println("--------------------");
					System.out.println("Question No:" + questionNumber++ + " " + Questions.chapter7Questions().get(i)); // prin
																														// question
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(" >> Are you ready for the next question ? Type Yes/No << ");

				} else {
					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N' ");
				}

				if (i == numberOfQuestions) {

					String quizzIsOver = input.nextLine();

					System.out.println("You have finished the quiz , there are no more questions");

				}
			}

		} else if (choice == 6) {
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose Chapter 8");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println("Write 'Yes/Y' to start quizz");

			//
			for (int i = 0; i < Questions.chapter8Questions().size(); i++) {

				String continueQuizz = input.nextLine();
				int numberOfQuestions = Questions.chapter8Questions().size();
				// System.out.println(numberOfQuestions);
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					System.out.println("--------------------");
					System.out.println("Question No:" + questionNumber++ + " " + Questions.chapter8Questions().get(i)); // prin
																														// question
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(" >> Ready for NEXT question ? Type Yes/No ! << ");

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {
					System.out.println(
							"Quizz has been paused. Get some fresh air and when you're ready to resume type 'Ready' ! ");
					String breakPauseAnswer = input.nextLine();
					if (breakPauseAnswer.toLowerCase().equals("ready")) {

						System.out.println("--------------------");
						System.out.println(
								"Question No:" + questionNumber++ + " " + Questions.chapter8Questions().get(i)); // prin
																													// question
						System.out.println("--------------------");
						System.out.println(" ");
						System.out.println(" >> Are you ready for the next question ? Type Yes/No << ");
					}

				} else
					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N' ");

				if (i == numberOfQuestions) {

					String quizzIsOver = input.nextLine();

					System.out.println("You have finished the quiz , there are no more questions");

				}
			}

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
			// ask for input
			readyQuestionAnswer = input.nextLine();

			// let the user know the chapter he chose
			System.out.println("You chose to be quizzed from all chapters");
			System.out.println("*******************");

			// ask the user if he is ready
			System.out.println("Write 'Yes/Y' to start quizz");

			//
			for (int i = 0; i < Questions.AllChaptersQuestions().size(); i++) {

				String continueQuizz = input.nextLine();
				int numberOfQuestions = Questions.AllChaptersQuestions().size();
				// System.out.println(numberOfQuestions);
				if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {
					System.out.println("--------------------");
					System.out
							.println("Question No:" + questionNumber++ + " " + Questions.AllChaptersQuestions().get(i)); // prin
																															// question
					System.out.println("--------------------");
					System.out.println(" ");
					System.out.println(" >> Ready for NEXT question ? Type Yes/No ! << ");

				} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {
					System.out.println(
							"Quizz has been paused. Get some fresh air and when you're ready to resume type 'Ready' ! ");
					String breakPauseAnswer = input.nextLine();
					if (breakPauseAnswer.toLowerCase().equals("ready")) {

						System.out.println("--------------------");
						System.out.println(
								"Question No:" + questionNumber++ + " " + Questions.AllChaptersQuestions().get(i)); // prin
																													// question
						System.out.println("--------------------");
						System.out.println(" ");
						System.out.println(" >> Are you ready for the next question ? Type Yes/No << ");
					}

				} else
					System.out.println("Wrong input , please type 'Yes/Y' or 'No/N' ");

				if (i == numberOfQuestions) {

					String quizzIsOver = input.nextLine();

					System.out.println("You have finished the quiz , there are no more questions");

				}
			}

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
