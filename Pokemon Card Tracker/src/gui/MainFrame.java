package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import main.Main;
import utils.FileUtils;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	private JMenuBar menuBar;
	private JMenu file;
	private JMenuItem save;
	
	public MainFrame() {
		
		setLayout(new FlowLayout()); 
		
		file = new JMenu("File");
		save = new JMenuItem("Save");
		
		SaveActionListener sa = new SaveActionListener();
		save.addActionListener(sa);
		
		file.add(save);
		
		menuBar = new JMenuBar();
		menuBar.add(file);
		setJMenuBar(menuBar);
		
	}
	
	public class SaveActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			FileUtils.saveDarknessAblazeChangesToFile(Main.getDarknessAblazeFilename());
			System.out.println("File updated");
		}		
	}
}
