package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import classProject.ChromeSite;
import classProject.SiteInput;
import classProject.SiteKind;
import classProject.SiteManager;

public class SiteAdderListener implements ActionListener {
	JTextField fieldAddress;
	JTextField fieldName;
	JTextField fieldFolder;
	
	SiteManager siteManager;
	
	public SiteAdderListener(
			JTextField fieldAddress,
			JTextField fieldName,
			JTextField fieldFolder, SiteManager siteManager) {
		this.fieldAddress = fieldAddress;
		this.fieldName = fieldName;
		this.fieldFolder = fieldFolder;
		this.siteManager= siteManager;
	}
	
		
		public void actionPerformed(ActionEvent e) {
			SiteInput site= new ChromeSite(SiteKind.Chrome);
			try {
			site.setAddress(fieldAddress.getText());
			site.setName(fieldName.getText());
			site.setFolder(fieldFolder.getText());
			siteManager.addSite(site);
			site.printInfo();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}

	 public static void putObject(SiteManager siteManager, String filename) {
			try{
				FileOutputStream file= new FileOutputStream(filename);
				ObjectOutputStream out= new ObjectOutputStream(file);
				
				out.writeObject(siteManager);
				
				out.close();
				file.close();
				
			} catch(FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();	
			
			}
	 }
}
