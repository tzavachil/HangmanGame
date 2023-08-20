
public class Statistics {

	private int total_games;
	private int wins;
	private int loses;
	
	public Statistics()
	{
		total_games = 0;
		wins = 0;
		loses = 0;
	}
	
	public void printStats()
	{
		System.out.println("You have played so far " + total_games 
				+ " games. You won " + wins + " times and lost " 
				+ loses + " times.\n");
	}
	
	public void updateStats(boolean found)
	{
		this.total_games ++;
		if(found) this.wins ++;
		else this.loses ++;
		
	}
}
