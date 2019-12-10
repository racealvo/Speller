import java.util.ArrayList;

public class AVUnit {
	int id;
	private ArrayList picList = new ArrayList();
	private ArrayList soundEffectList = new ArrayList(); // a sound associated with the word (like a jet engine for "Jet")

	AVUnit(int id)
	{
		this.id = id;
	}
	
	// TODO: this is a string, but it will be a picture (gif, jpg, png - something)
	public void AddAV(Visual pic, Audio audio)
	{
		picList.add(pic);
		soundEffectList.add(audio);
	}
}
