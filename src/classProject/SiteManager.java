package classProject;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SiteManager implements Serializable{
	
	private static final long serialVersionUID=3685095473752321L;
	
	ArrayList<SiteInput> sites= new ArrayList<SiteInput>();
	transient Scanner input;
	SiteManager(Scanner input){
		this.input= input;
	}
	
	public void setScanner(Scanner input) {
		this.input=input;
	}
	
	public void addSite(String address, String name, String folder) {
		SiteInput siteInput= new ChromeSite(SiteKind.Chrome);
	    siteInput.getUserInput(input);
	    sites.add(siteInput);
	}
	
	
	public void addSite(SiteInput siteInput) {
	    sites.add(siteInput);
	}
	
	public void addsite() {
		int kind=0;
		SiteInput siteInput;
		
		while (kind !=1 || kind >3) {
			try {
			System.out.println("go into add students ");
			System.out.println("1 for Chorme: ");
			System.out.println("2 for Microsoft Edge: ");
			System.out.println("3 for Internet Explorer: ");
			System.out.print("Select num 1,2,or 3 for Site Kind:");
		    kind= input.nextInt();
			if (kind==1) {
			    siteInput= new ChromeSite(SiteKind.Chrome);
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
				 siteInput.getUserInput(input);
				sites.add(siteInput);
				break;
			}
			else {
				System.out.println("Select num for Site Kind between 1 and 2");
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!:");
				if(input.hasNext()) {
					input.next();
				}
				kind=-1;
			}
		}
	}
	
	
public void deletesite() {
		System.out.print("Site Address: ");
		String siteaddress=input.next();
		int index=-1;
		for(int i=0; i<sites.size(); i++) {
			if(sites.get(i).getAddress()==siteaddress) {
				index= i;
				break;
			}
		}
		removefromSites(index, siteaddress);
	} 
	
    public int removefromSites(int index, String siteaddress) {
    	if(index>=0) {
			sites.remove(index);
			System.out.println("the site" +siteaddress+ "is deleted.");
			return 1;
		}
		else {
			System.out.println("the site has not been registered.");
			return -1;
		}
    }
	public  void editsite() {
		System.out.print("Site Address: ");
		String siteaddress= input.next();
		for(int i=0; i<sites.size(); i++) {
			SiteInput site=sites.get(i);
			if(site.getAddress().equals (siteaddress)) {
				int num=-1;
				while(num!=5){
					showEditMenu();
					num=input.nextInt();
					switch(num) {
					case 1:
						 site.setSiteaddress(input);
						 break;
					case 2:
						site.setSitename(input);
						break;
					case 3:
						site.setSitefolder(input);
						break;
					default:
						continue;
					} //if
				} //while
				break;
			} //if
		} //for
	}

	public void viewsites() {
		System.out.println("# of registered sites: "+ sites.size());
		for(int i=0; i<sites.size(); i++) {
			sites.get(i).printInfo();
		}
	}
	
	public int size() {
		return sites.size();
	}
	
	public SiteInput get(int index) {
		return (Site) sites.get(index);
	}

	public void showEditMenu() {
		System.out.println("*** Student Mangement System Menu ***");
		System.out.println("1. Edit Address");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit folder");
		System.out.println("4. View Sites");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
	}
}
	
