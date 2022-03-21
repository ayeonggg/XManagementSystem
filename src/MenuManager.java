import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num=0;
		Scanner input= new Scanner(System.in);
		
		while(num!=6){
		System.out.println("1. Add Sites");
		System.out.println("2. Delete Sites");
		System.out.println("3. Edit Sites");
		System.out.println("4. View Sites");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1-6:");
		num=input.nextInt();
		switch(num) {
		case 1:
			System.out.print("Site Address:");
			String siteAddress= input.next();
			System.out.print("Site Name:");
			String siteName=input.next();
			break;
		case 2:
		case 3:
		case 4:
			System.out.print("site Address:");
			String siteAddress2=input.next();
		
		}
	}
	}
}