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
}