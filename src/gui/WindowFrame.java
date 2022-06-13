package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import classProject.SiteManager;

public class WindowFrame extends JFrame{
	
	SiteManager siteManager;
	
	MenuSelection menuSelection;
	SiteAdder siteadder;
	SiteViewer siteviewer;
	
	
	public WindowFrame(SiteManager siteManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.siteManager= siteManager;
		menuSelection= new MenuSelection(this);
		siteadder= new SiteAdder(this, this.siteManager);
		siteviewer= new SiteViewer(this, this.siteManager);
		
		
		this.add(menuSelection);

		this.setVisible(true);
		
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
		public MenuSelection getMenuselection() {
			return menuSelection;
		}

		public void setMenuselection(MenuSelection menuselection) {
			this.menuSelection = menuselection;
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
