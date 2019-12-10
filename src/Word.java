import java.util.ArrayList;

/*
 * Everything that makes up a word including prefix, suffix, pictures, sounds, hints, family, level - everything.
 * 
 */
public class Word {
	private int level; // difficulty of word
	private int id; // word identifier
	private String prefix;
	private String suffix;
	private Audio wordSound;
	private Audio soundOut;
	private AVUnit avUnit;
	
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
}
