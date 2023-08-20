import java.util.Scanner;

public class Menu {
	
	private String choice;
	
	//Public method that prints out the main menu choices
	public static void printMenu()
	{	
		System.out.println("=========MAIN MENU=========");
		System.out.println("   - Start a new Game(N)");
		System.out.println("   - Statistics (S)");
		System.out.println("   - Exit (E)");
		System.out.println("Please enter your choice: ");
	}
	
	//Public method that reads the user's choice
	public void setChoice()
	{
		Scanner in = new Scanner(System.in);
		
		this.choice = in.next();
		this.choice = this.choice.toUpperCase();
		
	}
	
	public String getChoice()
	{
		return this.choice;
	}
	
	
}
