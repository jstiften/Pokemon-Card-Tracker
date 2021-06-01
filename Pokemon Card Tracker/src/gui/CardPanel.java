package gui;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class CardPanel extends JPanel{

	private JLabel cardName;
	private JRadioButton obtained;
	private JRadioButton notObtained;
	
	public CardPanel(String cardName) {
		setLayout(new FlowLayout());
		
		this.cardName = new JLabel(cardName);
		add(this.cardName);
		
		obtained = new JRadioButton("Have");
		
		notObtained = new JRadioButton("Do Not Have");
		
		ButtonGroup haveOrNot = new ButtonGroup();
		haveOrNot.add(obtained);
		haveOrNot.add(notObtained);
		
		add(obtained);
		add(notObtained);
	}
	
	public JLabel getCardName() {
		return this.cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName.setText(cardName);
	}
	
	public JRadioButton getObtained() {
		return this.obtained;
	}
	
	public JRadioButton getNotObtained() {
		return this.notObtained;
	}
}
