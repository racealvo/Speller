import java.util.ArrayList;

public class GameMode {
	private Database db = new Database();
	private ContentManager mgr = new ContentManager(db);;
	
	/*
	 * level is zero based
	 */
	public void PicturePromptWithHints(int level) 
	{
		mgr.grabNewFamily(level);
		Word word = mgr.grabNewWord();

		// prompt
		mgr.prompt(Constants.CAN_YOU_SPELL, word.getWordSound());
		
		// present picture
		mgr.DisplayVisual(Constants.Positions.bottom, word);
		
		// present letters
		mgr.DisplayPrefixes(Constants.Positions.bottom, word);
		
		// present letters
		mgr.DisplaySuffix(Constants.Positions.bottom, word);
		
		// ask for prefix sounding like "X"
		//
	}
	
	public void PicturePromptGrabLetter(int level)
	{
		mgr.grabNewFamily(level);
		
		Word word = mgr.grabNewWord();
		
		// prompt
		mgr.prompt(Constants.PICK_FLOATING_LETTER, word.getWordSound());
		
		mgr.DisplayLetters(Constants.Positions.floating, word);
	}
}
