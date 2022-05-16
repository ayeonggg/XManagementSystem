package classProject;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		SiteManager siteManager = new SiteManager(input);
		
		selectMenu(input, siteManager);
	}
	public static void selectMenu(Scanner input, SiteManager siteManager) {
		int num=-1;
		 
		while(num!=5){
			try {
			showMenu();
			num=input.nextInt();
			switch(num) {
			case 1:
				siteManager.addsite();
				break;
			case 2:
				siteManager.deletesite();
				break;
			case 3:
				siteManager.editsite();
				break;
			case 4:
				siteManager.viewsites();
				break;
			default:
				continue;
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!:");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;
				System.out.println(num);
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Student Mangement System Menu ***");
		System.out.println("1. Add Site");
		System.out.println("2. Delete Site");
		System.out.println("3. Edit Site");
		System.out.println("4. View Sites");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
	}
}
	
