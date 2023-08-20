import java.util.Random;

public class Dictionary {
	
	private String word;
	
	public Dictionary() {
		word = " ";
	}
	

	//Java class random give one random integer index
	public void randomWord() {
		Random rnd = new Random();
		int random_number = rnd.nextInt(50);
		this.word = getWord(random_number);
	}
	
	public String getWord()
	{
		return this.word;
	}
	
	public int getLength()
	{
		return this.word.length();
	}
	
	public String getWord(int index) {
		switch (index) {
			case 0: return "UNIVERSITY";
			case 1: return "COMPUTER";
			case 2: return "LAPTOP";
			case 3: return "HEADPHONES";
			case 4: return "FUZZY";
			case 5: return "DOG";
			case 6: return "KEYHOLE";
			case 7: return "TELEPHONE";
			case 8: return "PRINTER";
			case 9: return "BUILDING";
			case 10: return "BROWN";
			case 11: return "INDUSTRY";
			case 12: return "NERVOUS";
			case 13: return "VEGETERIAN";
			case 14: return "PIE";
			case 15: return "FEAR";
			case 16: return "SHADOW";
			case 17: return "ROMANTIC";
			case 18: return "BRIDGE";
			case 19: return "UMBRELLA";
			case 20: return "SIDE";
			case 21: return "POUR";
			case 22: return "MASTERMIND";
			case 23: return "SEIZE";
			case 24: return "POSSIBILITY";
			case 25: return "KITCHEN";
			case 26: return "BEAT";
			case 27: return "ENDORSE";
			case 28: return "REALISM";
			case 29: return "FAMILY";
			case 30: return "TAIL";
			case 31: return "MODERNIZE";
			case 32: return "PALM";
			case 33: return "HEADQUARTERS";
			case 34: return "TERRIFY";
			case 35: return "THRUST";
			case 36: return "RECOGNIZE";
			case 37: return "OFFENSE";
			case 38: return "GOAL";
			case 39: return "DRAMATIC";
			case 40: return "MOMENTUM";
			case 41: return "REPRODUCTION";
			case 42: return "ACCIDENT";
			case 43: return "VARIANT";
			case 44: return "SPELL";
			case 45: return "OFFER";
			case 46: return "STRONG";
			case 47: return "NEWS";
			case 48: return "DISCUSS";
			case 49: return "REMEMBER";
			default: return "Illegal index";
			}
		}; 
}
