import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//Samiksha Satthy
//This class displays all of the Concepts for the user to look through; 5 in total 

public class CAIConcepts extends JFrame implements ActionListener {

	// images needed for the frame
	ImageIcon PURPLE_BACK = new ImageIcon("images/purple lesson background.png");
	ImageIcon CIRCLE = new ImageIcon("images/whitecircle.png");
	ImageIcon LIGHT_PURPLE_BUTTON = new ImageIcon("images/button background.png");
	ImageIcon ARROW_NEXT = new ImageIcon("images/next.png");
	ImageIcon ARROW_BACK = new ImageIcon("images/back.png");

	// GUI components needed for the frame
	JLabel title = new JLabel();
	JLabel[] circles = new JLabel[3];
	JLabel[] lessonNumber = new JLabel[3];
	JLabel[] titlesLesson = new JLabel[3];
	JLabel[] purpleBackgrounds = new JLabel[3];
	String header = "";
	JButton[] theory = new JButton[3];
	JButton next = new JButton(ARROW_NEXT);
	JButton back = new JButton(ARROW_BACK);

	// colorbar under ToolBar for the placement of the different tabs and aesthetic
	JLabel colourbar = new JLabel();

	// ToolBar - contains different tabs
	JButton conceptsButton = new JButton("Concepts");
	JButton activityButton = new JButton("Activity");
	JButton assessmentButton = new JButton("Assessment");

	// constructor method
	public CAIConcepts() {

		createToolBar();

		setInitialComponents();

		setLesson();

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

	// This method adds the title, next and back button to the frame
	private void setInitialComponents() {

		// sets components of title (text, font, bounds) and adds it to frame
		title.setText("CONCEPTS");
		title.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 75));
		title.setBounds(545, 50, 304, 86);
		add(title);

		// sets bounds of next button and adds it to ActionListener and frame
		next.setBounds(1296, 336, 40, 35);
		next.addActionListener(this);
		add(next);

		// sets bounds of back button and adds it to ActionListener and frame
		back.setBounds(20, 336, 40, 35);
		back.addActionListener(this);
		add(back);

	}

	// This method sets the lesson boxes
	private void setLesson() {

		// iterates through the three boxes that are going to be added to frame
		for (int index = 0; index < purpleBackgrounds.length; index++) {

			// creates new purple background label in which all text for lessons will be
			// displayed
			purpleBackgrounds[index] = new JLabel(PURPLE_BACK);
			purpleBackgrounds[index].setLayout(null);

			// creates circle labels and scales image of circle and sets common things
			// (layout, bounds, icon)
			circles[index] = new JLabel();
			Image newCircle = CIRCLE.getImage();
			Image scaledImage = newCircle.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
			ImageIcon scaledCircle = new ImageIcon(scaledImage);
			circles[index].setIcon(scaledCircle);
			circles[index].setLayout(null);
			circles[index].setBounds(100, 20, 150, 150);

			// creates a new label for the title of the lesson
			titlesLesson[index] = new JLabel();

			// checks to see if it is setting the first lesson box
			if (index == 0) {

				// identifies lesson number
				lessonNumber[index] = new JLabel("" + (CAIApplication.Index1Concepts + 1));

				// sets bounds of the purple background to the frame
				purpleBackgrounds[index].setBounds(100, 150, PURPLE_BACK.getIconWidth(), PURPLE_BACK.getIconHeight());

			}

			// checks to see if it is setting the second lesson box
			else if (index == 1) {

				// identifies lesson number
				lessonNumber[index] = new JLabel("" + (CAIApplication.Index2Concepts + 1));

				// sets bounds of the purple background to the frame
				purpleBackgrounds[index].setBounds(510, 200, PURPLE_BACK.getIconWidth(), PURPLE_BACK.getIconHeight());

			}

			// checks to see if it is setting the second lesson box
			else if (index == 2) {

				// identifies lesson number
				lessonNumber[index] = new JLabel("" + (CAIApplication.Index3Concepts + 1));

				// sets bounds of the purple background to the frame
				purpleBackgrounds[index].setBounds(920, 150, PURPLE_BACK.getIconWidth(), PURPLE_BACK.getIconHeight());

			}

			// sets general things for lesson number label (font, bound)
			lessonNumber[index].setFont(new Font("Times New Roman", Font.PLAIN, 60));
			lessonNumber[index].setBounds(60, 10, 100, 100);

			// creates a theory button in which users can click on to see the actual
			// contents of the lesson
			theory[index] = new JButton();
			theory[index].setText("THEORY");
			theory[index].setHorizontalTextPosition(JLabel.CENTER);
			theory[index].setBounds(75, 350, 200, 50);
			theory[index].setBackground(new Color(0xCCB6F6));
			theory[index].addActionListener(this);

			// adds all of the components onto one another and eventually on frame
			circles[index].add(lessonNumber[index]);
			purpleBackgrounds[index].add(theory[index]);
			purpleBackgrounds[index].add(circles[index]);
			purpleBackgrounds[index].add(titlesLesson[index]);
			add(purpleBackgrounds[index]);

		}

		// once end of method is reached, run set titles method
		setTitles();

	}

	// This method sets the titles of each lesson
	private void setTitles() {

		// from the first lesson index to the third one
		for (int index = CAIApplication.Index1Concepts; index <= CAIApplication.Index3Concepts; index++) {

			// Initialize header
			header = "";

			// split the words in the title from the external text file with corresponding
			// character
			String[] split = CAIApplication.lessonsArray[index].getConceptTitle().split("-");

			// add that word to the header, and format, center and break
			for (String word : split) {
				header += "<html><center>" + word + "<Br>";

				// checks to see if it is setting the first title
				if (index == CAIApplication.Index1Concepts) {

					// set the text of the first lesson
					titlesLesson[0].setText(header);

					// set the font with the corresponding size according to the file
					titlesLesson[0].setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN,
							CAIApplication.lessonsArray[CAIApplication.Index1Concepts].getConceptTitleSize()));

					// set the bounds with the corresponding bounds in the file
					titlesLesson[0].setBounds(
							CAIApplication.lessonsArray[CAIApplication.Index1Concepts].getConceptTitleX(),
							CAIApplication.lessonsArray[CAIApplication.Index1Concepts].getConceptTitleY(), 375, 200);
				}

				// checks to see if it is setting the second title
				else if (index == CAIApplication.Index2Concepts) {

					// set the text of the second lesson
					titlesLesson[1].setText(header);

					// set the font with the corresponding size according to the file
					titlesLesson[1].setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN,
							CAIApplication.lessonsArray[CAIApplication.Index2Concepts].getConceptTitleSize()));

					// set the bounds with the corresponding bounds in the file
					titlesLesson[1].setBounds(
							CAIApplication.lessonsArray[CAIApplication.Index2Concepts].getConceptTitleX(),
							CAIApplication.lessonsArray[CAIApplication.Index2Concepts].getConceptTitleY(), 375, 200);

				}

				// checks to see if it is setting the third title
				else if (index == CAIApplication.Index3Concepts) {

					// set the text of the third lesson
					titlesLesson[2].setText(header);

					// set the font with the corresponding size according to the file
					titlesLesson[2].setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN,
							CAIApplication.lessonsArray[CAIApplication.Index3Concepts].getConceptTitleSize()));

					// set the bounds with the corresponding bounds in the file
					titlesLesson[2].setBounds(
							CAIApplication.lessonsArray[CAIApplication.Index3Concepts].getConceptTitleX(),
							CAIApplication.lessonsArray[CAIApplication.Index3Concepts].getConceptTitleY(), 375, 200);
				}

			}

		}

	}

	// This method sets the frame
	private void setFrame() {

		// sets components such as layout, size, close operation, background and
		// visibility
		setLayout(null);
		setSize(1366, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(0xE7DAFF));
		setVisible(true);

	}

	// ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {

		// checks to see if the next button has been picked
		if (e.getSource() == next) {

			// checks to make sure that index will not go out of bounds
			if (CAIApplication.Index3Concepts + 1 < CAIApplication.lessonsArray.length) {

				// updates the necessary lessons indexes
				CAIApplication.Index1Concepts++;
				CAIApplication.Index2Concepts++;
				CAIApplication.Index3Concepts++;

				remove();

				// sets lesson to make components again
				setLesson();

			}

			// if index does go out of bounds
			else {

				// updates the necessary lessons indexes
				CAIApplication.Index1Concepts = 0;
				CAIApplication.Index2Concepts = 1;
				CAIApplication.Index3Concepts = 2;

				remove();

				// sets lesson to make components again
				setLesson();
			}
		}

		// checks to see if the back button has been picked
		else if (e.getSource() == back) {

			// makes sure that index doesn't go out of bounds
			if (CAIApplication.Index1Concepts - 1 >= 0) {

				// updates the necessary lesson indexes
				CAIApplication.Index1Concepts--;
				CAIApplication.Index2Concepts--;
				CAIApplication.Index3Concepts--;

				remove();

				// sets lesson to make components again
				setLesson();

			}

			// if that index does go out of bounds
			else {

				// updates the necessary lessons indexes
				CAIApplication.Index1Concepts = 2;
				CAIApplication.Index2Concepts = 3;
				CAIApplication.Index3Concepts = 4;

				remove();

				// sets lesson to make components again
				setLesson();

			}

		}

		// checks to see if any of theory buttons have been chosen
		else if (e.getSource() == theory[0] || e.getSource() == theory[1] || e.getSource() == theory[2]) {

			// updates index picked based on the lesson the user picked on to ensure that
			// they see the right content
			if (e.getSource() == theory[0])
				CAIApplication.IndexPicked = CAIApplication.Index1Concepts;

			else if (e.getSource() == theory[1])
				CAIApplication.IndexPicked = CAIApplication.Index2Concepts;

			else
				CAIApplication.IndexPicked = CAIApplication.Index3Concepts;

			// opens the theory frame and disposes this one
			new CAITheory();
			dispose();

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

	// This method removes the lesson components from the frame
	private void remove() {

		// loops through, removes, repaints and revalidates
		for (int index = 0; index < purpleBackgrounds.length; index++) {
			remove(purpleBackgrounds[index]);
			repaint();
			revalidate();

		}

	}
}
