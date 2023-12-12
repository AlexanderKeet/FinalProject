package finalProject;

public class Words {
	
	Game game;
	Screen screen;
	ChoiceListener cListen;
	Items items = new Items();
	public Words(Game game, Screen screen, ChoiceListener cListen) {
		this.game = game;
		this.screen = screen;
		this.cListen = cListen;
		
	}
	public void setEvent(String str)
	{
		switch(str)
		{
			case "wakeUp": wakeUp(); break;
			case "cantMove": cantMove(); break;
			case "lookLeft": lookLeft(); break;
			case "inspectWorkbench": inspectWorkbench(); break;
			case "hammerGained": hammerGained(); break;
			case "tableSawNo": tableSawNo(); break;
		}
	}
	
	public void exampleText()
	{
		screen.mainTextArea.setText("");
		screen.compChoice("", "", "", "", "", "");
		cListen.compEvents("", "", "", "", "", "");
	}
	
	public void wakeUp()
	{
		screen.mainTextArea.setText("you open up your eyes, you are on a bed, not chained down in someone's basement( describe more )  \n what would you like to do?");
		screen.compChoice("move your limbs","","","","","");
		cListen.compEvents("cantMove", "", "", "", "", "");	
	}
	
	public void cantMove()
	{
		screen.mainTextArea.setText("you look around the room, in front of you there is à door, to the left there seems to be an old workshop, to the right a fireplace, behind you an old painting back  where would you like to look?, \n what would you like to do?");
		screen.compChoice("look left","look right","look forward","look behind you","","");
		// add look up and down later on 
		cListen.compEvents("lookLeft", "", "", "", "", "");
	}
	
	public void lookLeft()
	{
		screen.mainTextArea.setText("you walk towards à workbench, a small brown table with a bunch of tools on it");
		screen.compChoice("Inspect Workbench", "Go Back", "", "", "", "");
		cListen.compEvents("inspectWorkbench", "oldMansEntrance", "", "", "", "");
	}


	public void inspectWorkbench()
	{
		screen.mainTextArea.setText("upon looking closer at the workbench you see that there is 2 tools on the workbench, a hammer, and a huge table saw");
		cListen.compEvents(items.pickHammer(), items.tableSaw(), "", "", "", "");
		screen.compChoice(items.hammerChoice(), "useTableSaw", "", "", "", "");
		
		
	}


	public void hammerGained()
	{
		items.haveHammer = true;
		screen.mainTextArea.setText("you picked up à hammer! You walk back to inspect the workshop");
		screen.compChoice(">", "", "", "", "", "");
		cListen.compEvents("inspectWorkbench", "", "", "", "", "");
	}
	
	public void tableSawNo()
	{
		screen.mainTextArea.setText(" you dont have anything you can use on the tablesaw");
		screen.compChoice(">", "", "", "", "", "");
		cListen.compEvents("inspectWorkbench", "", "", "", "", "");
	}


}
