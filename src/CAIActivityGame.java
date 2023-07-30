import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

//Samiksha Satthy
//This class displays the actual activity

public class CAIActivityGame extends JFrame implements ActionListener, MouseMotionListener {

	// images needed
	ImageIcon questionBackground = new ImageIcon("images/question background.png");
	ImageIcon answerBackground = new ImageIcon("images/answer background.png");
	ImageIcon timeBackground = new ImageIcon("images/time background.png");
	ImageIcon PAUSE = new ImageIcon("images/pause.png");

	// All GUI components required for this frame
	JLabel background = new JLabel(new ImageIcon("images/space.png"));
	JLabel saucer = new JLabel(new ImageIcon("images/saucer.gif"));
	JLabel question = new JLabel(questionBackground);
	JLabel[] choices = new JLabel[4];
	JLabel timeLabel = new JLabel(timeBackground);
	JButton pauseButton = new JButton(PAUSE);

	// Timer
	private double time = 43;
	Timer gameTimer = new Timer(1000, this);

	// variables to generate random questions and choices
	int randomIndexQuestion;
	int[] randomChoice = new int[4];
	int randomChoiceIndex;

	// Y variable
	int dY = 200;

	// constructor method
	public CAIActivityGame() {

		setInititalComponents();

		generateQuestionChoices();

		setFrame();

	}

	// This method sets the iniital components to the frame
	private void setInititalComponents() {

		// manage positioning by user
		// the background will place objects manually
		background.setLayout(null);
		background.setBounds(0, 0, 1366, 768);
		add(background);
		addMouseMotionListener(this);

		// sets bounds of the saucer and adds it to background
		saucer.setBounds(200, 500, 100, 100);
		background.add(saucer);

		// sets pause button to background
		pauseButton.setBounds(20, 15, 42, 25);
		pauseButton.addActionListener(this);
		background.add(pauseButton);

		// sets Timer, bounds and adds it to background
		timeLabel.setText("TIME:" + time);
		timeLabel.setHorizontalTextPosition(JLabel.CENTER);
		timeLabel.setBounds(1000, 10, timeBackground.getIconWidth(), timeBackground.getIconHeight());
		background.add(timeLabel);

	}

	// This method generates random questions and corresponding
	private void generateQuestionChoices() {

		// loops to ensure the random question generated isn't the same as the previous
		// question
		do {

			randomIndexQuestion = (int) (0 + (Math.random() * 14));

		} while (CAIApplication.previousQuestion == randomIndexQuestion);

		// sets the bounds, text, font and position of question and adds it to
		// background
		question.setBounds(200, 100, questionBackground.getIconWidth(), questionBackground.getIconHeight());
		question.setText(CAIApplication.questionsActivityArray[randomIndexQuestion].getQuestion());
		question.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 30));
		question.setHorizontalTextPosition(JLabel.CENTER);
		background.add(question);

		// generates a random index and assigns that index of randomChoices array to the
		// index of the question to get the correct answer
		randomChoiceIndex = (int) (0 + (Math.random() * 3));
		randomChoice[randomChoiceIndex] = randomIndexQuestion;

		// loops through all elements in randomChoice array
		for (int index = 0; index < randomChoice.length; index++) {

			// checks to make sure that the randomly generated index ins't the current index
			if (index != randomChoiceIndex) {

				randomIndex(index);

				// checks to see if the loop is on the first index
				if (index == 1) {

					// checks to see if the choice is the same as the previous choice, and finds
					// another index if it is
					while (randomChoice[index] == randomChoice[index - 1])
						randomIndex(index);
				}

				// checks to see if the loop is on the second index
				else if (index == 2) {

					// checks to see if the choice is the same as the previous choices, and finds
					// another index if it is
					while (randomChoice[index] == randomChoice[index - 1]
							|| randomChoice[index] == randomChoice[index - 2])
						randomIndex(index);
				}

				// checks to see if the loop is on the third index
				else if (index == 3) {

					// checks to see if the choice is the same as the previous choices, and finds
					// another index if it is
					while (randomChoice[index] == randomChoice[index - 1]
							|| randomChoice[index] == randomChoice[index - 2]
							|| randomChoice[index] == randomChoice[index - 3]) {
						randomIndex(index);

					}
				}

			}

		}

		// loops through the choices JLabel components
		for (int index = 0; index < choices.length; index++) {

			// creates new JLabel and sets general things (icon, bounds, text position)
			choices[index] = new JLabel();
			choices[index].setIcon(answerBackground);
			choices[index].setBounds(80 + (300 * index), dY, answerBackground.getIconWidth(),
					answerBackground.getIconHeight());
			choices[index].setHorizontalTextPosition(JLabel.CENTER);

			// checks to see if on first index
			if (index == 0) {

				// gets answer for the index stored in the first index of randomChoice array and
				// sets that as text
				choices[index].setText(CAIApplication.questionsActivityArray[randomChoice[0]].getAnswer());

			}

			// checks to see if on second index
			else if (index == 1) {

				// gets answer for the index stored in the second index of randomChoice array
				// and sets that as text
				choices[index].setText(CAIApplication.questionsActivityArray[randomChoice[1]].getAnswer());

			}

			// checks to see if on third index
			else if (index == 2) {

				// gets answer for the index stored in the third index of randomChoice array and
				// sets that as text
				choices[index].setText(CAIApplication.questionsActivityArray[randomChoice[2]].getAnswer());

			}

			// checks to see if on last index
			else if (index == 3) {

				// gets answer for the index stored in the last index of randomChoice array and
				// sets that as text
				choices[index].setText(CAIApplication.questionsActivityArray[randomChoice[3]].getAnswer());

			}

			// adds all choices label to the background
			background.add(choices[index]);

		}

	}

	// This method randomly generates an index from all of the QuestionActivity
	// objects stored from file
	private void randomIndex(int index) {

		// loops to ensure that the random answer generated is not the same as the
		// actual answer
		do {
			// sets the index as the random number
			randomChoice[index] = (int) (0 + (Math.random() * 14));

		} while (CAIApplication.questionsActivityArray[randomChoice[index]].getAnswer()
				.contains(CAIApplication.questionsActivityArray[randomIndexQuestion].getAnswer()));

	}

	// This method sets the frame
	private void setFrame() {

		// set size, default close, layout and visibility
		setSize(1366, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);

		// start the timer
		gameTimer.start();

	}

	// ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {

		// checks to see if the timer is the action performed
		if (e.getSource() == gameTimer) {

			// decrements time, and sets the label to updated text
			time--;
			timeLabel.setText("" + time);

			// increases position of Y to 10
			dY += 10;

			// loops through all of the labels display choices
			for (int index = 0; index < choices.length; index++) {

				// modifies the bound of label
				choices[index].setBounds(choices[index].getX(), dY, choices[index].getWidth(),
						choices[index].getHeight());

			}

			// loops through each random choice
			for (int index = 0; index < randomChoice.length; index++) {

				// checks to see if it is equal to the answer for the randomly generated
				// question
				if (randomChoice[index] == randomIndexQuestion) {

					// loops through all of the choices JLabel
					for (int index2 = 0; index2 < choices.length; index2++) {

						// if choices is equal to the right answer
						if (choices[index2].getText() == CAIApplication.questionsActivityArray[randomChoice[index]]
								.getAnswer()) {

							// checks to see if saucer intersects that answer
							if (saucer.getBounds().intersects(choices[index2].getBounds())) {

								// modify saucer bounds and stop game Timer
								saucer.setBounds(0, 0, 0, 0);
								gameTimer.stop();

								// display dialog to prompt user
								Object[] options = { "Next Question", "Quit" };
								int answer = JOptionPane.showOptionDialog(this, "THAT IS THE RIGHT ANSWER", "Replay",
										JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
										options[0]);

								// if user chooses the first answer
								if (answer == 0) {

									// run new frame
									new CAIActivityGame();
								}

								// if user chooses the second answer
								else if (answer == 1) {

									// run activity frame
									new CAIActivity();

								}

								// dispose of this frame and rootFrame
								dispose();
								JOptionPane.getRootFrame().dispose();
							}

						}

					}

				}

				// if user intersects with other choice that is not the right answer
				else if (saucer.getBounds().intersects(choices[index].getBounds())) {

					// display wrong answer Dialog
					JOptionPane.showMessageDialog(this, "THAT IS THE WRONG ANSWER! Try Again!", "Wrong Answer",
							JOptionPane.ERROR_MESSAGE);
				}

				// checks if time is equal to 0
				if (time == 0) {

					// display JDialog
					Object[] options = { "Next Question", "Quit" };
					int answer = JOptionPane.showOptionDialog(this, "TIME RAN OUT", "Replay",
							JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, options, options[0]);

					// stops game timer and resets time to 1
					gameTimer.stop();
					time = 1;

					// if user picks "Next Question"
					if (answer == 0) {

						// run new activity game frame
						new CAIActivityGame();
					}

					// else
					else if (answer == 1) {

						// run activity homepage
						new CAIActivity();

					}

					// dispose of JDialog and this frame
					JOptionPane.getRootFrame().dispose();
					dispose();
				}

			}

		}

		// checks to see if pause button has been selected
		else if (e.getSource() == pauseButton) {

			gameTimer.stop();

			// opens dialog and presents user with many options
			Object[] options = { "Continue", "Quit" };
			int button = JOptionPane.showOptionDialog(this,
					"The game is currently paused. Click what you want to do next.", "Paused",
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, // do not use a custom Icon
					options, // the titles of buttons
					options[0]); // default button title

			// if continue button is chosen, resume game
			if (button == 0) {

				// start timer again
				gameTimer.start();

				// close JDialog
				JOptionPane.getRootFrame().dispose();

			}

			// if quit button is chosen, bring user back to Activity
			else if (button == 1) {

				// close dialog and this frame
				JOptionPane.getRootFrame().dispose();
				dispose();

				// open opening frame
				new CAIActivity();

			}

		}

	}

	// when the user moves their mouse, move saucer along with the mouse
	@Override
	public void mouseMoved(MouseEvent e) {

		saucer.setBounds(e.getX(), e.getY(), 100, 75);

	}

	// not used, kept to satisfy conditions
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
