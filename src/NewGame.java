import java.util.ArrayList;
import java.util.Scanner;

public class NewGame {

	private Dictionary word;
	private ArrayList<String> hidden_word = new ArrayList<>();
	private String Guess;
	private int current_guesses;
	private int correct_guesses;
	private int wrong_guesses;
	private int counter; //Counter for replacing the letters in the word
	
	public NewGame(Dictionary word)
	{
		this.word = word;
		for(int i = 0; i<this.word.getLength(); i++) this.hidden_word.add(i,"-");
		this.Guess = "";
		this.current_guesses = 8;
		this.correct_guesses = 0;
		this.wrong_guesses = 0;
		this.counter = 0;
	}
	
	public int getCurrentGuesses()
	{
		return this.current_guesses;
	}
	
	public int getCounter()
	{
		return this.counter;
	}
	
	public void userAsk()
	{
		Scanner in = new Scanner(System.in);
		
		do
		{
			System.out.print("Your guess: ");
			this.Guess = in.next();
			this.Guess = this.Guess.toUpperCase();
		}while(!alphabetCheck(this.Guess)); 
	}
	
	//Checking if the Guess is Symbols
	public boolean alphabetCheck(String text)
	{
		return ((text != null)  && (!text.equals("")) && (text.matches("^[a-zA-Z]*$")));
	}
	
	
	public void printInfo()
	{	
		System.out.print("The random word is now: " );
		printArray(this.hidden_word);
		System.out.println("\nYou have " + current_guesses + " guesses left.");
	}
	
	public void printArray(ArrayList<String> word) 
	{	
		StringBuilder new_word = new StringBuilder();
		
		for(String s : word) new_word.append(s);

		System.out.print(new_word.toString());
	}
	
	public void checkTheLetter()
	{	
		boolean flag = false; //Variable for checking the letter
				
		for(int i=0; i<this.word.getLength(); i++)
		{
			String Letter = Character.toString(this.word.getWord().charAt(i));
			if(Letter.equalsIgnoreCase(this.Guess))
			{
				this.hidden_word.set(i, this.Guess);
				flag = true;
				
				this.counter ++;
			}
		}
		 
		if(flag) 
		{
			 System.out.println("The guess is CORRECT!");
			 this.correct_guesses ++;
		}
		else 
		{
			System.out.println("There are no " + this.Guess + "'s in the word.");
			this.wrong_guesses ++;
			this.current_guesses --;
		}
	}
	
	public boolean wordFound()
	{
		if(this.counter == this.word.getLength()) return true;
		return false;
	}
	
	public void printResults(boolean flag)
	{
		if(flag) 
		{
			System.out.println("Congratulations! You guessed the word: " + this.word.getWord());
			System.out.println("You made " + this.correct_guesses + " correct guesses and " + this.wrong_guesses + " wrong guesses.");
		}
		else
			System.out.println("You failed. The word was: " + this.word.getWord());
	}
}
