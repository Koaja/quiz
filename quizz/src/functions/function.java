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

	public static void userselectedChapter() {

		System.out.println(Strings.greetUser);
		System.out.println("-------------");
		while (true) {

			// show user available chapters
			System.out.println(" ");
			System.out.println(Strings.chapterSelection);
			System.out.println("*******");

			Questions.listChapters();
			// input box
			System.out.println("Your Chapter of choice is : ");

			// stores the chapter from user input
			int selectedChapter = UserInputValidation.userChaperSelectionInput();

			switch (selectedChapter) {

			case 1:

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 3");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				// number of questions in a chapter
				int numberOfQuestionsChapter3 = Questions.chapter3Questions().size();

				// all questions stored in a list
				List<String> questionsChapter3 = Questions.chapter3Questions();

				// displays the questions from selected chapter
				ShowUserTheQuestions.promptQuestion(numberOfQuestionsChapter3, questionsChapter3);
				break;

			case 2:

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 4");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				// number of questions in a chapter
				int numberOfQuestionsChapter4 = Questions.chapter4Questions().size();

				// all questions stored in a list
				List<String> questionsChapter4 = Questions.chapter4Questions();

				// displays the questions from selected chapter
				ShowUserTheQuestions.promptQuestion(numberOfQuestionsChapter4, questionsChapter4);
				break;

			case 3:

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 5");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				// number of questions in a chapter
				int numberOfQuestionsChapter5 = Questions.chapter5Questions().size();

				// all questions stored in a list
				List<String> questionChapter5 = Questions.chapter5Questions();

				// displays the questions from selected chapter
				ShowUserTheQuestions.promptQuestion(numberOfQuestionsChapter5, questionChapter5);
				break;

			case 4:

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 6");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				// number of questions in a chapter
				int numberOfQuestionsChapter6 = Questions.chapter6Questions().size();

				// all questions stored in a list
				List<String> questionsChapter6 = Questions.chapter6Questions();

				// displays the questions from selected chapter
				ShowUserTheQuestions.promptQuestion(numberOfQuestionsChapter6, questionsChapter6);
				break;

			case 5:

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 7");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				// number of questions in a chapter
				int numberOfQuestionsChapter7 = Questions.chapter7Questions().size();

				// all questions stored in a list
				List<String> questionChapter7 = Questions.chapter7Questions();

				// displays the questions from selected chapter
				ShowUserTheQuestions.promptQuestion(numberOfQuestionsChapter7, questionChapter7);

				break;

			case 6:

				// let the user know the chapter he chose
				System.out.println("You chose Chapter 8");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				// number of questions in a chapter
				int numberOfQuestionsChapter8 = Questions.chapter8Questions().size();

				// all questions stored in a list
				List<String> questionChapter8 = Questions.chapter8Questions();

				// displays the questions from selected chapter
				ShowUserTheQuestions.promptQuestion(numberOfQuestionsChapter8, questionChapter8);

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

				// let the user know the chapter he chose
				System.out.println("You chose all Chapters");
				System.out.println("*******************");

				// ask the user if he is ready
				System.out.println(Strings.prepareFirstQuestion);

				// number of questions in a chapter
				int numberOfQuestionsAllChapters = Questions.AllChaptersQuestions().size();

				// all questions stored in a list
				List<String> questionsAllChapters = Questions.AllChaptersQuestions();

				// displays the questions from selected chapter
				ShowUserTheQuestions.promptQuestion(numberOfQuestionsAllChapters, questionsAllChapters);

				break;
			}

			if (UserInputValidation.userRepeatQuizInput().toLowerCase().equals("quit")) {
				System.out.println("Program Terminated");
				break;
			}

		}
	}

}
