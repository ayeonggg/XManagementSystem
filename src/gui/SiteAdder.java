package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class SiteAdder extends JPanel{
	WindowFrame frame;
	
	public SiteAdder(WindowFrame frame) {
		this.frame= frame;
		
		JPanel panel= new JPanel();
		panel.setLayout(new SpringLayout());
 
		JLabel labelName= new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName= new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelAddress= new JLabel("Address: ", JLabel.TRAILING);
		JTextField fieldAddress= new JTextField(10);
		labelAddress.setLabelFor(fieldAddress);
		panel.add(labelAddress);
		panel.add(fieldAddress);
		
		JLabel labelFolder= new JLabel("Folder: ", JLabel.TRAILING);
		JTextField fieldFolder= new JTextField(10);
		labelFolder.setLabelFor(fieldFolder);
		panel.add(labelFolder);
		panel.add(fieldFolder);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}

}
