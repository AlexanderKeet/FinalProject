package finalProject;

public class Items {
	Words words;
	public boolean haveHammer = false;
	public boolean haveWood = false;
	
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
		if(haveHammer = true)
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
		if(haveHammer == false)
		{
			return "Pick up hammer";
		}
		else
		{ 
			return "Go back";
		}
		
	}
}
