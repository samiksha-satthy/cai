//Samiksha Satthy 
//template class to build QuestionActivity Object

public class QuestionActivity {

	// fields
	private String question;
	private String answer;

	// constructor
	public QuestionActivity(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	// getters and setters
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	// toString
	@Override
	public String toString() {
		return "QuestionActivity [question=" + question + ", answer=" + answer + "]";
	}

}
