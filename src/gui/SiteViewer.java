package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import classProject.SiteInput;
import classProject.SiteManager;

public class SiteViewer extends JPanel{
	
	WindowFrame frame;
	
	SiteManager siteManager;
	public SiteManager getSiteManager() {
		return siteManager;
	}

	public void setSiteManager(SiteManager siteManager) {
		this.siteManager=siteManager;
		this.removeAll();
	
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Folder");
		model.addColumn("Contact Info.");
		 
		for(int i=0; i<siteManager.size(); i++) {
			Vector row= new Vector();
			SiteInput si = siteManager.get(i);
			row.add(si.getAddress());
			row.add(si.getName());
			row.add(si.getFolder());
			model.addRow(row);
		}
		
		JTable table= new JTable(model);
		JScrollPane sp= new JScrollPane(table);
		   
		this.add(sp);
	}
	
	public SiteViewer(WindowFrame frame, SiteManager siteManager) {
		this.frame= frame;
		this.siteManager=siteManager;
		
		System.out.println("***"+siteManager.size()+"***");
		
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Folder");
		model.addColumn("Contact Info.");
		 
		for(int i=0; i<siteManager.size(); i++) {
			Vector row= new Vector();
			SiteInput si = siteManager.get(i);
			row.add(si.getAddress());
			row.add(si.getName());
			row.add(si.getFolder());
			model.addRow(row);
		}
		
		JTable table= new JTable(model);
		JScrollPane sp= new JScrollPane(table);
		   
		this.add(sp);
	}
}