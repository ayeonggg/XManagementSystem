package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class SiteViewer extends JFrame {
	String column[]= {"NAME", "ADDRESS",  "FOLDER", "CONTACT NO."};
	
	public SiteViewer() {
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Address");
		model.addColumn("Folder");
		model.addColumn("Contact Info.");
		 
		JTable table= new JTable(model);
		JScrollPane sp= new JScrollPane(table);
		   
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}