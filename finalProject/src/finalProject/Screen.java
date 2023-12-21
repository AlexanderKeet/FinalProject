package finalProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Screen{
	
	JFrame window;
	Container con;
	//JPanels
	JPanel theTitlePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, bagPanel, line1, line2;
	//JButtons
	JButton startButton, choice1, choice2, choice3, choice4, choice5, choice6;
	//JLabels
	JLabel theTitleLabel, bagLabel, item1, item2, item3, item4, item5, item6;
	JTextArea mainTextArea, line1Label, line2Label;
	
	Font titleFont = new Font("Impact", Font.PLAIN, 90);
	Font regularFont = new Font("Times new roman", Font.PLAIN, 20);
	Font bagFont = new Font("Times new roman", Font.PLAIN, 15);
	Game game;
	Words words;
	Color beige = new Color(255,215,160);
	
	public void theScreen(ChoiceListener cListen)
	{
		//the window 
		window = new JFrame();
		window.setSize(500,700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(beige);
		window.setLayout(null);
		window.setResizable(false);
		con = window.getContentPane();
		
		
		//the title Screen
		theTitlePanel = new JPanel();
		theTitlePanel.setBounds(50, 200, 380, 150);
		theTitlePanel.setBackground(beige);
		theTitleLabel = new JLabel("Start");
		theTitleLabel.setForeground(Color.black);
		theTitleLabel.setFont(titleFont);
		//the start button
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(150, 400, 200, 100);
		startButtonPanel.setBackground(beige);
				
		startButton = new JButton("Start");
		startButton.setBackground(beige);
		startButton.setForeground(Color.black);
		startButton.addActionListener(cListen);
		startButton.setActionCommand("startButton");
		startButton.setFont(regularFont);
		startButton.setFocusPainted(false);
		theTitlePanel.add(theTitleLabel);
		startButtonPanel.add(startButton);
		con.add(theTitlePanel);
		con.add(startButtonPanel);
				
	
		//gameScreen
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(20, 80, 450, 220);
		mainTextPanel.setBackground(beige);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("blabla");
		mainTextArea.setBounds(20, 80, 450, 220);
		mainTextArea.setBackground(Color.gray);
		mainTextArea.setForeground(Color.black);
		mainTextArea.setFont(regularFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextPanel.add(mainTextArea);
		//choice buttons
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(10,325,465,325);
		choiceButtonPanel.setBackground(beige);
		choiceButtonPanel.setLayout(new GridLayout(3,2,5,5));
		con.add(choiceButtonPanel);
		choice1 = choiceButton(cListen);
		choice1.setActionCommand("c1");
		choice2 = choiceButton(cListen);
		choice2.setActionCommand("c2");
		choice3 = choiceButton(cListen);
		choice3.setActionCommand("c3");
		choice4 = choiceButton(cListen);
		choice4.setActionCommand("c4");
		choice5 = choiceButton(cListen);
		choice5.setActionCommand("c5");
		choice6 = choiceButton(cListen);
		choice6.setActionCommand("c6");
		//bag
		bagPanel = new JPanel();
		bagPanel.setBounds(20,15,465,40);
		bagPanel.setBackground(beige);
		bagPanel.setLayout(new GridLayout(1,6));
		con.add(bagPanel);
		bagLabel = itemsLabel();
		item1 = itemsLabel();
		item2 = itemsLabel();
		item3 = itemsLabel();
		item4 = itemsLabel();

		bagLabel.setText("Your Items:");
		item1.setText("");
		item2.setText("");
		item3.setText("");
		item4.setText("");
		
		line1 = new JPanel();
		line2 = new JPanel();
		line1.setBounds(0, 50, 500, 20);
		line2.setBounds(0, 301, 500, 20);
		line1.setBackground(beige);
		line2.setBackground(beige);
		line1.setForeground(Color.black);
		line2.setForeground(Color.black);
		con.add(line1);
		con.add(line2);
		line1Label = new JTextArea("------------------------------------------------------------------------------------------");
		line2Label = new JTextArea("------------------------------------------------------------------------------------------");
		line1Label.setBackground(beige);
		line2Label.setBackground(beige);
		line1Label.setFont(regularFont);
		line2Label.setFont(regularFont);
		line1.add(line1Label);
		line2.add(line2Label);
		
		window.setVisible(true);

	}
	public void runTitleScreen()
	{
		theTitlePanel.setVisible(true);
		startButtonPanel.setVisible(true);
		bagPanel.setVisible(false);
		choiceButtonPanel.setVisible(false);
		mainTextArea.setVisible(false);
		line1.setVisible(false);
		line2.setVisible(false);
	}
	
	public void runGameScreen()
	{
		bagPanel.setVisible(true);
		choiceButtonPanel.setVisible(true);
		mainTextArea.setVisible(true);
		theTitlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		line1.setVisible(true);
		line2.setVisible(true);
		
	}
	


	// so i don't have to write the same thing 6 times
	public JButton choiceButton(ChoiceListener c){
		JButton button;
	    button = new JButton();
	    button.setBackground(Color.darkGray);
	    button.setForeground(Color.black);
	    button.setFont(regularFont);
	    button.setFocusPainted(false);
	    button.setContentAreaFilled(false);
	    button.setBorderPainted(false);
	    button.addActionListener(c);
	    choiceButtonPanel.add(button);
	    return button;
	}
	
	public JLabel itemsLabel()
	{
		JLabel label;
		label = new JLabel();
		label.setBackground(Color.darkGray);
		label.setForeground(Color.black);
		label.setFont(bagFont);
		bagPanel.add(label);
		return label;
	}
	
	
	public void compChoice(String a, String b, String c, String d, String e, String f)
	{

			if(a.equals(""))
			{
				choice1.setVisible(false);
			}
			else
			{
				choice1.setVisible(true);
				choice1.setContentAreaFilled(true);
				choice1.setBorderPainted(true);
				choice1.setText(a);
			}
		    		
			if(b.equals(""))
			{
				choice2.setVisible(false);
			}
			else 
			{
				choice2.setVisible(true);
				choice2.setContentAreaFilled(true);
				choice2.setBorderPainted(true);
				choice2.setText(b);
			}
		
	
			if(c.equals(""))
			{
				choice3.setVisible(false);
			}
			else
			{
				choice3.setVisible(true);
				choice3.setContentAreaFilled(true);
				choice3.setBorderPainted(true);
				choice3.setText(c);
			}
		  

			if(d.equals(""))
			{
				choice4.setVisible(false);
			}
			else {
				choice4.setVisible(true);
				choice4.setContentAreaFilled(true);
				choice4.setBorderPainted(true);
				choice4.setText(d);
			}

			if(e.equals(""))
			{
				choice5.setVisible(false);
			}
			else
			{
				choice5.setVisible(true);
				choice5.setContentAreaFilled(true);
				choice5.setBorderPainted(true);
				choice5.setText(e);
			}

			if(f.equals(""))
			{
				choice6.setVisible(false);
			}
			else
			{
				choice6.setVisible(true);
				choice6.setContentAreaFilled(true);
				choice6.setBorderPainted(true);
				choice6.setText(f);
			}

	}
	


}
