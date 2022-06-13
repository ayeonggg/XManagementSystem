package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import classProject.SiteManager;
import listeners.SiteAdderCancelListener;
import listeners.SiteAdderListener;


public class SiteAdder extends JPanel{
	
	WindowFrame frame;
	
	SiteManager siteManager;
	public SiteAdder(WindowFrame frame, SiteManager siteManager) {
		this.frame= frame;
		this.siteManager= siteManager;
		
		JPanel panel= new JPanel();
		panel.setLayout(new SpringLayout()); 

		JLabel labelAddress= new JLabel("Address: ", JLabel.TRAILING);
		JTextField fieldAddress= new JTextField(10);
		labelAddress.setLabelFor(fieldAddress);
		panel.add(labelAddress);
		panel.add(fieldAddress);
		
		JLabel labelName= new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName= new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		
		JLabel labelFolder= new JLabel("Folder: ", JLabel.TRAILING);
		JTextField fieldFolder= new JTextField(10);
		labelFolder.setLabelFor(fieldFolder);
		
		JButton saveButton= new JButton("save");
		saveButton.addActionListener(new SiteAdderListener(fieldAddress, fieldName, fieldFolder, siteManager));
		
		JButton cancelButton= new JButton("cancel");
		cancelButton.addActionListener(new SiteAdderCancelListener(frame));
		
		panel.add(labelFolder);
		panel.add(fieldFolder);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}

}
