package finalProject;

import java.awt.Color;

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
	//makes it so when the text of the event is put into the function in return that function 
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
			case "lookBehind": lookBehind(); break;
			case "inspectPainting": inspectPainting(); break;
			case "admiration": admiration(); break;
			case "hammerNo": hammerNo(); break;
			case "hammerYes": hammerYes(); break;
			case "safe": safe(); break;
			case "guessing": guessing(); break;
			case "nothingHappens": nothingHappens(); break;
			case "c121499": c121499(); break;
			case "c753300": c753300(); break;
			case "c123456": c123456(); break;
			case "c027227": c027227(); break;
			case "c303248": c303248(); break;
			case "hammerBash": hammerBash(); break;
			case "lookInside": lookInside(); break;
			case "axeObtained": axeObtained(); break;
			case "lookBehindAftermath": lookBehindAftermath(); break;
			case "locked": locked(); break;
			case "unlockDoor": unlockDoor(); break;
			case "tableSawYes": tableSawYes(); break;
			case "tableSawNext": tableSawNext(); break;
			case "keyObtained": keyObtained(); break;
			case "keyNext": keyNext(); break;
			case "twist": twist(); break;
			case "upTheStairs": upTheStairs(); break;
			case "leftStep": leftStep(); break;
			case "rightStep": rightStep(); break;
			case "topOfStairs": topOfStairs(); break;
			case "secretRoute": secretRoute(); break;
			case "nothing": nothing(); break;
			case "secretRoom": secretRoom(); break;
			case "enterSecretRoom": enterSecretRoom(); break;
			case "openTreasureSchest": openTreasureChest(); break;
			case "treasureObtained": treasureObtained(); break;
			case "walk": walk(); break;
			case "run": run(); break;
			case "ohNo": ohNo(); break;
			case "response": response(); break;
			case "response2": response2(); break;
			case "lastHammer": lastHammer(); break;
			case "lastAxe": lastAxe(); break;
			case "lastWood": lastWood(); break;
			case "lastKey": lastKey(); break;
			case "lastGold": lastGold(); break;
			case "backToStart": backToStart(); break;
			case "end": end(); break;
			case "backToStartMenu": backToStart(); break;
			case "exampleText": exampleText(); break;

		}
	}
	
	//presets for all the combinations of text displayed on the screen and on the buttons
	public void exampleText()
	{
		
		screen.mainTextArea.setText("Main text"); // sets the main text 
		screen.compChoice("button1", "button2", "button3", "button4", "button5", "button6"); //sets the text for all the buttons
		cListen.compEvents("a", "a", "a", "a", "a", "a"); //sets the next screen/event that screen will switch to when you click the button
		screen.item1.setText("item1");
		screen.item2.setText("item2");
		screen.item3.setText("item3");
		screen.item4.setText("item4");
	}
	
	public void wakeUp() {
	    screen.mainTextArea.setText("You slowly open your eyes, finding yourself on the cold hard floor. The room is dimly lit, with a unfinished cement floor. You dont remember how you got here and you feel like you should get out \n\nWhat would you like to do?");
	    screen.compChoice("Move your limbs", "test", "", "", "", "");
	    cListen.compEvents("cantMove", "exampleText", "", "", "", "");
	}

	public void cantMove() {
	    screen.mainTextArea.setText("Surveying the room, you notice a door in front, an old workshop to the left, a fireplace to the right, and an old painting behind you, depicting a smiling tree. \n\nWhere would you like to look?");
	    screen.compChoice("Look left", "Look right", "Look forward", "Look behind you", "", "");
	    // Add look up and down later on
	    cListen.compEvents("lookLeft", "lookRight", "lookForward", items.lookinBehind(), "", "");
	}

	public void lookLeft() {
	    screen.mainTextArea.setText("You walk towards a workbench, a small brown table with a bunch of tools on it.");
	    screen.compChoice("Inspect Workbench", "Go Back", "", "", "", "");
	    cListen.compEvents("inspectWorkbench", "cantMove", "", "", "", "");
	}

	public void inspectWorkbench() {
	    screen.mainTextArea.setText("Upon closer inspection, you notice two tools on the workbench—a hammer and a large table saw.");
	    screen.compChoice(items.hammerChoice(), "useTableSaw", "", "", "", "");
	    cListen.compEvents(items.pickHammer(), items.tableSaw(), "", "", "", "");    
	}

	public void hammerGained() {
	    items.haveHammer = true;
	    screen.item1.setText("Hammer");
	    screen.mainTextArea.setText("You pick up a hammer! Now there is only a table saw on the workshop.");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("inspectWorkbench", "", "", "", "", "");
	}

	public void tableSawNo() {
	    screen.mainTextArea.setText("You don't have anything suitable to use on the table saw.");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("inspectWorkbench", "", "", "", "", "");
	}

	public void lookRight() {
	    screen.mainTextArea.setText(items.switchTurnedOn());
	    screen.compChoice("Inspect the fireplace", "Go back", "", "", "", "");
	    cListen.compEvents("inspectFireplace", "cantMove", "", "", "", "");
	}

	public void inspectFireplace() {
	    screen.mainTextArea.setText("Upon closer inspection of the fireplace, you notice a cord coming out of it.");
	    screen.compChoice("Put your hands in the fireplace", "Think harder", "", "", "", "");
	    cListen.compEvents("handsInFire", "thinking", "", "", "", "");
	}

	public void handsInFire() {
	    screen.mainTextArea.setText("Without thinking, you put your hands in the fireplace, which is burning hot. Your hands burn to a crisp for a few seconds before you quickly pull them out, realizing your mistake.");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("inspectFireplace", "", "", "", "", "");
	}

	public void thinking() {
	    screen.mainTextArea.setText("You take a few seconds to think and ponder what to do next. Suddenly, you realize that the fire might stop if you break the cord.");
	    screen.compChoice("Destroy the cord", "Don't destroy the cord", "", "", "", "");
	    cListen.compEvents(items.hamaxe(), "inspectFireplace", "", "", "", "");
	}

	public void axeNo() {
	    screen.mainTextArea.setText("You pull and tug on the cord, but it is too thick. You're going to need something sharp to cut the cord.");
	    screen.compChoice("Go back", "", "", "", "", "");
	    cListen.compEvents("cantMove", "", "", "", "", "");
	}

	public void axeYes() {
	    screen.mainTextArea.setText("You grab your axe and swing it into the cord. SMASH! SMASH! SMASH! The cord breaks.");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("campfireOut", "", "", "", "", "");
	}

	public void campfireOut() {
	    items.pulledCord = true;
	    screen.mainTextArea.setText("After all that, you look over to the campfire, and it is off. It must've been electric, you think to yourself. \n\nWhat are you going to do?");
	    screen.compChoice("Inspect campfire", "Go back", "", "", "", "");
	    cListen.compEvents("inspectCampfire2", "backingUp", "", "", "", "");
	}

	public void backingUp() {
	    screen.mainTextArea.setText("You realize it's probably a good idea to go inspect the campfire because you might find something cool.");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("inspectCampfire2", "", "", "", "", "");
	}

	public void inspectCampfire2() {
	    screen.mainTextArea.setText("You take a closer look at the fireplace that's off. Now the only thing left in it is a bunch of wood.");
	    screen.compChoice("Open up the fireplace", "Go back", "", "", "", "");
	    cListen.compEvents("openCampfire", "backingUp", "", "", "", "");
	}

	public void openCampfire() {
	    screen.mainTextArea.setText("You open up the fireplace, and you see a bunch of wood in decent condition ready to grab.");
	    screen.compChoice("Grab the wood", "", "", "", "", "");
	    cListen.compEvents("woodGained", "", "", "", "", "");
	}

	public void woodGained() {
	    screen.item3.setText("Wood");
	    items.haveWood = true;
	    screen.mainTextArea.setText("You got wood! You put it back in your pocket and continue on.");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("cantMove", "", "", "", "", "");
	}
	
	public void secretRoute()
	{
		screen.mainTextArea.setText("You see a fireplace, but there is no fire coming from it. Theres probably nothing inside");
		screen.compChoice("inspect it anyway", "go back", "", "", "", "");
		cListen.compEvents(items.hatch(), "cantMove", "", "", "", "");
	}
	
	public void nothing()
	{
		screen.mainTextArea.setText("there really is nothing");
		screen.compChoice("go back", "", "", "", "", "");
		cListen.compEvents("cantMove", "", "", "", "", "");
	}
	
	public void secretRoom() 
	{
	    screen.mainTextArea.setText("While inspecting the fireplace, you notice a hidden latch. Curiosity gets the better of you, and you decide to investigate further.");
	    screen.compChoice("Press the latch", "Ignore it", "", "", "", "");
	    cListen.compEvents("enterSecretRoom", "cantMove", "", "", "", "");
	}

	public void enterSecretRoom() 
	{
	    screen.mainTextArea.setText("The fireplace swings open to reveal a secret room! Inside, you find a treasure chest.");
	    screen.compChoice("Open the chest", "Leave the room", "", "", "", "");
	    cListen.compEvents("openTreasureChest", "cantMove", "", "", "", "");
	}

	public void openTreasureChest() 
	{
		items.treasure = true;
	    screen.mainTextArea.setText("You open the chest and find a shiny gem, gold, and tons of cash.");
	    screen.compChoice("loot it all", "Leave it", "", "", "", "");
	    cListen.compEvents("treasureObtained", "secretRoom", "", "", "", "");
	}
	
	public void treasureObtained()
	{
		screen.mainTextArea.setText("you stuff your pockets full, and leave");
		screen.compChoice("", "", "", "", "", "");
		cListen.compEvents("", "", "", "", "", "");
	}

	public void lookForward() {
	    screen.mainTextArea.setText("You look forward, and there is a big metal locked door.");
	    screen.compChoice("Go back", "Open the door", "", "", "", "");
	    cListen.compEvents("cantMove", items.doorAttempt(), "", "", "", "");
	}

	public void lookBehind() {
	    screen.mainTextArea.setText("You look behind you and see a painting. Described on this painting is a smiling tree, which cheers you up a little bit.");
	    screen.compChoice("Inspect the painting", "Go back", "", "", "", "");
	    cListen.compEvents("inspectPainting", "cantMove", "", "", "", "");
	}

	public void inspectPainting() {
	    screen.mainTextArea.setText("You look closely at the painting and notice that it is bolted into the wall with nails. Very suspicious for a painting to be bolted into the wall. \n\nThere might be something behind this painting, you think to yourself.");
	    screen.compChoice("Unbolt the painting", "Admiration", "Go back", "", "", "");
	    cListen.compEvents(items.unboltPainting(), "admiration", "cantMove", "", "", "");
	}

	public void admiration() {
	    screen.mainTextArea.setText("You take a good look at the painting. It reminds you of your family at home and all the good things in life. You smile.");
	    screen.compChoice("Inspect", "", "", "", "", "");
	    cListen.compEvents("inspectPainting", "lookBehind", "", "", "", "");
	}

	public void hammerNo() {
	    screen.mainTextArea.setText("You try to pull out the nails with your hands, but they're really in there tight. You'll need some sort of tool if you're ever going to get these nails out.");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("inspectPainting", "", "", "", "", "");
	}

	public void hammerYes() {
	    screen.mainTextArea.setText("You grab the pointy end of the hammer and pull the nails out, one by one. The painting is now hanging off the wall with no support.");
	    screen.compChoice("Take off the painting", "", "", "", "", "");
	    cListen.compEvents("safe", "", "", "", "", "");
	}

	public void safe() {
	    screen.mainTextArea.setText("You take the painting off the wall and see a crevice where the painting used to be. In the crevice, there is a 6-digit combination safe.");
	    screen.compChoice("Try and guess the code", "", "", "", "", "");
	    cListen.compEvents("guessing", "", "", "", "", "");
	}

	public void guessing() {
	    screen.mainTextArea.setText("There are 6 different combinations you think might be right. What do you pick?");
	    screen.compChoice("121499", "753300", "123456", "027227", "303248", items.bash());
	    cListen.compEvents("c121499", "c753300", "c123456", "c027227", "c303248", items.goingCrazy());
	}

	public void nothingHappens() {
	    screen.mainTextArea.setText("Nothing happens.");
	    screen.compChoice("Try again", "", "", "", "", "");
	    cListen.compEvents("guessing", "", "", "", "", "");
	}

	public void c121499() {
	    items.comb1 = true;
	    screen.mainTextArea.setText("You turn the combo on the lock to 1.. 2.. 1.. 4.. 9.. 9..");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("nothingHappens", "", "", "", "", "");
	}

	public void c753300() {
	    items.comb2 = true;
	    screen.mainTextArea.setText("You turn the combo on the lock to 7.. 5.. 3.. 3.. 0.. 0..");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("nothingHappens", "", "", "", "", "");
	}

	public void c123456() {
	    items.comb3 = true;
	    screen.mainTextArea.setText("You turn the combo on the lock to 1.. 2.. 3.. 4.. 5.. 6..");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("nothingHappens", "", "", "", "", "");
	}

	public void c027227() {
	    items.comb4 = true;
	    screen.mainTextArea.setText("You turn the combo on the lock to 0.. 2.. 7.. 2.. 2.. 7..");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("nothingHappens", "", "", "", "", "");
	}

	public void c303248() {
	    items.comb5 = true;
	    screen.mainTextArea.setText("You turn the combo on the lock to 3.. 0.. 3.. 4.. 2.. 8..");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("nothingHappens", "", "", "", "", "");
	}

	public void hammerBash() {
	    screen.mainTextArea.setText("After realizing that it will probably take a while to guess every single possible combination, you grab your hammer and smash the safe open. CLONK! CLONK! CLONK! CLONK!");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("lookInside", "", "", "", "", "");
	}

	public void lookInside() {
	    screen.mainTextArea.setText("The safe is now all busted and on the floor. Inside, there is a big red fire axe.");
	    screen.compChoice("Grab the axe", "", "", "", "", "");
	    cListen.compEvents("axeObtained", "", "", "", "", "");
	}

	public void axeObtained() {
	    screen.item2.setText("Axe");
	    items.haveAxe = true;
	    screen.mainTextArea.setText("You got an axe!!");
	    screen.compChoice("Put it in your pocket", "", "", "", "", "");
	    cListen.compEvents("cantMove", "", "", "", "", "");
	}

	public void lookBehindAftermath() {
	    screen.mainTextArea.setText("The painting and safe are all messed up on the floor after what you did to them. Not much reason to go look there.");
	    screen.compChoice("Alright", "", "", "", "", "");
	    cListen.compEvents("cantMove", "", "", "", "", "");
	}

	public void locked() {
	    screen.mainTextArea.setText("You try to open the door but quickly realize it doesn't budge. It must be locked.");
	    screen.compChoice("Go back", "", "", "", "", "");
	    cListen.compEvents("cantMove", "", "", "", "", "");
	}

	public void unlockDoor() {
	    screen.mainTextArea.setText("You place your key into the keyhole...");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("keyNext", "", "", "", "", "");
	}

	public void tableSawYes() {
	    screen.mainTextArea.setText("You use the wood on the table saw.");
	    screen.compChoice(">", "", "", "", "", "");
	    cListen.compEvents("tableSawNext", "", "","","","");
	}
	
	public void tableSawNext() {
	    screen.mainTextArea.setText("You remember that you are a professional carpenter. You carefully carve the wood perfectly into a key.");
	    screen.compChoice("Grab the key", "", "", "", "", "");
	    cListen.compEvents("keyObtained", "", "", "", "", "");
	}

	public void keyObtained() {
	    items.haveKey = true;
	    screen.item4.setText("Key");
	    screen.mainTextArea.setText("YOU PICKED UP A KEY!!");
	    screen.compChoice("Go back ", "", "", "", "", "");
	    cListen.compEvents("cantMove", "", "", "", "", "");
	}

	public void keyNext() {
	    screen.mainTextArea.setText("You put the wooden key inside, and it surprisingly is a perfect fit.");
	    screen.compChoice("Twist the key", "", "", "", "", "");
	    cListen.compEvents("twist", "", "", "", "", "");
	}

	public void twist() {
	    screen.mainTextArea.setText("TWIST POP! The door opens. It leads to a dimly lit staircase leading upwards. You aren't sure whether or not you would like to go or not.");
	    screen.compChoice("Go up", "Stay down", "", "", "", "");
	    cListen.compEvents("upTheStairs", "cantMove", "", "", "", "");
	}

	public void upTheStairs() {
	    screen.mainTextArea.setText("You creak each step one by one by one. There are 20 steps.");
	    screen.compChoice("Start walking", "", "", "", "", "");
	    cListen.compEvents("rightStep", "", "", "", "", "");
	}

	public void leftStep() {
	    items.stepCount++;
	    screen.mainTextArea.setText("You take a left step.");
	    screen.compChoice("", "Take a right step", "", "", "", "");
	    cListen.compEvents("", items.stepOrStop(), "", "", "", "");
	}

	public void rightStep() {
	    screen.mainTextArea.setText("You take a right step.");
	    screen.compChoice("Take a left step", "", "", "", "", "");
	    cListen.compEvents("leftStep", "", "", "", "", "");
	}

	public void topOfStairs() {
	    screen.mainTextArea.setText("YOU REACHED THE TOP!!! After all those steps, you are exhausted, there is a regular looking room on this floor, and right ahead of you see the exit.");
	    screen.compChoice("run towards the exit", "walk towards the exit", "", "", "", "");
	    cListen.compEvents("run", "walk", "", "", "", "");
	}
	
	public void walk()
	{
		screen.mainTextArea.setText("You already exhausted after running up the stairs so you decide to take a nice walk instead of running, it takes you a whole minute to reach the door, but you are glad you took it easy");
		screen.compChoice("Open the door", "", "", "", "", "");
		cListen.compEvents("ohNo", "", "", "", "", "");
	}
	
	public void run()
	{
		screen.mainTextArea.setText("Even though you just ran up all those steps, you want freedom so bad that you sprint all the way to the door, it only takes a few second to reach the door");
		screen.compChoice("Open the door", "", "", "", "", "");
		cListen.compEvents("ohNo", "", "", "", "", "");
	}
	
	public void ohNo()
	{
		screen.mainTextArea.setText("Suprisingly the door actually opens, but when it does you are greeted by an old man \n\n <<HELLO>> says the old man");
		screen.compChoice("Hi","hows it going?", "who are you?", "get out of my way", "Are you my kidnapper?", "say nothing");
		cListen.compEvents("response", "response", "response", "response", "response", "response");
	}
	
	public void response()
	{
		screen.mainTextArea.setText("The old man doesnt reply to your response, so you immediately assume he is your kidnapper \n\n What will you use to attack?");
		screen.compChoice(items.hhammer(), items.aaxe(), items.wwood(), items.kkey(), items.gGold(), "" );
		cListen.compEvents(items.hHammer(), items.aAxe(),items.wWood(),  items.kKey() ,items.gold(), "");
	}
	
	public void response2()
	{
		screen.mainTextArea.setText("The old man is slowly walking towards you");
		screen.compChoice(items.hhammer(), items.aaxe(), items.wwood(), items.kkey(), items.gGold(), "" );
		cListen.compEvents(items.hHammer(), items.aAxe(),items.wWood(),  items.kKey() ,items.gold(), "");
	}
	
	public void lastHammer()
	{
		
		items.haveHammer = false;
		screen.mainTextArea.setText("you throw your Hammer, directly at the old man. but unfortunaty the old man dodges it");
		screen.compChoice("try somethine else", "", "", "", "", "");
		cListen.compEvents("response2", "", "", "", "", "");
	}
	
	public void lastAxe()
	{
		
		items.haveAxe = false;
		screen.mainTextArea.setText("you throw your Axe, directly at the old man. but unfortunaty the old man catches it and throws it aside");
		screen.compChoice("try somethine else", "", "", "", "", "");
		cListen.compEvents("response2", "", "", "", "", "");
	}
	
	public void lastWood()
	{
		
		items.haveWood = false;
		screen.mainTextArea.setText("you throw your leftover wood chips, directly at the old man. it doesnt do much...");
		screen.compChoice("try somethine else", "", "", "", "", "");
		cListen.compEvents("response2", "", "", "", "", "");
	}
	
	public void lastKey()
	{
		
		items.haveKey = false;
		screen.mainTextArea.setText("you throw your key, directly at the old man. it hits him right in the head, he seems angry now");
		screen.compChoice("try somethine else", "", "", "", "", "");
		cListen.compEvents("response2", "", "", "", "", "");
	}
	
	public void lastGold()
	{
		
		screen.mainTextArea.setText("you empty your pockets off all the treasure you collected earlier, and kick it everywhere. The old man very suprised looks suprised and rushes to pick up all of it. \n <<Hey thats my treasure!!!>> Says the old man. \n He seems very distracted.  ");
		screen.compChoice("Walk right past him", "", "", "", "", "");
		cListen.compEvents("end", "", "", "", "", "");
	}
	
	public void backToStart()
	{
		items.haveHammer = false;
		items.haveWood = false;
		items.pulledCord = false;
		items.haveAxe = false;
		items.comb1 = false;
		items.comb2 = false;
		items.comb3 = false;
		items.comb4 = false;
		items.comb5 = false;
		items.haveKey = false;
		items.stepCount = 0;
		items.treasure = false;
		screen.mainTextArea.setText("you give youself up to the old man, he brings you back into the house down the stairs and into the locked room, and then whacks you on the head. \n\n You lose consiousness and forget everything");
		screen.compChoice("Wake up", "", "", "", "", "");
		cListen.compEvents("wakeUp", "", "", "", "", "");
	}
	
	public void end()
	{
		screen.mainTextArea.setText("While the man is busy collecting his treasure, you walk right past him, to sweet freedom \n\n                  THE END");
		screen.compChoice("Go Back", "", "", "", "", "");
		cListen.compEvents("backToStartMenu", "", "", "", "", "");
	}
	
	public void backToStartMenu()
	{
		new Game();
	}
	
	


	
	
}
