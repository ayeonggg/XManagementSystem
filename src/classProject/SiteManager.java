package classProject;


import java.util.Scanner;

public class SiteManager {
	Site site;
	Scanner input;
	SiteManager(Scanner input){
		this.input= input;
	}
	
	public void addsite() {
		site= new Site();
		System.out.print("Site Address: ");
		site.address= input.next();
		System.out.print("Site Name: ");
		site.name= input.next();
		System.out.print("Folder: ");
		site.folder= input.next();
		}
	
public void deletesite() {
		System.out.print("Site Address: ");
		String siteaddress=input.next();
		if(site ==null) {
			System.out.println("the site has not been registered.");
			return;
		}

		if(site.address.equals (siteaddress)) {
			site= null;
			System.out.println("the site is deleted.");
		}
	}
	
	public  void editsite() {
		System.out.print("Site Address: ");
		String siteaddress= input.next();
		if(site.address.equals (siteaddress)) {
			System.out.println("the site to be edited is"+ siteaddress);
		}
	}
	
	public void viewsite() {
		System.out.print("Site Address: ");
		String siteaddress= input.next();
		if(site.address.equals (siteaddress)) {
			site.printInfo();
		}
	}
}
	
