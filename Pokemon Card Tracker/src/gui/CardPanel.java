package gui;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CardPanel extends JPanel{

	private JLabel test;
	
	public CardPanel() {
		setLayout(new FlowLayout());
		
		test = new JLabel("Test");
		add(test);
	}
	
}
