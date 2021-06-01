package main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

import org.json.JSONObject;

import gui.CardPanel;
import gui.MainFrame;
import utils.FileUtils;

public class Main {

	private static String darknessAblazeFilename = "darknessablaze.txt";
	private static ArrayList<JSONObject> darknessAblazeCards = new ArrayList<JSONObject>();
	
	public static void main(String aregs[]) {
		FileUtils.createFileDA(darknessAblazeFilename);
		FileUtils.readCardsFromFile(darknessAblazeFilename);
		
		initGui();
	}
	
	public static ArrayList<JSONObject> getDarknessAblazeCardList(){
		return darknessAblazeCards;
	}
	
	public static String getDarknessAblazeFilename() {
		return darknessAblazeFilename;
	}
	
	public static void initGui() {
		MainFrame mainFrame = new MainFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(500, 500);
		mainFrame.setVisible(true);
		mainFrame.setTitle("Pokemon Card Tracker");
		
		CardPanel cp2 = new CardPanel("Charizard V");
		cp2.getObtained().setSelected(true);
		
		CardPanel cp = new CardPanel("Charizard VMAX");
		
		mainFrame.add(cp);
		mainFrame.add(cp2);
	
		mainFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				FileUtils.saveDarknessAblazeChangesToFile(darknessAblazeFilename);
			}
		});
	}
	
}
