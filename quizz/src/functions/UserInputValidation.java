package functions;

import java.util.Scanner;

import questions.Questions;

public class UserInputValidation {

	static Scanner input = new Scanner(System.in);
	static Scanner input2 = new Scanner(System.in);

	public static int userChaperSelectionInput() {

		int userInput;

		for (;;) {

			if (!input.hasNextInt()) {
				System.out.println("Only numbers are allowed , please try again.");
				
				//to break the infinite loop and ask again for input
				input.next();
				
				continue;
			}
			userInput = input.nextInt();

			if (userInput >= 0 && userInput <= 9) {
				return userInput;

			} else if (userInput < 0) {

				System.out.print("Please enter a positive number.");
			} else if (userInput >= Questions.availableChapters.length) {

				System.out.println("Selected Chapter is not available.");
			}
		}
	}

	public static String userRepeatQuizInput() {

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
