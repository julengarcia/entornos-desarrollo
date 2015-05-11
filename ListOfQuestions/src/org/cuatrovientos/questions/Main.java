/**
 * 
 */
package org.cuatrovientos.questions;

import java.util.Scanner;

/**
 * @author julen
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// variables for new questions
		String wording = "";
		String answer = "";
		Question question = null;
		
		// variable to use in remove and read cases
		int index = 0;
		
		Scanner reader = new Scanner(System.in);
		String option = "";
		
		ListOfQuestions listofquestions = new ListOfQuestions();
		
		do {
			System.out.println("----------My List of Questions----------");
			System.out.println("Select one option:\n");
			System.out.println("1. Add new question");
			System.out.println("2. Remove question");
			System.out.println("3. Show all questions");
			System.out.println("4. Show random wording");
			System.out.println("5. Exit");
			
			option = reader.nextLine();
			
			switch (option) {
			case "1":
				System.out.println("Please, enter wording.");
				wording = reader.nextLine();
				System.out.println("Please, enter answer.");
				answer = reader.nextLine();
				question = new Question(wording,answer);
				listofquestions.addQuestion(question);
				break;
			case "2":
				System.out.println("Please, enter index.");
				wording = reader.nextLine();
				index = Integer.parseInt(wording);
				listofquestions.removeQuestion(index);
				break;
			case "3":
				System.out.println(listofquestions.readAll());
				break;
			case "4":
				System.out.println(listofquestions.readRandomQuestion());
				System.out.println("Please, enter answer.");
				answer = reader.nextLine();
				//if () {
				//	System.out.println("Válida");
				//} else {
				//	System.out.println("Errónea");
				//}
				break;
			case "5":
				System.out.println();
				System.out.println("Bye");
				break;
			default:
				System.out.println();
				System.out.println("TRY AGAIN");
				break;
			}
		} while (!option.equals("5"));
	}

}
