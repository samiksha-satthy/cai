import java.awt.Color;
import java.awt.Component;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Samiksha Satthy
//This class prompts the user to enter their initials 

public class CAIInitials extends JFrame implements ActionListener {

	// All GUI Components needed for this frame
	JTextArea initials = new JTextArea();
	JLabel instruction = new JLabel("ENTER YOUR INITIALS: ");
	JLabel title = new JLabel("OBJECTS AND CLASSES");
	JLabel motto = new JLabel();
	JButton done = new JButton("DONE!");

	// constructor method
	public CAIInitials() {

		setText();

		setInitialsComponents();

		setFrame();

	}

	// this method sets the title and motto onto the frame
	private void setText() {

		// sets the font, bounds of title and adds it to the frame
		title.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 75));
		title.setBounds(373, 48, 670, 86);
		getContentPane().add(title);

		// sets the motto text and other components (font, bounds) and adds it to frame
		motto.setText("The Only CAI Application You'll Need");
		motto.setFont(new Font("Agency FB", Font.ITALIC, 45));
		motto.setBounds(442, 127, 526, 88);
		getContentPane().add(motto);

	}

	// This method sets all of the components needed for the user to enter their
	// initials
	private void setInitialsComponents() {

		// add the label that prompts the user to enter their initials and set bounds,
		// font
		instruction.setFont(new Font("OCR A Extended", Font.PLAIN, 26));
		instruction.setBounds(274, 304, 425, 93);
		add(instruction);

		// add button to frame and ActionListener for the user to indicate that they
		// have completed entering their initials, and set font, bounds
		done.setFont(new Font("Bell MT", Font.PLAIN, 16));
		done.setBounds(975, 480, 140, 57);
		done.addActionListener(this);
		getContentPane().add(done);

		// add actual textarea for user to enter initials and set bounds, font and index
		initials.setFont(new Font("MS Gothic", Font.PLAIN, 40));
		initials.setBackground(new Color(186, 124, 254));
		initials.setBounds(274, 384, 841, 62);
		getContentPane().add(initials);

	}

	// This method sets the actual frame
	private void setFrame() {

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

		// checks to see if done button is picked
		if (e.getSource() == done) {

			// if initials textarea is not empty..
			if (!initials.getText().isEmpty()) {

				// store entered initials to public variable
				CAIApplication.initials = initials.getText();

				// open main menu
				new CAIMainMenu();

				// dispose of current frame
				dispose();

			}

		}

	}

}
