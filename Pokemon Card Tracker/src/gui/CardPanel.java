package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import main.Main;

@SuppressWarnings("serial")
public class CardPanel extends JPanel{

	private JLabel cardName;
	private JRadioButton obtained;
	private JRadioButton notObtained;
	private ButtonGroup haveOrNot = new ButtonGroup();
	
	public CardPanel(String cardName) {
		setLayout(new FlowLayout());
		
		this.cardName = new JLabel(cardName);
		add(this.cardName);
		
		obtained = new JRadioButton("Have");
		
		notObtained = new JRadioButton("Do Not Have");
		
		haveCheck hc = new haveCheck();
		obtained.addActionListener(hc);
		notObtained.addActionListener(hc);
		
		haveOrNot.add(obtained);
		haveOrNot.add(notObtained);
		
		add(obtained);
		add(notObtained);
	}
	
	public class haveCheck implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(obtained.isSelected()) {
				System.out.println("Have: " + cardName.getText());
				updateCard(cardName.getText(), true);
			}
			if(notObtained.isSelected()) {
				System.out.println("Don't Have: " + cardName.getText());
				updateCard(cardName.getText(), false);
			}
		}
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
	
	public ButtonGroup getHaveOrNot() {
		return this.haveOrNot;
	}
	
	public static void updateCard(String cardname, boolean obtained) {
		for(int i = 0; i < Main.getDarknessAblazeCardList().size(); i++) {
			if(Main.getDarknessAblazeCardList().get(i).get("name").equals(cardname)) {
				Main.getDarknessAblazeCardList().get(i).remove("obtained");
				Main.getDarknessAblazeCardList().get(i).put("obtained", obtained);
			}
		}
	}
}
