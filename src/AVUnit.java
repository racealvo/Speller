import java.util.ArrayList;

public class AVUnit {
	int id;
	private Audio audio; // a sound associated with the word (like a jet engine for "Jet")
	private Visual visual;

	AVUnit(int id, Audio audio, Visual visual)
	{
		this.id = id;
		this.audio = audio;
		this.visual = visual;
	}
	
	// TODO: this is a string, but it will be a picture (gif, jpg, png - something)
	public void setAVUnit(Audio audio, Visual visual)
	{
		this.visual = visual;
		this.audio = audio;
	}

	public void playVisual()
	{
		this.visual.playVisual();
	}
}
