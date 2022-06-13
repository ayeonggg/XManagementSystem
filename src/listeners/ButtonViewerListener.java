package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import classProject.SiteManager;
import gui.SiteViewer;
import gui.WindowFrame;

public class ButtonViewerListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewerListener(WindowFrame frame) {
		this.frame= frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		SiteViewer siteViewer= frame.getSiteviewer();
		SiteManager siteManager = getObject("sitemanager.ser");
		siteViewer.setSiteManager(siteManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(siteViewer);
		frame.revalidate();
		frame.repaint();
	}
		public static SiteManager getObject(String filename) {
			SiteManager siteManager=null;
			
			try{
				FileInputStream file= new FileInputStream(filename);
				ObjectInputStream in= new ObjectInputStream(file);
				
				try {
					siteManager= (SiteManager)in.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				in.close();
				file.close();
				
			} catch(FileNotFoundException e) {
				return siteManager;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 			
			
			return siteManager;
	
	}

}
