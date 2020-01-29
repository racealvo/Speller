import java.util.ArrayList;

/*
 * Everything that makes up a word including prefix, suffix, pictures, sounds, hints, family, level - everything.
 * 
 */
public class Word {
	private int level; // difficulty of word
	private int id; // word identifier
	private String prefix;
	private Audio prefixSound;
	private String suffix;
	private Audio suffixSound;
	private Audio wordSound;
	private Audio soundOut;
	private ArrayList avUnits = new ArrayList();
	private int avUnitsIndex = 0;
	
	Word(int id)
	{
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Audio getSoundOut() {
		return soundOut;
	}

	public void setSoundOut(Audio soundOut) {
		this.soundOut = soundOut;
	}

	public Audio getWordSound() {
		return wordSound;
	}

	public void setWordSound(Audio wordSound) {
		this.wordSound = wordSound;
	}
	
	public Audio getPrefixSound() {
		return prefixSound;
	}

	public void setPrefixSound(Audio prefixSound) {
		this.prefixSound = prefixSound;
	}

	public Audio getSuffixSound() {
		return suffixSound;
	}

	public void setSuffixSound(Audio suffixSound) {
		this.suffixSound = suffixSound;
	}


	
	public void addAVUnit(Audio audio, Visual visual)
	{
		avUnits.add(new AVUnit(Constants.AVID++, audio, visual));
	}
	
	public AVUnit getNextAVUnit()
	{
		avUnitsIndex++;
		avUnitsIndex = (avUnitsIndex >= avUnits.size()) ? 0 : avUnitsIndex;
		
		return (AVUnit)avUnits.get(avUnitsIndex);
	}
	
	public AVUnit getCurrentAVUnit()
	{
		return (AVUnit)avUnits.get(avUnitsIndex);
	}
	
	public boolean checkSpelling(boolean inputIsPrefix, String input)
	{
		boolean result = true;
		
		if (inputIsPrefix)
		{
			result = (input + suffix).contentEquals(prefix+suffix);
		}
		else
		{
			result = (prefix + input).contentEquals(prefix+suffix);
		}
		
		return result;
	}
}
