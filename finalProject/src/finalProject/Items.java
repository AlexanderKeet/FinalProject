package finalProject;

public class Items {
	Words words;
	public boolean haveHammer = false;
	public boolean haveWood = false;
	public boolean pulledCord = false;
	public boolean haveAxe = false;
	public boolean comb1 = false;
	public boolean comb2 = false;
	public boolean comb3 = false;
	public boolean comb4 = false;
	public boolean comb5 = false;
	public boolean haveKey = false;
	public int stepCount = 0;
	
	public String tableSaw()
	{
		if(haveWood == true)
		{
			return "tableSawYes";
		}
		else
		{
			return "tableSawNo";
		}
	}
	public String pickHammer()
	{
		if(haveHammer == true)
		{
			return "cantMove";
		}
		else
		{
			return "hammerGained";
		}
	}
	public String hammerChoice()
	{
		if(haveHammer == true)
		{
			return "Go back";
		}
		else
		{ 
			return "Pick up hammer";
		}
		
	}
	public String switchTurnedOn()
	{
		if(pulledCord == true)
		{
			return "you see a fireplace but there is no fire coming from it, nothing of use seeems to be in there";
		}
		else
		{
			return "you see a fireplace, there is an immense amount of heat coming out of it, youre hands feel immensily warm even when youre stadning ten feet away from it, you feel like there coul be something useful in the fireplace";
		}
	}
	public String hamaxe()
	{
		if(haveAxe == true)
		{
			return "axeYes";
		}
		else
		{
			return "axeNo";
		}
	}
	public String unboltPainting()
	{
		if(haveHammer == true)
		{
			return "hammerYes";
		}
		else
		{
			return "hammerNo";
		}
	}
	public String bash()
	{
		if((comb1 && comb2 && comb3 && comb4 && comb5) == true)
		{
			return "Hammer";
		}
		else
		{
			return "";
		}
	}
	public String goingCrazy()
	{
		if((comb1 && comb2 && comb3 && comb4 && comb5) == true)
		{
			return "hammerBash";
		}
		else
		{
			return "";
		}
	}
	public String lookinBehind()
	{
		if(haveAxe == true)
		{
			return "lookBehindAftermath";	
		}
		else
		{
			return "lookBehind";
		}
	}
	public String doorAttempt()
	{
		if(haveKey == true)
		{
			return "unlockDoor";
		}
		else {
			return "locked";
		}
	}
	
	public String stepOrStop()
	{
		if(stepCount >= 10)
		{
			return "topOfStairs";
		}
		else
		{
			return "rightStep";
		}
	}
	
	
}
