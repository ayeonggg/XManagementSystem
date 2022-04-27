package classProject;


import java.util.ArrayList;
import java.util.Scanner;

public class SiteManager {
	ArrayList<Site> sites= new ArrayList<Site>();
	Scanner input;
	SiteManager(Scanner input){
		this.input= input;
	}
	
	public void addsite() {
		int kind=0;
		Site site;
		while (kind !=1 && kind !=2) {
			System.out.print("1 for Chorm: ");
			System.out.print("2 for Microsoft Edge: ");
			System.out.print("Select num for Site Kind between 1 and 2: ");
		    kind= input.nextInt();
			if (kind==1) {
			    site= new Site();
			    site.getUserInput(input);
			    sites.add(site);
			    break;
			}
			else if (kind ==2) {
				site= new MicrosoftEdgeSite();
				 site.getUserInput(input);
				sites.add(site);
				break;
			}
			else {
				System.out.println("Select num for Site Kind between 1 and 2");
			}
		}
	}
	
	
public void deletesite() {
		System.out.print("Site Address: ");
		String siteaddress=input.next();
		int index=-1;
		for(int i=0; i<sites.size(); i++) {
			if(sites.get(i).address==siteaddress) {
				index= i;
				break;
			}
		}
		if(index>=0) {
			sites.remove(index);
			System.out.println("the site" +siteaddress+ "is deleted.");
		}
		else {
			System.out.println("the site has not been registered.");
			return;
		
		}
	} 
	
	public  void editsite() {
		System.out.print("Site Address: ");
		String siteaddress= input.next();
		for(int i=0; i<sites.size(); i++) {
			Site site=sites.get(i);
			if(site.address.equals (siteaddress)) {
				int num=-1;
				while(num!=5){
					System.out.println("*** Student Mangement System Menu ***");
					System.out.println("1. Edit Address");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit folder");
					System.out.println("4. View Sites");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1-5:");
					num=input.nextInt();
					if(num==1) {
						System.out.print("Site address:");
						String address=input.next();
						site.setAddress(address);
					}
					else if(num==2) {
						System.out.print("Site name:");
						String name=input.next();
						site.setName(name);
					}
					else if(num==3) {
						System.out.print("Site folder:");
						String folder=input.next(); 
						site.setFolder(folder);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewsites() {
//		System.out.print("Site Address: ");
//		String siteaddress= input.next();
		System.out.println("# of registered sites: "+ sites.size());
		for(int i=0; i<sites.size(); i++) {
			sites.get(i).printInfo();
		}
//		if(site.address.equals (siteaddress)) {
//			site.printInfo();
//		}
	}
}
	
