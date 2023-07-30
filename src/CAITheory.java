import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//Samiksha Satthy
//This class displays the theories within a selected concept 

public class CAITheory extends JFrame implements ActionListener {

	// images needed for this frame
	ImageIcon THEORY_BACKGROUND = new ImageIcon("images/theory background.png");
	ImageIcon THEORY_TEXT_BACKGROUND = new ImageIcon("images/theory text background.png");
	ImageIcon ARROW_NEXT = new ImageIcon("images/next.png");
	ImageIcon ARROW_BACK = new ImageIcon("images/back.png");
	ImageIcon PAUSE = new ImageIcon("images/pause.png");
	ImageIcon theoryExample = new ImageIcon();

	// GUI elements needed for this frame
	JLabel title = new JLabel();
	JLabel theoryBackground = new JLabel(THEORY_BACKGROUND);
	JLabel textTheoryBackground = new JLabel(THEORY_TEXT_BACKGROUND);
	String[] mockTitles = new String[5];
	JLabel topicTitle = new JLabel();
	JLabel[] bulletPoints = new JLabel[3];
	JButton next = new JButton(ARROW_NEXT);
	JButton back = new JButton(ARROW_BACK);
	JButton pause = new JButton(PAUSE);
	JLabel code = new JLabel();;

	// colorbar under ToolBar for the placement of the different tabs and aesthetic
	JLabel colourbar = new JLabel();

	// ToolBar - contains different tabs
	JButton conceptsButton = new JButton("Concepts");
	JButton activityButton = new JButton("Activity");
	JButton assessmentButton = new JButton("Assessment");

	// constructor method
	public CAITheory() {

		createToolBar();

		createInitialComponents();

		createFlashcards();

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

	// This method creates the next and back button; the title of the screen and
	// backgrounds
	private void createInitialComponents() {

		// sets title (text, font, bounds) and adds it to frame
		title.setText("THEORY");
		title.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 75));
		title.setBounds(550, 20, 263, 100);
		add(title);

		// sets bounds of next and adds ActionListener and adds it to frame
		next.setBounds(1296, 336, 40, 35);
		next.addActionListener(this);
		add(next);

		// sets bounds of back and adds ActionListener and adds it to frame
		back.setBounds(20, 336, 40, 35);
		back.addActionListener(this);
		add(back);

	}

	// This method creates the flashcards that display the different information
	private void createFlashcards() {

		// set layout of both the background of the entire theory and the text
		textTheoryBackground.setLayout(null);
		theoryBackground.setLayout(null);

		// checks to see if it is setting the first theory flashcard
		if (CAIApplication.IndexTheory == 0) {

			// sets the title
			topicTitle.setText(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonOne());

			// iterates through all bullet points
			for (int index = 0; index < bulletPoints.length; index++) {

				// creates bullet points
				bulletPoints[index] = new JLabel();

				// checks to see if it is creating the first bullet point
				if (index == 0) {

					// set text according to what is stated on the file
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonOnePoint1()
							+ "</li></ul></html>");

					// set the bounds of that text according to what was indicated on file
					bulletPoints[index].setBounds(50,
							CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint1PointsY(), 950, 70);
				}

				// checks to see if it is creating the second bullet point
				else if (index == 1) {

					// set text according to what is stated on the file
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonOnePoint2()
							+ "</li></ul></html>");

					// set the bounds of that text according to what was indicated on file
					bulletPoints[index].setBounds(50,
							CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint1PointsY() + 100, 900,
							70);
				}

				// checks to see if it is creating the third bullet point
				else {

					// set text according to what is stated on the file
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonOnePoint3()
							+ "</li></ul></html>");

					// set the bounds of that text according to what was indicated on file
					bulletPoints[index].setBounds(50,
							CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint1PointsY() + 200, 920,
							70);

				}

				// sets fonts of the bullet points and adds them to theory background
				bulletPoints[index].setFont(new Font("Times New Roman", Font.PLAIN, 20));
				textTheoryBackground.add(bulletPoints[index]);

				// creates new image icon for lesson one
				theoryExample = new ImageIcon(
						CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonOneImage());

				// sets the icon to code label and corresponding bounds
				code.setIcon(theoryExample);
				code.setBounds(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint1ImageX(),
						CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint1ImageY(),
						theoryExample.getIconWidth(), theoryExample.getIconHeight());

				// adds image to text background
				textTheoryBackground.add(code);

				// sets the bounds of the theory title
				topicTitle.setBounds(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint1TitleX(), 5,
						2000, 100);

			}

			// checks to see if it is setting the second theory flashcard
		} else if (CAIApplication.IndexTheory == 1) {

			// sets the title
			topicTitle.setText(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonTwo());

			// iterates through all bullet points
			for (int index = 0; index < bulletPoints.length; index++) {

				// creates bullet points
				bulletPoints[index] = new JLabel();

				// checks to see if it is creating the first bullet point
				if (index == 0) {

					// set text according to what is stated on the file
					remove(bulletPoints[index]);
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonTwoPoint1()
							+ "</li></ul></html>");

					// set the bounds of that text according to what was indicated on file
					bulletPoints[index].setBounds(50, 10, 950, 70);

				}

				// checks to see if it is creating the second bullet point
				else if (index == 1) {

					// set text according to what is stated on the file
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonTwoPoint2()
							+ "</li></ul></html>");

					// set the bounds of that text to format it correctly
					bulletPoints[index].setBounds(50, 110, 900, 70);

				}

				// checks to see if it is creating the third bullet point
				else {

					// set text according to what is stated on the file
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonTwoPoint3()
							+ "</li></ul></html>");

					// set the bounds of that text according to what was indicated on file
					bulletPoints[index].setBounds(50, 210, 920, 70);

				}

				// sets fonts of the bullet points and adds them to theory background
				bulletPoints[index].setFont(new Font("Times New Roman", Font.PLAIN, 20));
				textTheoryBackground.add(bulletPoints[index]);

				// creates new image icon for lesson two
				theoryExample = new ImageIcon(
						CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonTwoImage());

				// sets the icon to code label and corresponding bounds
				code.setIcon(theoryExample);
				code.setBounds(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint2ImageX(),
						CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint2ImageY(),
						theoryExample.getIconWidth(), theoryExample.getIconHeight());

				// adds image to text background
				textTheoryBackground.add(code);

				// sets the bounds of the theory title
				topicTitle.setBounds(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint2TitleX(), 5,
						2000, 100);

			}

		}

		// checks to see if it is setting the third theory flashcard
		else if (CAIApplication.IndexTheory == 2) {

			// sets the title
			topicTitle.setText(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonThree());

			// iterates through all bullet points
			for (int index = 0; index < bulletPoints.length; index++) {

				// creates bullet points
				bulletPoints[index] = new JLabel();

				// checks to see if it is setting the first bullet point
				if (index == 0) {

					// set text according to what is stated on the file
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonThreePoint1()
							+ "</li></ul></html>");

					// set the bounds of that text according to what was indicated on file
					bulletPoints[index].setBounds(50, 5, 950, 70);

				}

				// checks to see if it is setting the second bullet point
				else if (index == 1) {

					// set text according to what is stated on the file
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonThreePoint2()
							+ "</li></ul></html>");

					// set the bounds of that text according to what was indicated on file
					bulletPoints[index].setBounds(50, 105, 900, 50);

				}

				// checks to see if it is setting the third bullet point
				else {

					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonThreePoint3()
							+ "</li></ul></html>");

					bulletPoints[index].setBounds(50, 205, 920, 70);

				}

				// sets fonts of the bullet points and adds them to theory background
				bulletPoints[index].setFont(new Font("Times New Roman", Font.PLAIN, 20));
				textTheoryBackground.add(bulletPoints[index]);

				/// creates new image icon for lesson three
				theoryExample = new ImageIcon(
						CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonThreeImage());

				// sets the icon to code label and corresponding bounds
				code.setIcon(theoryExample);
				code.setBounds(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint3ImageX(),
						CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint3ImageY(),
						theoryExample.getIconWidth(), theoryExample.getIconHeight());

				// adds image to text background
				textTheoryBackground.add(code);

				// sets the bounds of the theory title
				topicTitle.setBounds(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint3TitleX(), 5,
						2000, 100);

			}

		}

		// checks to see if it is setting the fourth theory flashcard
		else if (CAIApplication.IndexTheory == 3) {

			// sets the title
			topicTitle.setText(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonFour());

			// iterates through all bullet points
			for (int index = 0; index < bulletPoints.length; index++) {

				// creates bullet points
				bulletPoints[index] = new JLabel();

				// checks to see if it is setting the first bullet point
				if (index == 0) {

					// set text according to what is stated on the file
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonFourPoint1()
							+ "</li></ul></html>");

					// set the bounds so every bullet point is formatted correctly
					bulletPoints[index].setBounds(50, 5, 950, 70);
				}

				// checks to see if it is setting the second bullet point
				else if (index == 1) {

					// set text according to what is stated on the file
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonFourPoint2()
							+ "</li></ul></html>");

					// set the bounds so every bullet point is formatted correctly
					bulletPoints[index].setBounds(50, 105, 900, 70);

				}

				// checks to see if it is setting the second bullet point
				else {

					// set text according to what is stated on the file
					bulletPoints[index].setText("<html><ul><li>"
							+ CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonFourPoint3()
							+ "</li></ul></html>");

					// set the bounds so every bullet point is formatted correctly
					bulletPoints[index].setBounds(50, 205, 920, 70);

				}

				// sets fonts of the bullet points and adds them to theory background
				bulletPoints[index].setFont(new Font("Times New Roman", Font.PLAIN, 20));
				textTheoryBackground.add(bulletPoints[index]);

				/// creates new image icon for last concept
				theoryExample = new ImageIcon(
						CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonFourImage());

				// sets the icon to code label and corresponding bounds
				code.setIcon(theoryExample);
				code.setBounds(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint4ImageX(),
						CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint4ImageY(),
						theoryExample.getIconWidth(), theoryExample.getIconHeight());

				// adds image to text background
				textTheoryBackground.add(code);

				// sets the bounds of the theory title
				topicTitle.setBounds(CAIApplication.lessonsArray[CAIApplication.IndexPicked].getLessonPoint4TitleX(), 5,
						2000, 100);

			}

		}

		// once loop is complete, call set frame method
		setAdditionalComponents();
	}

	// This method sets the last components (frame, etc.)
	private void setAdditionalComponents() {

		// sets bounds of the text background and adds it to theory background
		textTheoryBackground.setBounds(85, 80, THEORY_TEXT_BACKGROUND.getIconWidth(),
				THEORY_TEXT_BACKGROUND.getIconHeight());
		theoryBackground.add(textTheoryBackground);

		// sets theory background (layout,background, font); adds the topic title to
		// background and adds it to frame
		theoryBackground.setLayout(null);
		theoryBackground.setBounds(80, 130, THEORY_BACKGROUND.getIconWidth(), THEORY_BACKGROUND.getIconHeight());
		topicTitle.setFont(new Font("Engravers MT", Font.PLAIN, 35));
		theoryBackground.add(topicTitle);
		add(theoryBackground);

		// sets size, default close, background, layout and visibility
		setSize(1366, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(0xE7DAFF));
		setLayout(null);
		setVisible(true);

	}

	// ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {

		// checks to see if the next button is picked
		if (e.getSource() == next) {

			// ensures that index doesn't go out of bounds
			if (CAIApplication.IndexTheory <= 2) {

				// modifies index accordingly
				CAIApplication.IndexTheory += 1;

				remove();

			}

			// if index does go out of bounds
			else {

				// modify accordingly
				CAIApplication.IndexTheory = 0;

				remove();
			}

		}

		// checks to see if back button is picked
		else if (e.getSource() == back) {

			// ensures that index doesn't go out of bounds
			if (CAIApplication.IndexTheory > 0) {

				// modifies index accordingly
				CAIApplication.IndexTheory -= 1;

				remove();
			}

			// if index does go out of bounds
			else {

				// modify accordingly
				CAIApplication.IndexTheory = 3;

				remove();
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

	// This method removes all of the lesson components from the screen, revalidates
	// and runs the program that sets these components again to display new data
	private void remove() {

		// remove components
		remove(theoryBackground);
		theoryBackground.remove(textTheoryBackground);
		textTheoryBackground.remove(bulletPoints[0]);
		textTheoryBackground.remove(bulletPoints[1]);
		textTheoryBackground.remove(bulletPoints[2]);
		textTheoryBackground.remove(code);
		code.setIcon(null);

		// revalidate, repaint
		revalidate();
		repaint();

		// run method again
		createFlashcards();

	}

}
