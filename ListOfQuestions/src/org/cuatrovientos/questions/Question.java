/**
 * 
 */
package org.cuatrovientos.questions;

/**
 * Represents a question in the list of questions
 * @author julen
 *
 */
public class Question {
	private String wording;
	private String answer;
	
	/**
	 * Constructor
	 * @param wording
	 * @param answer
	 */
	public Question(String wording, String answer) {
		this.wording = wording;
		this.answer = answer;
	}

	/**
	 * @return the wording
	 */
	public String getWording() {
		return wording;
	}

	/**
	 * @param wording the wording to set
	 */
	public void setWording(String wording) {
		this.wording = wording;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return wording;
	}
	
	
}
