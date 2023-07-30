import java.awt.Color;

import javax.swing.*;
import java.awt.Font;

//Samiksha Satthy
//This class generates certificate for users who got a perfect score 

public class CAICertificate extends JFrame {

	// image needed for this frame
	ImageIcon certificate = new ImageIcon("images/certificate.jpg");

	// GUI components needed for this frame
	JLabel certificateBackground = new JLabel(certificate);
	JLabel initials = new JLabel();

	// constructor method
	public CAICertificate() {

		certificateAddition();

		setFrame();

	}

	// this method adds the certificate image to frame and adds user's initials on
	// it
	private void certificateAddition() {

		// sets certificateBackground to null to add user's name on it, and adds it to
		// frame
		certificateBackground.setLayout(null);
		getContentPane().add(certificateBackground);

		// sets font, text and bounds of initial to be the same as user's entered
		// initials and adds it to the certificate
		initials.setFont(new Font("Goudy Stout", Font.PLAIN, 24));
		initials.setText(CAIApplication.initials);
		initials.setBounds(500, 325, 1000, 30);
		certificateBackground.add(initials);

	}

	// this method sets the frame
	private void setFrame() {

		// sets size and visibility
		setSize(certificate.getIconWidth(), certificate.getIconHeight());
		setVisible(true);

	}

}
