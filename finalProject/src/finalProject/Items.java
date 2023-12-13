package finalProject;

public class Items {
	Words words;
	public boolean haveHammer = false;
	public boolean haveWood = false;
	public boolean pulledCord = false;
	public boolean haveAxe = false;
	
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
		if(haveAxe = true)
		{
			return "axeYes";
		}
		else
		{
			return "axeNo";
		}
	}

}
