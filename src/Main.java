
public class Main {

	public static void main(String[] args) {
		
		boolean exit_game = false; //Variable for exit game
		
		Statistics myStats = new Statistics(); //Statistics
		
		while(!exit_game) {
			//Main Menu
			Menu myChoice = new Menu();
			Menu.printMenu();
			myChoice.setChoice();
		
			//Choice selection
			switch (myChoice.getChoice())
			{
			case "N" :
				//Start a new Game
				
				//Setting random word
				Dictionary myWord = new Dictionary();
				myWord.randomWord();
				
				//Starting guessing
				NewGame random_Word = new NewGame(myWord);
				
				do
				{
					random_Word.printInfo();
					random_Word.userAsk();
					random_Word.checkTheLetter();
				}while(random_Word.getCurrentGuesses() > 0 && !(random_Word.wordFound()) );
				
				//Printing Results
				random_Word.printResults(random_Word.wordFound());
				
				//Updating Stats
				myStats.updateStats(random_Word.wordFound());
				
				break;
			case "S" :
				//Statistics
				myStats.printStats();
				break;
			case "E" :
				//Exit
				exit_game = true;
				System.out.println("======= Exit =======");
				break;
			default: 
				//Wrong Menu's Choice
				System.out.println("Try Again");
			}
		}
	}
		

}
