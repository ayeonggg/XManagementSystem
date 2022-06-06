package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import classProject.SiteManager;

public class WindowFrame extends JFrame{
	SiteManager siteManager;
	
	MenuSelection menuselection;
	SiteAdder siteadder;
	SiteViewer siteviewer;
	
	

	public WindowFrame(SiteManager siteManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.siteManager= siteManager;
		this.menuselection= new MenuSelection(this);
		this.siteadder= new SiteAdder(this);
		this.siteviewer= new SiteViewer(this, this.siteManager);
		
		
		this.add(menuselection);

		this.setVisible(true);
		
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
		public MenuSelection getMenuselection() {
			return menuselection;
		}

		public void setMenuselection(MenuSelection menuselection) {
			this.menuselection = menuselection;
		}

		public SiteAdder getSiteadder() {
			return siteadder;
		}

		public void setSiteadder(SiteAdder siteadder) {
			this.siteadder = siteadder;
		}

		public SiteViewer getSiteviewer() {
			return siteviewer;
		}

		public void setSiteviewer(SiteViewer siteviewer) {
			this.siteviewer = siteviewer;
		}
}
