import java.util.ArrayList;

/* Contains List of Word Pairings
 * 
 */
public class Pairing {
	private	int			id; 
	private String		suffix = "";
	private ArrayList	prefixList = new ArrayList();
	private ArrayList	picList = new ArrayList();
	private ArrayList	wordSoundList = new ArrayList();
	private ArrayList	soundOutList = new ArrayList();
	private ArrayList	soundEffectList = new ArrayList();
	private ArrayList	usedPrefixIndices = new ArrayList();
	
	public Pairing(int _id)
	{
		id = _id;
		
		// we are spelling it here, but we will say it.  This will be an audio clip.
		wordSoundList.add("Saying the word: BAT");
		wordSoundList.add("Saying the word: CAT");
		wordSoundList.add("Saying the word: FAT");
		wordSoundList.add("Saying the word: HAT");
		wordSoundList.add("Saying the word: LAT");
		wordSoundList.add("Saying the word: MAT");
		wordSoundList.add("Saying the word: PAT");
		wordSoundList.add("Saying the word: RAT");
		wordSoundList.add("Saying the word: SAT");
		wordSoundList.add("Saying the word: TAT");
		wordSoundList.add("Saying the word: VAT");

		// we are spelling it here, but we will add real pictures here.
		
		//Bat
		PictureUnit pictureUnit = new PictureUnit();
		pictureUnit.add("Animal: Flying Bat");
		pictureUnit.add("Baseball Bat");
		pictureUnit.add("gif of a bat swinging, as in \"to bat\"");
		picList.add(pictureUnit);
		
		//Cat
		pictureUnit = new PictureUnit();
		pictureUnit.add("Calico Cat");
		pictureUnit.add("Black Cat");
		pictureUnit.add("Mad Cat");
		picList.add(pictureUnit);
		
		//Fat
		pictureUnit = new PictureUnit();
		pictureUnit.add("Fat Pic");
		picList.add(pictureUnit);
		
		//Hat
		pictureUnit = new PictureUnit();
		pictureUnit.add("Hat Pic");
		picList.add(pictureUnit);
		
		//Lat
		pictureUnit = new PictureUnit();
		pictureUnit.add("Lat Pic");
		picList.add(pictureUnit);
		
		//Mat
		pictureUnit = new PictureUnit();
		pictureUnit.add("Mat Pic");
		picList.add(pictureUnit);
		
		//Pat
		pictureUnit = new PictureUnit();
		pictureUnit.add("Pat Pic");
		picList.add(pictureUnit);
		
		//Rat
		pictureUnit = new PictureUnit();
		pictureUnit.add("Rat Pic");
		picList.add(pictureUnit);
		
		//Sat
		pictureUnit = new PictureUnit();
		pictureUnit.add("Sat Pic");
		picList.add(pictureUnit);
		
		//Tat
		pictureUnit = new PictureUnit();
		pictureUnit.add("Tat Pic");
		picList.add(pictureUnit);
		
		//Vat
		pictureUnit = new PictureUnit();
		pictureUnit.add("Vat Pic");
		picList.add(pictureUnit);
		
		// we are spelling it here, but we will say it.  This will be an audio clip.
		soundOutList.add("Buh - AT, BAT");
		soundOutList.add("Cuh - AT, CAT");
		soundOutList.add("Fuh - AT, FAT");
		soundOutList.add("Huh - AT, HAT");
		soundOutList.add("Luh - AT, LAT");
		soundOutList.add("Muh - AT, MAT");
		soundOutList.add("Puh - AT, PAT");
		soundOutList.add("Ruh - AT, RAT");
		soundOutList.add("Suh - AT, SAT");
		soundOutList.add("Tuh - AT, TAT");
		soundOutList.add("Vuh - AT, VAT");
		

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
	
	public void AddPrefix(String prefix)
	{
		prefixList.add(prefix);
	}
	
	public ArrayList getWordSoundList() {
		return wordSoundList;
	}

	public void setWordSoundList(ArrayList wordSoundList) {
		this.wordSoundList = wordSoundList;
	}
	
	public void AddWordSound(Sound sound)
	{
		wordSoundList.add(sound);
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
