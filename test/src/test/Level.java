package test;

public class Level {	
	private int level; 
	private Location inLevelLocation[][];
	private Player player;
	
	Level(int Level)
	{
		this.setLevel(level);
		this.inLevelLocation = new Location[8][8];
		for(int yAxis=0;yAxis!=8;yAxis++)
		{
			for(int xAxis=0;xAxis!=8;xAxis++)
			{
				this.getInLevelLocation()[xAxis][yAxis]=new Location(xAxis,yAxis);
			}
		}		
	}

	public void setPlayer(Player player)
	{
		this.player=player;
	}

	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public Location[][] getInLevelLocation() {
		return inLevelLocation;
	}


	public void setInLevelLocation(Location[][] inLevelLocation) {
		this.inLevelLocation = inLevelLocation;
	}
	
	public String toString()
	{
		String returning= "�X�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�[\n";
		
		for(int yAxis=0;yAxis!=8;yAxis++)
		{
			for(int xAxis=0;xAxis!=8;xAxis++)
			{
				if(xAxis==0)
				{
					returning=returning+"�U"+this.getInLevelLocation()[xAxis][yAxis].toString();
				}
				else if(xAxis==7)
				{
					returning=returning+this.getInLevelLocation()[xAxis][yAxis].toString()+"�U";
				}
				else
				
				returning=returning+""+this.getInLevelLocation()[xAxis][yAxis].toString();
			}
			if(yAxis==1)
			{
				returning = returning +"Player information:"+"		"+"Lables:";
			}
			else if(yAxis==2)
			{
				returning = returning +"heath: "+player.getHeath()+"			"+"��:Player";
			}
			else if(yAxis==3)
			{
				returning = returning +"money: "+player.getMoney()+"			"+"��:Monster";
			}
			else if(yAxis==4)
			{
				returning = returning +"Your location is: Level "+player.getCurrentLevel().getLevel()+"	"+"�{:Walls";
			}
			returning = returning +"\n";	
		}
		
		return returning+"�^�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�a";
	}
	
	
}