package classProject;

import java.util.Scanner;

public class MicrosoftEdgeSite extends Site {
	
	public void getUserInput(Scanner input) {
		System.out.print("Site Address: ");
		String address= input.next();
		this.setAddress(address);
		
		System.out.print("Site Name: ");
		String name= input.next();
		this.setName(name);
		
		char answer ='x';
		while(answer !='y' && answer!= 'Y' && answer !='n' && answer != 'N')
		{
			System.out.print("Does site have an folder? (Y/N): ");
		    answer = input.next().charAt(0);
			if(answer == 'y'||answer=='Y') {
				System.out.print("Site folder: ");
				String folder= input.next();
				this.setFolder(folder);
				break;
			}
			else if (answer=='n'||answer=='N') {
				this.setFolder("");
				break;
			}
			else {
			}
		}
	}
}
		
