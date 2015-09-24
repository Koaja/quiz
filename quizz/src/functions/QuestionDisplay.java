package functions;

import java.util.List;
import java.util.Scanner;

public class QuestionDisplay {

	static String readyQuestionAnswer;
	static int questionNumber = 1;
	static Scanner input = new Scanner(System.in);

	public static void promptQuestion(int NumberOfQuestions, List<String> listQuestions) {

		for (int i = 0;;) {

			String continueQuiz = input.nextLine();

			if (continueQuiz.toLowerCase().equals("yes") || continueQuiz.toLowerCase().equals("y")) {

				System.out.println("--------------------");
				System.out.println("Question No" + questionNumber++ + ": " + listQuestions.get(i));
				System.out.println("--------------------");
				System.out.println(" ");
				System.out.println(Strings.nextQuestion);
				i++;

			} else if (continueQuiz.toLowerCase().equals("no") || continueQuiz.toLowerCase().equals("n")) {
				System.out.println(Strings.quizStopped);
					
			} else {
				System.out.println(Strings.wrongInput);
			}
			if (i == NumberOfQuestions) {

				System.out.println(Strings.quizOver);
				break;
			}
		}

	}

	public static void chapterOfChoice(int chapterNumber) {

		// ask the user if he is ready
		System.out.println("You chose: " + function.availableChapters.toString());
	}
}
