import java.util.ArrayList;

/* Contains List of Word Pairings
 * 
 */
public class Pairing {
	private	int			id; 
	private String		suffix = "";
	private ArrayList	prefixList = new ArrayList();
	private ArrayList	picsList = new ArrayList();
	private ArrayList	wordSoundList = new ArrayList();
	private ArrayList	soundOutList = new ArrayList();
	private ArrayList	soundEffectList = new ArrayList();
	private ArrayList	usedPrefixIndices = new ArrayList();
	
	public Pairing()
	{
		
	}
	
	// getters / setters
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int i)
	{
		this.id = i;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public ArrayList getPrefixList() {
		return prefixList;
	}

	public void setPrefixList(ArrayList prefixList) {
		this.prefixList = prefixList;
	}

	public ArrayList getPicsList() {
		return picsList;
	}

	public void setPicsList(ArrayList picsList) {
		this.picsList = picsList;
	}

	public ArrayList getWordSoundList() {
		return wordSoundList;
	}

	public void setWordSoundList(ArrayList wordSoundList) {
		this.wordSoundList = wordSoundList;
	}

	public ArrayList getSoundOutList() {
		return soundOutList;
	}

	public void setSoundOutList(ArrayList soundOutList) {
		this.soundOutList = soundOutList;
	}

	public ArrayList getSoundEffectList() {
		return soundEffectList;
	}

	public void setSoundEffectList(ArrayList soundEffectList) {
		this.soundEffectList = soundEffectList;
	}
	
	
	// methods
	public void Reset()
	{
		usedPrefixIndices = new ArrayList();
	}
}
