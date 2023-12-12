package finalProject;

public class Items {
	Words words;
	public boolean haveHammer = false;
	public boolean haveWood = false;
	public boolean switchOn = false;
	
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
		if(switchOn == true)
		{
			return "you see a fireplace but there is no fire coming from it";
		}
		else
		{
			return "you see a fireplace, there is an immense amount of heat coming out of it, youre hands feel immensily warm even when youre stadning ten feet away from it";
		}
	}

}
