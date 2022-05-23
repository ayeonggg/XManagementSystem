package classProject;

import java.io.Serializable;
import java.util.Scanner;

import exception.FolderFormatException;

public abstract class Site implements SiteInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8876453294802354259L;
	
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
	public Site(SiteKind kind, String name, String address, String folder) {
		this.kind=kind;
		this.name= name;
		this.address=address;
		this.folder= folder;
	}
	
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

	public void setFolder(String folder) throws FolderFormatException {
		if(!folder.contains("폴더") && !folder.equals("")) {
			throw new FolderFormatException();
		}
		
		this.folder = folder;
	}
	
	public abstract void printInfo();
	
	public void setSiteaddress(Scanner input) {
		System.out.print("Site address:");
		String address=input.next();
		this.setAddress(address);
	}
	
	public void setSitename(Scanner input) {
		System.out.print("Site name:");
		String name=input.next();
		this.setName(name);
	}
	
	public void setSitefolder(Scanner input) {
		String folder= "";
		while(!folder.contains ("폴더")) {
		System.out.print("Site folder:");
		folder=input.next(); 
		try{
			this.setFolder(folder);
		}catch(FolderFormatException e) {
			System.out.print("Incorrect Folder Format. put the folder name contains 폴더");
			
		}
		}
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