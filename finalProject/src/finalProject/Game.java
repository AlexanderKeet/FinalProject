package finalProject;




public class Game {
	
	Screen screen = new Screen();
	ChoiceListener cListen = new ChoiceListener(this);
	Words words = new Words(this, screen, cListen);
	
	
	public static void main(String[] args)
	{
		new Game();
	}
	
	public Game()
	{
		screen.theScreen(cListen);
		screen.runTitleScreen();
	}
		
		
		
}


