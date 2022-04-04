package classProject;
import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		SiteManager siteManager = new SiteManager(input);
		
		int num=-1;
		 
		while(num!=5){
			System.out.println("*** Student Mangement System Menu ***");
			System.out.println("1. Add Site");
			System.out.println("2. Delete Site");
			System.out.println("3. Edit Site");
			System.out.println("4. View Site");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5:");
			num=input.nextInt();
			if(num==1) {
				siteManager.addsite();
			}
			else if(num==2) {
				siteManager.deletesite();
			}
			else if(num==3) {
				siteManager.editsite();
			}
			else if(num==4) {
				siteManager.viewsite();
			}
			else {
				continue;
			}
		}
	}
}
	
