import java.util.ArrayList;

public class ContentManager {
	private	ArrayList	levelOneFamily = new ArrayList();
	private ArrayList	usedFamilies = new ArrayList();
	private Database 	db;
	private Family		family;
	private Word		word;
	
	public ContentManager(Database db)
	{
		// Create Content
		// Using hard coded values to start, but this will come from a database later
		
		this.db = db;
	}
	
	public Family grabNewFamily(int level)
	{
		family = db.GrabNewFamily(); 
		return family;
	}
	
	// TODO: manage picking out new words - track the used words
	public Word grabNewWord()
	{
		return db.GrabNewWord(family);
	}
	
	public void prompt(Audio prompt, AVUnit avUnit)
	{
		System.out.println(prompt);
//		System.out.println(avUnit.)
	}

	public void prompt(Audio prompt, Audio statement)
	{
		prompt.playAudio();
		System.out.print(" ");
		statement.playAudio();
	}
	
	// This has to start a timer and move the letter around the screen
	// In the command line version, the letters announce their position on the screen.
	// If the user picks the correct letter, applause happens and the timer ends
	// If the user picks the wrong letter, try again - and the timer continues
	// If the user quits, thanks for playing and the timer ends.
	public void DisplayLetters(Word word)
	{
		
		System.out.println(Constants.FLOATING);
	}
	
	// Present the visual (picture) of the word
	public void DisplayVisual(Constants.Positions position, Word word)
	{
		word.getCurrentAVUnit().playVisual();
/*		
		Audio audio;
		
		word
		word.getNextAVUnitElement(visual, audio);
*/		
	}
	
	public void DisplayPrefixes(Constants.Positions position, Word word)
	{
		
	}
	
	public void DisplaySuffix(Constants.Positions position, Word word)
	{
		
	}
}
