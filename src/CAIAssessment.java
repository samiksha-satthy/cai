import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

//Samiksha Satthy 
//This method displays the assessment frame 

public class CAIAssessment extends JFrame implements ActionListener {

	// images required for this frame
	ImageIcon choicesBackgroundImage = new ImageIcon("images/choices background.png");
	ImageIcon questionBackgroundImage = new ImageIcon("images/assessment question.png");

	// All GUI components needed for this frame
	JLabel title = new JLabel();
	JLabel questionBackground[] = new JLabel[3];
	JLabel choicesBackground = new JLabel(choicesBackgroundImage);
	JRadioButton[] questionChoicesRB = new JRadioButton[4];
	JRadioButton[] questionChoicesRB2 = new JRadioButton[4];
	JTextField questionTextField = new JTextField();
	ButtonGroup buttonGroup1 = new ButtonGroup();
	ButtonGroup buttonGroup2 = new ButtonGroup();
	JComboBox<String> choicesCombo = new JComboBox<String>();
	JButton submit = new JButton("SUBMIT!");
	JLabel question1 = new JLabel();
	JLabel question2 = new JLabel();
	JLabel question3 = new JLabel();

	// colorbar under ToolBar for the placement of the different tabs and aesthetic
	JLabel colourbar = new JLabel();

	// ToolBar - contains different tabs
	JButton conceptsButton = new JButton("Concepts");
	JButton activityButton = new JButton("Activity");
	JButton assessmentButton = new JButton("Assessment");

	// used to generate random numbers
	Random random = new Random();

	// store indexes of all questions
	int questionIndex1;
	int questionIndex2;
	int questionIndex3;

	// generates random question and choices each time user does assessment
	int randomChoices[] = new int[4];
	int randomChoice;
	int randomIndexQuestion[] = new int[4];

	// stores choices into String for combobox
	String[] choices = new String[4];

	// constructor method
	public CAIAssessment() {

		createToolBar();

		setInitialComponents();

		generateQuestion1();

		generateQuestion2();

		generateQuestion3();

		setFrame();

	}

	// This method creates a toolbar
	private void createToolBar() {

		// Colour bar
		colourbar.setBounds(0, 0, 1366, 40);
		colourbar.setBackground(new Color(0xCCB6F6)); // sets colour for aesthetic purposes
		colourbar.setOpaque(true); // sets transparency
		getContentPane().add(colourbar); // adds colour bar to frame

		// Concepts Button
		conceptsButton.setBounds(0, 0, 150, 40);
		conceptsButton.setFont(new Font("Serif", Font.PLAIN, 15)); // sets font and size of text
		conceptsButton.setBackground(new Color(0xCCB6F6)); // sets colour for aesthetic purposes
		conceptsButton.addActionListener(this);
		colourbar.add(conceptsButton);

		// Activity Button
		activityButton.setBounds(150, 0, 150, 40);
		activityButton.setFont(new Font("Serif", Font.PLAIN, 15));
		activityButton.addActionListener(this);
		activityButton.setBackground(new Color(0xCCB6F6));
		colourbar.add(activityButton);

		// Assessment Button
		assessmentButton.setBounds(300, 0, 150, 40);
		assessmentButton.setFont(new Font("Serif", Font.PLAIN, 15));
		assessmentButton.addActionListener(this);
		assessmentButton.setBackground(new Color(0xCCB6F6));
		colourbar.add(assessmentButton);

	}

	// This method sets the initial components of the frame
	private void setInitialComponents() {

		// sets text, font, bounds of title and adds to frame
		title.setText("ASSESSMENT");
		title.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 75));
		title.setBounds(440, 70, 686, 106);
		getContentPane().add(title);

		// sets font and bounds of submit button, adds to ActionListener and frame
		submit.setFont(new Font("Rockwell", Font.PLAIN, 15));
		submit.setBounds(565, 599, 174, 56);
		submit.addActionListener(this);
		getContentPane().add(submit);

		// generates background for each question
		for (int index = 0; index < questionBackground.length; index++) {

			// creates new label, sets font, text position, layout, bounds and adds to frame
			questionBackground[index] = new JLabel(questionBackgroundImage);
			questionBackground[index].setFont(new Font("SimSun-ExtB", Font.BOLD, 12));
			questionBackground[index].setHorizontalTextPosition(JLabel.CENTER);
			questionBackground[index].setLayout(null);
			questionBackground[index].setBounds(20 + (index * 500), 190, questionBackgroundImage.getIconWidth(),
					questionBackgroundImage.getIconHeight());
			getContentPane().add(questionBackground[index]);

		}

	}

	// This method generates the first question and the choices
	private void generateQuestion1() {

		// generates random question
		CAIApplication.radioButtonQuestion = (int) (0 + (Math.random() * 11));

		// sets first question background to the text of the question
		questionBackground[0].setText(
				"<html>1. " + CAIApplication.questionsAssessmentArray[CAIApplication.radioButtonQuestion].getQuestion()
						+ "</html>");

		// generates a random index and stores that index of Array as the question index
		randomChoice = (int) (0 + (Math.random() * 4));
		randomChoices[randomChoice] = CAIApplication.radioButtonQuestion;

		// finds random choices
		findChoices(CAIApplication.radioButtonQuestion);

		// creates radio buttons
		createRadioButtons(questionChoicesRB, buttonGroup1, 30);

		// assigns first index with current question index
		questionIndex1 = CAIApplication.radioButtonQuestion;

		// loops until it finds another index that isn't the same as the previous index
		do {

			CAIApplication.radioButtonQuestion = (int) random.nextInt(11);

		} while (questionIndex1 == CAIApplication.radioButtonQuestion);

	}

	// This method find random choices
	private void findChoices(int question) {

		// loops through all elements in randomChoices array
		for (int index = 0; index < randomChoices.length; index++) {

			// checks to make sure that the randomly generated index ins't the current index
			if (index != randomChoice) {

				loop(index, question);

				// checks to see if the loop is on the first index
				if (index == 1) {

					// checks to see if the choice is the same as the previous choice, and finds
					// another index if it is
					while (randomChoices[index] == randomChoices[index - 1])
						loop(index, question);
				}

				// checks to see if the loop is on the second index
				else if (index == 2) {

					// checks to see if the choice is the same as the previous choices, and finds
					// another index if it is
					while (randomChoices[index] == randomChoices[index - 1]
							|| randomChoices[index] == randomChoices[index - 2])
						loop(index, question);
				}

				// checks to see if the loop is on the third index
				else if (index == 3) {

					// checks to see if the choice is the same as the previous choices, and finds
					// another index if it is
					while (randomChoices[index] == randomChoices[index - 1]
							|| randomChoices[index] == randomChoices[index - 2]
							|| randomChoices[index] == randomChoices[index - 3])
						loop(index, question);

				}

			}

		}

	}

	// This method randomly generates an index from all of the QuestionActivity
	// objects stored from file
	private void loop(int index, int question) {

		// loops to ensure that the random answer generated is not the same as the
		// actual answer
		do {

			// sets the index as the random number
			randomChoices[index] = (int) (0 + (Math.random() * 11));

		} while (CAIApplication.questionsAssessmentArray[randomChoices[index]].getAnswers()
				.contains(CAIApplication.questionsAssessmentArray[question].getAnswers()));

	}

	// This method creates radiobuttons
	private void createRadioButtons(JRadioButton[] radioButtons, ButtonGroup buttonGroup, int xBound) {

		// loops through all the question
		for (int radioButton = 0; radioButton < radioButtons.length; radioButton++) {

			// sets general settings to radio buttons
			radioButtons[radioButton] = new JRadioButton();
			radioButtons[radioButton].setBackground(new Color(0xFFFFFF));
			buttonGroup.add(radioButtons[radioButton]);
			radioButtons[radioButton].setHorizontalTextPosition(JLabel.RIGHT);
			radioButtons[radioButton].setBounds(xBound, 300 + (radioButton * 60),
					questionBackgroundImage.getIconWidth(), 50);

			// if first radio button is being created, set corresponding text
			if (radioButton == 0) {

				radioButtons[radioButton].setText(
						"<html>" + CAIApplication.questionsAssessmentArray[randomChoices[0]].getAnswers() + "</html>");

			}

			// if second radio button is being created, set corresponding text
			else if (radioButton == 1) {

				radioButtons[radioButton].setText(
						"<html>" + CAIApplication.questionsAssessmentArray[randomChoices[1]].getAnswers() + "</html>");

			}

			// if third radio button is being created, set corresponding text
			else if (radioButton == 2) {

				radioButtons[radioButton].setText(
						"<html>" + CAIApplication.questionsAssessmentArray[randomChoices[2]].getAnswers() + "</html>");

			}

			// if fourth radio button is being created, set corresponding text
			else if (radioButton == 3) {

				radioButtons[radioButton].setText(
						"<html>" + CAIApplication.questionsAssessmentArray[randomChoices[3]].getAnswers() + "</html>");

			}

			// add all radiobuttons to corresponding group
			getContentPane().add(radioButtons[radioButton]);

		}

	}

	// This method generates the second question and choices
	private void generateQuestion2() {

		// sets question to already random generated question index
		questionBackground[1].setText(
				"<html>2. " + CAIApplication.questionsAssessmentArray[CAIApplication.radioButtonQuestion].getQuestion()

						+ "</html>");

		// generates a random index and stores that index of Array as the question index
		randomChoice = (int) (0 + (Math.random() * 4));
		randomChoices[randomChoice] = CAIApplication.radioButtonQuestion;

		// finds random choices
		findChoices(CAIApplication.radioButtonQuestion);

		// loops through all of the rabdom choices
		for (int index = 0; index < randomChoices.length; index++) {

			// gets their answer and stores them in String Array
			choices[index] = CAIApplication.questionsAssessmentArray[randomChoices[index]].getAnswers();

		}

		// assigns that String Array to model of combobox
		choicesCombo.setModel(new DefaultComboBoxModel(choices));

		// sets bounds and adds combobox to frame
		choicesCombo.setBounds(415, 300, 425, 75);
		getContentPane().add(choicesCombo);

		// stores current question index in this variable
		questionIndex2 = CAIApplication.radioButtonQuestion;

		// randomly generates an index that is not equal to this one or the previous one
		do {

			CAIApplication.radioButtonQuestion = (int) random.nextInt(11);

		} while (questionIndex1 == CAIApplication.radioButtonQuestion
				|| questionIndex2 == CAIApplication.radioButtonQuestion);
	}

	// This method generates third question and answers
	private void generateQuestion3() {

		// sets text of third question to already randomly generated question
		questionBackground[2].setText(
				"<html>3. " + CAIApplication.questionsAssessmentArray[CAIApplication.radioButtonQuestion].getQuestion()
						+ "</html>");

		// generates a random index and stores that index of Array as the question index
		randomChoice = (int) (0 + (Math.random() * 4));
		randomChoices[randomChoice] = CAIApplication.radioButtonQuestion;

		// finds choices
		findChoices(CAIApplication.radioButtonQuestion);

		createRadioButtons(questionChoicesRB2, buttonGroup2, 1020);

		// assigns index 3 to current index question
		questionIndex3 = CAIApplication.radioButtonQuestion;

	}

	// This method sets the frame
	private void setFrame() {

		// sets components such as size, close operation, background, layout and
		// visibility
		setSize(1366, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(0xE7DAFF));
		setLayout(null);
		setVisible(true);

	}

	// ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {

		// checks to see if submit buttons was picked
		if (e.getSource() == submit) {

			checkUserAnswers();

			// checks to see if user got perfect
			if (CAIApplication.scoreCount == 3) {

				// displays JDialog informing they got perfect with two options
				Object[] options = { "Ok", "Generate Certificate" };
				int option = JOptionPane.showOptionDialog(this,
						"ASSESSMENT COMPLETE, YOUR SCORE IS: " + CAIApplication.scoreCount + "/3", "WINNER",
						JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, // do not use a custom Icon
						options, // the titles of buttons
						options[0]); // default button title

				// if user clicks generate certificate..
				if (option == 1) {

					// dispose of current frame, open certificate frame FIRST and main menu
					dispose();
					new CAIMainMenu();
					new CAICertificate();

				}

				// else...
				else {

					// just dispose of this frame and open main menu
					dispose();
					new CAIMainMenu();
				}

				// reset score so that the user can complete assessment each time
				CAIApplication.scoreCount = 0;
			}

			// if user didn't get perfect
			else {

				// display Dialog and wish them luck next time
				JOptionPane.showMessageDialog(this, "ASSESSMENT COMPLETE, YOUR SCORE IS: " + CAIApplication.scoreCount
						+ "/3. Better luck next time!", "Score", JOptionPane.INFORMATION_MESSAGE);

				// dispose of this screen and open main menu and reset public variable to 0
				dispose();
				new CAIMainMenu();
				CAIApplication.scoreCount = 0;
			}

		}

		// checks to see if any buttons on Tool Bar are clicked and open according
		// frames
		else if (e.getSource() == conceptsButton) {

			dispose();
			new CAIConcepts();
		}

		else if (e.getSource() == activityButton) {

			dispose();
			new CAIActivity();
		}

		else if (e.getSource() == assessmentButton) {

			dispose();
			new CAIAssessment();
		}

	}

	// This method checks the users answers
	private void checkUserAnswers() {

		// loops through first set of radiobuttons to identify which one is selected
		for (int index = 0; index < questionChoicesRB.length; index++) {

			if (questionChoicesRB[index].isSelected()) {

				// if selected radio button is the right answer
				if (questionChoicesRB[index].getText()
						.contains(CAIApplication.questionsAssessmentArray[questionIndex1].getAnswers())) {

					// increment score
					CAIApplication.scoreCount++;

				}

			}
		}

		// checks to see if selected item in combo box is correct
		if (choicesCombo.getSelectedItem().toString()
				.contains(CAIApplication.questionsAssessmentArray[questionIndex2].getAnswers())) {

			// increments score
			CAIApplication.scoreCount++;

		}

		// loops through second set of radiobuttons to identify which one is selected
		for (int index = 0; index < questionChoicesRB2.length; index++) {

			if (questionChoicesRB2[index].isSelected()) {

				// if selected radio button is the right answer
				if (questionChoicesRB2[index].getText()
						.contains(CAIApplication.questionsAssessmentArray[questionIndex3].getAnswers())) {

					// increment score
					CAIApplication.scoreCount++;

				}

			}
		}

	}
}
