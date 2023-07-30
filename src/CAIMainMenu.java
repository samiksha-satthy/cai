import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//Samiksha Satthy
//This class is what the users will see once they have entered their initials; they will be presented with three options

public class CAIMainMenu extends JFrame implements ActionListener {

	// images needed for the frame
	ImageIcon PURPLE_BACK = new ImageIcon("images/purple background.png");
	ImageIcon CONCEPTS_PICTURE = new ImageIcon("images/concepts logo.png");
	ImageIcon ACTIVITY_PICTURE = new ImageIcon("images/activity logo.png");
	ImageIcon ASSESSMENT_PICTURE = new ImageIcon("images/assessment logo.png");

	// different GUI components needed for the frame
	JLabel title = new JLabel();
	JLabel welcome = new JLabel();
	JLabel conceptPicture = new JLabel(CONCEPTS_PICTURE);
	JLabel activityPicture = new JLabel(ACTIVITY_PICTURE);
	JLabel assessmentPicture = new JLabel(ASSESSMENT_PICTURE);
	JLabel conceptsTitle = new JLabel("CONCEPTS");
	JLabel activityTitle = new JLabel("ACTIVITY");
	JLabel assessmentTitle = new JLabel("ASSESSMENT");
	JButton[] navigation = new JButton[3];

	// constructor method
	public CAIMainMenu() {

		setText();

		setButtons();

		setFrame();
	}

	// This method sets any of the texts onto the frame
	private void setText() {

		// sets the title text and other components (font, bounds) and adds it to frame
		title.setText("OBJECTS AND CLASSES");
		title.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 75));
		title.setBounds(351, 35, 686, 106);
		getContentPane().add(title);

		// sets the motto text and other components (font, bounds) and adds it to frame
		welcome.setText("WELCOME " + CAIApplication.initials + "!");
		welcome.setFont(new Font("Agency FB", Font.ITALIC, 45));
		welcome.setBounds(550, 127, 900, 88);
		getContentPane().add(welcome);

	}

	// This method sets the three navigation buttons to the frame
	private void setButtons() {

		// loops through each element in array
		for (int index = 0; index < navigation.length; index++) {

			// creates new JButton and sets other components (icon, background, layout) and
			// adds ActionListener to it
			navigation[index] = new JButton();
			navigation[index].setIcon(PURPLE_BACK);
			navigation[index].setBackground(new Color(0xBD95EB));
			navigation[index].setLayout(null);
			navigation[index].addActionListener(this);

			// checks to see if it is setting the first navigation box
			if (index == 0) {

				// sets concept title font and bounds and adds it to first navigation box
				conceptsTitle.setFont(new Font("Agency FB", Font.PLAIN, 50));
				conceptsTitle.setBounds(115, 0, 206, 90);
				navigation[index].add(conceptsTitle);

				// sets concept picture background and bounds and adds it to first navigation
				// box
				conceptPicture.setBounds(60, 75, 300, 325);
				conceptPicture.setBackground(new Color(0xBD95EB));
				navigation[index].add(conceptPicture);

				// sets position of first navigation box on frame
				navigation[index].setBounds(30, 275, 390, 415);

			}

			// checks to see if it is setting the second navigation box
			else if (index == 1) {

				// sets concept title font and bounds and adds it to second navigation box
				activityTitle.setFont(new Font("Agency FB", Font.PLAIN, 50));
				activityTitle.setBounds(125, 0, 206, 90);
				navigation[index].add(activityTitle);

				// sets concept picture background and bounds and adds it to second navigation
				// box
				activityPicture.setBounds(60, 75, 300, 325);
				activityPicture.setBackground(new Color(0xBD95EB));
				navigation[index].add(activityPicture);

				// sets position of second navigation box on frame
				navigation[index].setBounds(480, 275, PURPLE_BACK.getIconWidth(), PURPLE_BACK.getIconHeight());

			}

			// checks to see if it is setting the last navigation box
			else {
				navigation[index].setBounds(930, 275, PURPLE_BACK.getIconWidth(), PURPLE_BACK.getIconHeight());

				// sets concept title font and bounds and adds it to last navigation box
				assessmentTitle.setFont(new Font("Agency FB", Font.PLAIN, 50));
				assessmentTitle.setBounds(115, 0, 245, 90);
				navigation[index].add(assessmentTitle);

				// sets concept picture background and bounds and adds it to last navigation
				// box
				assessmentPicture.setBounds(60, 75, 300, 325);
				assessmentPicture.setBackground(new Color(0xBD95EB));

				// sets position of last navigation box on frame
				navigation[index].add(assessmentPicture);

			}

			// adds all navigation boxes to the frame
			add(navigation[index]);

		}

	}

	// This method sets the frame
	private void setFrame() {

		// sets components (size, default close, background, layout and visibility)
		setSize(1366, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(0xE7DAFF));
		getContentPane().setLayout(null);
		setVisible(true);

	}

	// ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {

		// checks to see if first navigation box is picked
		if (e.getSource() == navigation[0]) {

			// disposes of current page and opens concepts
			dispose();
			new CAIConcepts();
		}

		// checks to see if second navigation box is picked
		else if (e.getSource() == navigation[1]) {

			// disposes of current page and opens activity
			dispose();
			new CAIActivity();
		}

		// checks to see if last navigation box is picked
		else if (e.getSource() == navigation[2]) {

			// disposes of current page and opens assessment
			dispose();
			new CAIAssessment();
		}

	}

}
