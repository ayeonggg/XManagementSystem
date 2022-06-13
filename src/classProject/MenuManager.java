package classProject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger Logger= new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		SiteManager siteManager = getObject("sitemanager.ser");
		if(siteManager==null) {
			siteManager= new SiteManager(input);
		}
//		else {
//			siteManager.setScanner(input);
//		}
		
		WindowFrame frame= new WindowFrame(siteManager);
		selectMenu(input, siteManager);
		putObject(siteManager,"sitemanager.ser");
	}
	public static void selectMenu(Scanner input, SiteManager siteManager) {
		int num=-1;
		 
		while(num!=5){
			try {
				showMenu();
				num=input.nextInt();
				switch(num) {
				case 1:
					siteManager.addsite();
					Logger.log("add a site");
					break;
				case 2:
					siteManager.deletesite();
					Logger.log("delet a site");
					break;
				case 3:
					siteManager.editsite();
					Logger.log("edit a site");
					break;
				case 4:
					siteManager.viewsites();
					Logger.log("edit a list of site");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!:");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;
				System.out.println(num);
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Student Mangement System Menu ***");
		System.out.println("1. Add Site");
		System.out.println("2. Delete Site");
		System.out.println("3. Edit Site");
		System.out.println("4. View Sites");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
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
		
