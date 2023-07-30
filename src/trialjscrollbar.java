import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;

public class trialjscrollbar extends JFrame {
	private final JPanel panel = new JPanel();
	private JPasswordField passwordField;
	
	public trialjscrollbar() {
		
		setSize(900, 900);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(59, 56, 224, 179);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(315, 5, -131, 22);
		panel_1.add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(122, 184, 89, 23);
		panel_1.add(btnNewButton);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(110, 270, 17, 48);
		panel_1.add(scrollBar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(301, 262, 7, 20);
		panel_1.add(passwordField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(16, 21, 111, 23);
		panel_1.add(rdbtnNewRadioButton);
		setVisible(true); 
		
//		panel.setBounds(0, 0, 100, 100);
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
//		getContentPane().add(scrollPane);
//		panel.setBackground(new Color(128, 128, 64));
//		scrollPane.setViewportView(panel);
//		
//		JTextArea textArea = new JTextArea();
//		panel.add(textArea);

	}
}
