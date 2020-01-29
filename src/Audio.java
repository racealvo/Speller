/*
 * TODO: This class starts as a string, but then will become a Audio when the final UI is developed.
 */
public class Audio
{
	private int id;
	private String audio = new String();
	
	public Audio(int id, String audio)
	{
		this.id = id;
		this.audio = audio;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}
	
	// TODO: This starts out printing a string, but will play a Audio with final UI.
	public void playAudio()
	{
		System.out.print(audio);
	}
}
