package finalProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceListener implements ActionListener {
	
	Screen screen;
	Game game;
	Words words;
	public String nextEvent1, nextEvent2, nextEvent3, nextEvent4, nextEvent5, nextEvent6;
	public ChoiceListener(Game game)
	{
		this.game = game;
	}
	public void compEvents(String a, String b, String c, String d, String e, String f)
	{
		nextEvent1 = a;
		nextEvent2 = b;
		nextEvent3 = c;
		nextEvent4 = d;
		nextEvent5 = e;
		nextEvent6 = f;
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		String choice = e.getActionCommand();
		
		switch(choice) {
		case "startButton": game.screen.runGameScreen(); game.words.wakeUp(); break;
		case "c1" : game.words.setEvent(nextEvent1); break;
		case "c2" : game.words.setEvent(nextEvent2); break;
		case "c3" : game.words.setEvent(nextEvent3); break;
		case "c4" : game.words.setEvent(nextEvent4); break;
		case "c5" : game.words.setEvent(nextEvent5); break;
		case "c6" : game.words.setEvent(nextEvent6); break;
		}
		
	}

}
