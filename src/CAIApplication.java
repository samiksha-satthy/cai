/*Name: Samiksha Satthy
 *Date: June 14, 2023 
 *Course Code: ICS3U1-01 - Mr. Fernandes
 *Title: Final Summative Project - CAI Application
 *Description: To create a Computer-Assisted Instruction (CAI) which is an interactive instructional 
 *			   technique tool where the computer will present the Modular Programming - Objects and Classes topic. 
 *			   Students will be able to review the material by being introduced to different definitions and code examples. 
 *			   After they have understood the basic concept, they can enhance their knowledge by participating in the 
 *			   interactive activity where students will be asked to match a term with the question asked. Once they feel 
 *			   comfortable with the concept, they will participate in the Assessment where they will be quizzed with a 
 *			   series of multiple-choice questions, fill-in-the-blanks, etc.  
 *Features: 
 *			1) Sign in page - where the user enters their initials
 *			2) Main Menu - outlining all of options
 *			3) Concepts - 5 topics, each with points and images 
 *			4) Activity - asteroid game, where the user can learn the concepts in a given period of time
 *			5)Assessment - user does question, can get a certificate for perfect score 	
 *			
 *Major Skills: methods, arrays, public variables, GUI, classes and objects, repetition statements, decision statements 
 *
 *Areas of Concerns: 
 *					1) Repeated questions in game - only keep track of the question that the 
 *						user previously had to answer in the 
 *					   activity
 *					Solution - try to add an array to store all the questions that the user had to answer and end game when 
 *							   they have answered everything
 */

public class CAIApplication {

	// variable to store user's initials
	public static String initials;

	// public variables to keep track of the concepts displayed on frame
	public static int Index1Concepts = 0;
	public static int Index2Concepts = 1;
	public static int Index3Concepts = 2;

	// public variable to keep track of the lesson the user picked
	public static int IndexPicked;

	// public variable to keep track of the lesson displayed on the frame
	public static int IndexTheory = 0;

	// arrays to store data of lessons, questions for activity and questions for
	// assessment
	public static Lesson[] lessonsArray = new Lesson[5];
	public static QuestionActivity[] questionsActivityArray = new QuestionActivity[15];
	public static QuestionAssessment[] questionsAssessmentArray = new QuestionAssessment[12];

	// keeps track of the previous question for activity
	public static int previousQuestion = 0;

	// public variables to keep track of user's score and the different questions
	// displayed
	public static int scoreCount = 0;
	public static int radioButtonQuestion = 0;

	// main method - runs the application
	public static void main(String[] args) {

		// runs the class to ensure all required data is read into the program
		new CAIFileInput();

		// runs the main menu frame
		new CAIInitials();

	}

}