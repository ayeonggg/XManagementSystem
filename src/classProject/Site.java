package classProject;

import java.util.Scanner;

public class Site {
	protected String name;
	protected String address;
	protected String folder;
	
	public Site() {
	}
	
	public Site(String name, String address) {
		this.name= name;
		this.address= address;

	}
	public Site(String name, String address, String folder) {
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

	
	public void printInfo() {
		System.out.println("name: "+name+ "address: "+address+ "folder: "+folder);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Site Address: ");
		String address= input.next();
		this.setAddress(address);
		
		System.out.print("Site Name: ");
		String name= input.next();
		this.setName(name);
		
		System.out.print("Folder: ");
		String folder= input.next();
		this.setFolder(folder);
	}
}
	
