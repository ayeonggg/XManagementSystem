package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.SiteAdder;
import gui.SiteViewer;
import gui.WindowFrame;

public class SiteAdderCancelListener implements ActionListener {
	
	WindowFrame frame;

	public SiteAdderCancelListener(WindowFrame frame) {
		this.frame= frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();

	}

}
