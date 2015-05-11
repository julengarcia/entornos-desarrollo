/**
 * 
 */
package org.cuatrovientos.questions;

import java.util.Random;
import java.util.Vector;

/**
 * Represents a list of questions with questions
 * @author julen
 *
 */
public class ListOfQuestions {
	private Vector<Question> questions;
	
	/**
	 * Default constructor, inits question vector
	 */
	
	public ListOfQuestions() {
		questions = new Vector<Question>();
	}
	
	/**
	 * Adds question into listo of questions
	 * @param question
	 */
	
	public void addQuestion (Question question) {
		questions.add(question);
	}
	
	/**
	 * removes questions from list of questions
	 * @param index
	 * @return
	 */
	
	public boolean removeQuestion (int index) {
		if (index < questions.size()) {
			questions.remove(index);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * reads a random question from list of questions
	 * @return question referenced by index
	 */
	
	public Question readRandomQuestion () {
		Random random = new Random();
		int a = 0;
		a = random.nextInt(questions.size());
		return  questions.elementAt(a);
		
	}
	
	/**
	 * show all questions in listo of questions
	 * @return
	 */
	public String readAll() {
		String result = "";
		
		for (Question question: questions) {
			result = result + question.toString() + "\n";
			
		}
		return result;
	}
}
