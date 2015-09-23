package functions;

import java.util.List;
import java.util.Scanner;

public class QuestionDisplay {

	static String readyQuestionAnswer;
	int questionNumber = 1;
	static Scanner input = new Scanner(System.in);

	public QuestionDisplay(int NumberOfQuestions, List<String> listQuestions) {

		for (int i = 0;;) {

			String continueQuizz = input.nextLine();

			if (continueQuizz.toLowerCase().equals("yes") || continueQuizz.toLowerCase().equals("y")) {

				System.out.println("--------------------");
				System.out.println("Question No" + questionNumber++ + ": " + listQuestions.get(i));
				System.out.println("--------------------");
				System.out.println(" ");
				System.out.println(Strings.nextQuestion);
				i++;

			} else if (continueQuizz.toLowerCase().equals("no") || continueQuizz.toLowerCase().equals("n")) {

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
