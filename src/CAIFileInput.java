import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Samiksha Satthy 
//This class reads data from external text files and stores it in application

public class CAIFileInput {

	// constructor method
	public CAIFileInput() {

		fillLesson();

		fillQuestionActivity();

		fillQuestionAssessment();

	}

	// This method fills the Lesson array with Lesson Objects
	private void fillLesson() {

		// tries to read file into program
		try {

			// stores file as Scanner Object
			Scanner inputFile = new Scanner(new File("lessons.csv"));

			// uses delimiter to avoid characters in file
			inputFile.useDelimiter(",|\r\n");

			// loops through each element in file
			for (int index = 0; index < CAIApplication.lessonsArray.length; index++) {

				// reads one line from file and converts it to corresponding type in Lesson
				// Object Class
				String conceptsTitle = inputFile.next();
				String lessonOne = inputFile.next();
				String lessonOnePoint1 = inputFile.next();
				String lessonOnePoint2 = inputFile.next();
				String lessonOnePoint3 = inputFile.next();
				String lessonTwo = inputFile.next();
				String lessonTwoPoint1 = inputFile.next();
				String lessonTwoPoint2 = inputFile.next();
				String lessonTwoPoint3 = inputFile.next();
				String lessonThree = inputFile.next();
				String lessonThreePoint1 = inputFile.next();
				String lessonThreePoint2 = inputFile.next();
				String lessonThreePoint3 = inputFile.next();
				String lessonFour = inputFile.next();
				String lessonFourPoint1 = inputFile.next();
				String lessonFourPoint2 = inputFile.next();
				String lessonFourPoint3 = inputFile.next();
				int conceptTitleX = inputFile.nextInt();
				int conceptTitleY = inputFile.nextInt();
				int conceptTitleSize = inputFile.nextInt();
				String lessonOneImage = inputFile.next();
				String lessonTwoImage = inputFile.next();
				String lessonThreeImage = inputFile.next();
				String lessonFourImage = inputFile.next();
				int lessonPoint1TitleX = inputFile.nextInt();
				int lessonPoint1PointsY = inputFile.nextInt();
				int lessonPoint1ImageX = inputFile.nextInt();
				int lessonPoint1ImageY = inputFile.nextInt();
				int lessonPoint2TitleX = inputFile.nextInt();
				int lessonPoint2PointsY = inputFile.nextInt();
				int lessonPoint2ImageX = inputFile.nextInt();
				int lessonPoint2ImageY = inputFile.nextInt();
				int lessonPoint3TitleX = inputFile.nextInt();
				int lessonPoint3PointsY = inputFile.nextInt();
				int lessonPoint3ImageX = inputFile.nextInt();
				int lessonPoint3ImageY = inputFile.nextInt();
				int lessonPoint4TitleX = inputFile.nextInt();
				int lessonPoint4PointsY = inputFile.nextInt();
				int lessonPoint4ImageX = inputFile.nextInt();
				int lessonPoint4ImageY = inputFile.nextInt();

				// creates new object of class
				CAIApplication.lessonsArray[index] = new Lesson(conceptsTitle, lessonOne, lessonOnePoint1,
						lessonOnePoint2, lessonOnePoint3, lessonTwo, lessonTwoPoint1, lessonTwoPoint2, lessonTwoPoint3,
						lessonThree, lessonThreePoint1, lessonThreePoint2, lessonThreePoint3, lessonFour,
						lessonFourPoint1, lessonFourPoint2, lessonFourPoint3, conceptTitleX, conceptTitleY,
						conceptTitleSize, lessonOneImage, lessonTwoImage, lessonThreeImage, lessonFourImage,
						lessonPoint1TitleX, lessonPoint1PointsY, lessonPoint1ImageX, lessonPoint1ImageY,
						lessonPoint2TitleX, lessonPoint2PointsY, lessonPoint2ImageX, lessonPoint2ImageY,
						lessonPoint3TitleX, lessonPoint3PointsY, lessonPoint3ImageX, lessonPoint3ImageY,
						lessonPoint4TitleX, lessonPoint4PointsY, lessonPoint4ImageX, lessonPoint4ImageY);

			}

			// closes file
			inputFile.close();

			// catches exception and prints out corresponding text
		} catch (FileNotFoundException e) {

			System.out.println("File Error");
		}

	}

	// This method fills the QuestionActivity Array with QuestionActivity Objects
	private void fillQuestionActivity() {

		// tries to read file into program
		try {

			// stores file as Scanner Object
			Scanner inputFile = new Scanner(new File("questionsActivity.csv"));

			// uses delimiter to avoid characters in file
			inputFile.useDelimiter(",|\r\n");

			// loops through each element in file
			for (int index = 0; index < CAIApplication.questionsActivityArray.length; index++) {

				// reads one line from file and converts it to corresponding type in
				// QuestionActivity
				// Object Class
				String question = inputFile.next();
				String answer = inputFile.next();

				// creates Object
				CAIApplication.questionsActivityArray[index] = new QuestionActivity(question, answer);

			}

			// closes file
			inputFile.close();

			// catches exception and prints out corresponding text
		} catch (FileNotFoundException e) {

			System.out.println("File Error");
		}

	}

	// This method fills the QuestionAssessment Array with the QuestionAssessment
	// Object
	private void fillQuestionAssessment() {

		// tries to read file into program
		try {

			// stores file as Scanner Object
			Scanner inputFile = new Scanner(new File("questionsAssessment.csv"));

			// uses delimiter to avoid characters
			inputFile.useDelimiter(",|\r\n");

			// loops through each element in file
			for (int index = 0; index < CAIApplication.questionsAssessmentArray.length; index++) {

				// reads one line from file and converts it to corresponding type in Laptop
				// Object Class
				String question = inputFile.next();
				String answers = inputFile.next();
				String typeQuestions = inputFile.next();

				// creates Object
				CAIApplication.questionsAssessmentArray[index] = new QuestionAssessment(question, answers,
						typeQuestions);

			}

			// closes file
			inputFile.close();

			// catches exception and prints out corresponding text
		} catch (FileNotFoundException e) {

			System.out.println("File Error");
		}

	}

}
