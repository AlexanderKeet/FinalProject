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
	public boolean treasure = false;
	
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
	public String switchTurnedOn() {
	    if (pulledCord == true) 
	    {
	        return "secretRoute";
	    } 
	    else 
	    {
	        return "You see a fireplace. There is an immense amount of heat coming out of it. Your hands feel immensely warm even when you're standing ten feet away from it. You feel like there could be something useful in the fireplace.";
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
	public String hatch() {
		// TODO Auto-generated method stub
		if(treasure == false)
		{
			return "secretRoom";
		}
		else
		{
			return "nothing";
		}
	}
	public String gold()
	{
		if(treasure == true)
		{
			return "gold";
		}
		else
		{
			return "backToStart";
		}
	}
	
	public String gGold()
	{
		if(treasure == true)
		{
			return "Gold";
		}
		else
		{
			return "Give Up";
		}
	}
	public String hHammer()
	{
		if(haveHammer == true)
		{
			return "lastHammer";
		}
		else 
		{
			return "";
		}
	}
	
	public String hhammer()
	{
		if(haveHammer == true)
		{
			return "Hammer";
		}
		else 
		{
			return "";
		}
	}
	
	public String aAxe()
	{
		if(haveAxe == true)
		{
			return "lastAxe";
		}
		else 
		{
			return "";
		}
	}
	
	public String aaxe()
	{
		if(haveAxe == true)
		{
			return "Axe";
		}
		else 
		{
			return "";
		}
	}
	
	public String wWood()
	{
		if(haveWood == true)
		{
			return "lastWood";
		}
		else 
		{
			return "";
		}
	}
	
	public String wwood()
	{
		if(haveWood == true)
		{
			return "Wood";
		}
		else 
		{
			return "";
		}
	}
	
	public String kKey()
	{
		if(haveKey == true)
		{
			return "lastKey";
		}
		else 
		{
			return "";
		}
	}
	
	public String kkey()
	{
		if(haveKey == true)
		{
			return "Key";
		}
		else 
		{
			return "";
		}
	}
	
}
