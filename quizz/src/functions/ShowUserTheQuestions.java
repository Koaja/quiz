package functions;

import java.util.List;
import java.util.Scanner;

public class ShowUserTheQuestions {

	static String readyQuestionAnswer;
	static int questionNumber = 1;
	static String stopQuiz[] = { "q", "quit" };
	static Scanner input = new Scanner(System.in);

	public static void promptQuestion(int NumberOfQuestions, List<String> listQuestions) {

		for (int i = 0;;) {

			String continueQuiz = input.nextLine();

			if (continueQuiz.toLowerCase().equals("yes") || continueQuiz.toLowerCase().equals("y")) {

				System.out.println("--------------------");
				System.out.println("Question No" + questionNumber++ + ": " + listQuestions.get(i));
				System.out.println("--------------------");
				System.out.println(" ");
				if (i != NumberOfQuestions - 1) {
					System.out.println(Strings.nextQuestion);
				}
				i++;

			} else if (continueQuiz.toLowerCase().equals("no") || continueQuiz.toLowerCase().equals("n")) {

				System.out.println(Strings.quizStopped); // pauses the quiz
			} else if (continueQuiz.toLowerCase().equals("quit")) {
				System.out.println("Program Terminated");

				// resets counter back to 1
				questionNumber = 1;

				// exits current chapter and returns to main menu
				System.exit(1);

			} else if (continueQuiz.toLowerCase().equals("return") || continueQuiz.toLowerCase().equals("r")) {

				System.out.println(Strings.quizSkipped);

				break;

			} else {

				System.out.println(Strings.wrongInput);
			}

			if (i == NumberOfQuestions) {

				// resets counter back to 1
				questionNumber = 1;

				System.out.println(Strings.quizOver);
				break;
			}
		}

	}

}
