package classProject;

import java.util.Scanner;

import exception.FolderFormatException;

public interface SiteInput {
	
	public String getAddress();
	
	public void setAddress(String address);
	
	public String getName();
	
	public void setName(String name);
	
	public String getFolder();
	
	public void setFolder(String floder) throws FolderFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setSiteaddress(Scanner input);
	
	public void setSitename(Scanner input);
	
	public void setSitefolder(Scanner input);
}
