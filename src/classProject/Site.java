package classProject;

import java.util.Scanner;

public abstract class Site implements SiteInput{
	protected SiteKind kind= SiteKind.Chrome;
	protected String name;
	protected String address;
	protected String folder;
	
	public Site() {
	}
	
	public Site(SiteKind kind) {
		this.kind=kind;
	}
	
	public Site(String name, String address) {
		this.name= name;
		this.address= address;

	}
	public Site(String name, String address, String folder) {
		this.kind=kind;
		this.name= name;
		this.address=address;
		this.folder= folder;
	}
	
	protected SiteKind kind= SiteKind.Chrome;
	public SiteKind getKind() {
		return kind;
	}

	public void setKind(SiteKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}
	
	public abstract void printInfo();
	
	public void setSiteaddress(Scanner input) {
		System.out.print("Site address:");
		String address=input.next();
		this.setAddress(address);
	}
	
	public void setSitename( Scanner input) {
		System.out.print("Site name:");
		String name=input.next();
		this.setName(name);
	}
	
	public void setSitefolder( Scanner input) {
		System.out.print("Site folder:");
		String folder=input.next(); 
		this.setFolder(folder);
	}  
	
	public String getKindString() {
		String skind="none";
		switch(this.kind) {
		case Chrome:
			skind="Chorme";
			break;
		case MicrosoftEdge:
			skind="Edge";
			break;
		case InternetExplorer:
			skind="Explorer";
			break;
		case Safari:
			skind="Safari";
			break;
		default:	
		}
		return skind;
	}

}