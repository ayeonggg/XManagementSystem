package classProject;


import java.util.ArrayList;
import java.util.Scanner;

public class SiteManager {
	ArrayList<SiteInput> sites= new ArrayList<Site>();
	Scanner input;
	SiteManager(Scanner input){
		this.input= input;
	}
	
	public void addsite() {
		int kind=0;
		SiteInput siteInput;
		while (kind !=1 && kind !=2) {
			System.out.println("1 for Chorme: ");
			System.out.println("2 for Microsoft Edge: ");
			System.out.println("3 for Internet Explorer: ");
			System.out.print("Select num 1,2,or 3 for Site Kind:");
		    kind= input.nextInt();
			if (kind==1) {
			    siteInput= new ChormeSite(SiteKind.Chrome);
			    siteInput.getUserInput(input);
			    sites.add(siteInput);
			    break;
			}
			else if (kind ==2) {
				siteInput= new MicrosoftEdgeSite(SiteKind.MicrosoftEdge);
				siteInput.getUserInput(input);
				sites.add(siteInput);
				break;
			}
			else if (kind == 3) {
				siteInput= new InternetExplorerSite(SiteKind.InternetExplorer);
				 siteInput.getUserInput(siteinput);
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
			SiteInput siteInput=sites.get(i);
			if(siteInput.getAddress().equals (siteaddress)) {
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
						siteInput.setAddress(address);
					}
					else if(num==2) {
						System.out.print("Site name:");
						String name=input.next();
						siteInput.setName(name);
					}
					else if(num==3) {
						System.out.print("Site folder:");
						String folder=input.next(); 
						siteInput.setFolder(folder);
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

	}
}
	
