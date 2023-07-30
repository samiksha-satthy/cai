import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//Samiksha Satthy
//This class displays the homepage of the activity 

public class CAIActivity extends JFrame implements ActionListener {

	// All GUI components needed for this frame
	JLabel title = new JLabel();
	JButton play = new JButton();
	JButton instructions = new JButton();

	// colorbar under ToolBar for the placement of the different tabs and aesthetic
	JLabel colourbar = new JLabel();

	// ToolBar - contains different tabs
	JButton conceptsButton = new JButton("Concepts");
	JButton activityButton = new JButton("Activity");
	JButton assessmentButton = new JButton("Assessment");

	// constructor method
	public CAIActivity() {

		createToolBar();

		setTitle();

		setPlay();

		setInstructions();

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

	// This method sets the title of the frame
	private void setTitle() {

		// sets text, font, bounds and adds to frame
		title.setText("ACTIVITY: MATCHING GAME");
		title.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 75));
		title.setBounds(326, 11, 800, 200);
		getContentPane().add(title);

	}

	// This method displays the play button
	private void setPlay() {

		// sets text, font, background, bounds and adds ActionListener and adds to frame
		play.setText("PLAY");
		play.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 40));
		play.setBackground(new Color(0xBD95EB));
		play.setBounds(588, 287, 200, 100);
		play.addActionListener(this);
		add(play);

	}

	// This method displays the instructions button
	private void setInstructions() {

		// sets text, font, background, bounds and adds ActionListener and adds to frame
		instructions.setText("INSTRUCTIONS");
		instructions.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 40));
		instructions.setBackground(new Color(0x9957E6));
		instructions.setBounds(552, 425, 273, 100);
		instructions.addActionListener(this);
		add(instructions);

	}

	// This method sets the frame
	private void setFrame() {

		// size, close operation, background, layout, visibility
		setSize(1366, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(0xE7DAFF));
		getContentPane().setLayout(null);
		setVisible(true);

	}

	// ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {

		// checks to see if play button is clicked
		if (e.getSource() == play) {

			// disposes this frame and runs the activity game
			new CAIActivityGame();
			dispose();
		}

		// checks to see if user has clicked instructions button
		else if (e.getSource() == instructions) {

			displayInstructions();

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

	// This method displays the first set of instructions
	private void displayInstructions() {

		// JDialog to display first set
		Object[] options = { "Next" }; // only next button option
		int button = JOptionPane.showOptionDialog(this,
				"Welcome to the Activity Page! Click Next to look at further instructions!", "Instructions Information",
				JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, // do not use a custom Icon
				options, // the titles of buttons
				options[0]); // default button title

		// if next button is clicked, open second instructions page
		if (button == 0) {

			displayInstructions2();
		}

	}

	// This method displays the second set of instructions
	private void displayInstructions2() {

		// JDialog to display second set
		Object[] options = { "Next", "Back" }; // the titles of buttons
		int button = JOptionPane.showOptionDialog(this,
				"You will be asked a questions and be given 4 answers. Drag the saucer around to answer the question",
				"Instructions 2", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); // default
																														// button
																														// title

		// if next button is clicked, open third instructions page
		if (button == 0) {

			displayInstructions3();

		}

		// if back button is clicked, open first instructions page
		else if (button == 1) {

			displayInstructions();
		}

	}

	// This method displays the third set of instructions
	private void displayInstructions3() {

		// JDialog to display third set
		Object[] options = { "Next", "Back" }; // the titles of buttons
		int button = JOptionPane.showOptionDialog(this,
				"If you click on the wrong answer, you will be notified and can try again. "
						+ "If you don't answer by the time give, you will automatixally not be able to answer the question",
				"Instructions 3", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); // default
																														// button
																														// title

		// if next button is clicked, open fourth instructions page
		if (button == 0) {

			displayInstructions4();

		}

		// if back button is clicked, open second instructions page
		else if (button == 1) {

			displayInstructions2();
		}

	}

	// This method displays the fourth instruction
	private void displayInstructions4() {

		JOptionPane.showMessageDialog(this, "HAVE FUN!", "instructions end", JOptionPane.INFORMATION_MESSAGE);

	}

}
