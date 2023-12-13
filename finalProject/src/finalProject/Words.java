package finalProject;

public class Words {
	//change the color of the background in climax
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
			case "lookRight":lookRight(); break;
			case "inspectFireplace": inspectFireplace(); break;
			case "handsInFire": handsInFire(); break;
			case "thinking": thinking(); break;
			case "axeNo" : axeNo(); break;
			case "axeYes": axeYes(); break;
			case "campfireOut": campfireOut(); break;
			case "backingUp": backingUp(); break;
			case "inspectCampfire2": inspectCampfire2(); break;
			case "openCampfire": openCampfire(); break;
			case "woodGained": woodGained(); break;
			case "lookForward": lookForward(); break;
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
		cListen.compEvents("lookLeft", "lookRight", "lookForward", "LookBehind", "", "");
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
		screen.compChoice(items.hammerChoice(), "useTableSaw", "", "", "", "");
		cListen.compEvents(items.pickHammer(), items.tableSaw(), "", "", "", "");
		
	}


	public void hammerGained()
	{
		items.haveHammer = true;
		screen.item1.setText("hammer");
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
	
	public void lookRight()
	{
		screen.mainTextArea.setText(items.switchTurnedOn());
		screen.compChoice("inspect da fireplace", "go back", "", "", "", "");
		cListen.compEvents("inspectFireplace", "cantMove", "", "", "", "");
	}
	
	public void inspectFireplace()
	{
		screen.mainTextArea.setText("upon looking closer at da fireplace you see that there is a cord coming out of it");
		screen.compChoice("put your hands in the fireplace ", "think harder", "", "", "", "");
		cListen.compEvents("handsInFire", "thinking", "", "", "", "");
	}
	
	public void handsInFire()
	{
		screen.mainTextArea.setText("without thinking you put your hands in the fireplace, which is burning hot, your hands burn to crisp for a few seconds before you quickly pull them out, realizing your mistake");
		screen.compChoice(">", "", "", "", "", "");
		cListen.compEvents("inspectFireplace", "", "", "", "", "");
	}
	
	public void thinking()
	{
		screen.mainTextArea.setText("you decide to take a few secnonds to think and ponder of what to do next, when all of a sudden you realise that the fire might stop if you break the cord");
		screen.compChoice("destroy the cord", "dont destroy the cord", "", "", "", "");
		cListen.compEvents(items.hamaxe(), "inspectFireplace", "", "", "", "");
	}
	
	public void axeNo()
	{
		screen.mainTextArea.setText("you pull and tug on the cord but it is to thick. youre going to need something sharp to cut the cord");
		screen.compChoice("", "", "", "", "", "");
		cListen.compEvents("", "", "", "", "", "");
	}
	
	public void axeYes()
	{
		screen.mainTextArea.setText("you grab your axe and you swing it into the cord SMASH SAMSH SMASH with youre axe and the cord break ");
		screen.compChoice(">", "", "", "", "", "");
		cListen.compEvents("campfireOut", "", "", "", "", "");
	}
	
	public void campfireOut()
	{
		items.pulledCord = true;
		screen.mainTextArea.setText("after all that you look over to the campfire and it is off, mustve been electirc you think to yourself \n whatchu gonna do?");
		screen.compChoice("inspect campfire", "go back", "", "", "", "");
		cListen.compEvents("inspectCampfire2", "backingUp", "", "", "", "");
	}
	
	public void backingUp()
	{
		screen.mainTextArea.setText("you realise its probabaly a good idea to go inspect the campfire because you might find something cool");
		screen.compChoice(">", "", "", "", "", "");
		cListen.compEvents("inspectCampfire2", "", "", "", "", "");
	}
	
	public void inspectCampfire2()
	{
		screen.mainTextArea.setText("you take a closer look at the fireplace tahts off, now the only thing left in it is a bunch of wood,");
		screen.compChoice("Open up the fire place", "go back", "", "", "", "");
		cListen.compEvents("openCampfire", "backingUp", "", "", "", "");
	}
	
	public void openCampfire()
	{
		screen.mainTextArea.setText("you open up the fireplace you see a bunch of wood in decent condition ready to grab");
		screen.compChoice("grab the wood ", "", "", "", "", "");
		cListen.compEvents("woodGained", "", "", "", "", "");
	}
	
	public void woodGained()
	{
		items.haveWood = true;
		screen.mainTextArea.setText("you got wood!!! you put it back in your pocket and continue on");
		screen.compChoice(">", "", "", "", "", "");
		cListen.compEvents("cantMove", "", "", "", "", "");
	}
	
	public void lookForward()
	{
		screen.mainTextArea.setText("you look in the void, thinking about your life decisions thinkng of all the sadnes in life and why we even exist int the end we are alll but bones but we should still want to be happy even if it means going through sadness to be happy ");
		screen.compChoice("go back", "", "", "", "", "");
		cListen.compEvents("cantMove", "", "", "", "", "");
	}
	
	public void lookBehind()
	{
		screen.mainTextArea.setText("you look behind you and you see a painting, described on this painting is a tree who is smiling, it cheers you up a little bit");
		screen.compChoice("inspect the painting", "go back", "", "", "", "");
		cListen.compEvents("inspectPainting", "cantMove", "", "", "", "");
	}
	public void inspectPainting()
	{
		screen.mainTextArea.setText("you look close at the is painting and you see that it is bolted into the wall with nails, very suspicious for painting to be bloted into the wall, \n there might be something behind this peinitng, you think to yourself");
		screen.compChoice("unbolt the painting", "admiration", "", "", "", "");
		cListen.compEvents(items.unboltPainting(), "", "", "", "", "");
	}
	
	
	public void admiration()
	{
		screen.mainTextArea.setText("you take a good look at the painting, it reminds you of your family at home and all of the good things life, you smile");
		screen.compChoice(">", "", "", "", "", "");
		cListen.compEvents("inspect", "", "", "", "", "");
	}
	
	public void hammerNo()
	{
		screen.mainTextArea.setText("you try to pull out the nails with your hands, but theyre really in there tight, youll need some sort of tool if youre ever gonna get these nails out");
		screen.compChoice(">", "", "", "", "", "");
		cListen.compEvents("inspectPainting", "", "", "", "", "");
	}
	
	public void hammerYes()
	{
		screen.mainTextArea.setText("you grab the pointy end of the hammer and you pull the nails out, one by one, the painting is now hanging of the wall with no support");
		screen.compChoice("take off the painting", "", "", "", "", "");
		cListen.compEvents("safe", "", "", "", "", "");
	}
	
	public void safe()
	{
		screen.mainTextArea.setText("you tke the painting off the wall, and see a crevace where the painting used to be. in the cravace there is a 6 digit combination safe ");
		screen.compChoice("try and guess the code", "", "", "", "", "");
		cListen.compEvents("guessing", "", "", "", "", "");
	}
	
	public void guessing()
	{
		screen.mainTextArea.setText("there is 6 different combinations you think might be right \n what do you pick?");
		screen.compChoice("121499", "753300", "123456", "027227", "303248", items.bash());
		cListen.compEvents("121499", "753300", "123456", "027227", "303248", items.goingCrazy());
	}
	
	
	
	


}
