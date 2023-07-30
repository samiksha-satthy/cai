//Samiksha Satthy
//This is a template class that create the QuestionAssessment Object

public class QuestionAssessment {

	// fields
	private String question;
	private String answers;
	private String questionType;

	// constructor
	public QuestionAssessment(String question, String answers, String questionType) {
		super();
		this.question = question;
		this.answers = answers;
		this.questionType = questionType;
	}

	// getters and setters
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	// toString
	@Override
	public String toString() {
		return "QuestionAssessment [question=" + question + ", answers=" + answers + ", questionType=" + questionType
				+ "]";
	}

}
