/*
 * TODO: This class starts as a string, but then will become a sound when the final UI is developed.
 */
public class Sound
{
	private String sound;
	
	public Sound()
	{
		sound = new String();
	}
	
	public Sound(String _sound)
	{
		sound = _sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	// TODO: This starts out printing a string, but will play a sound with final UI.
	public void playSound()
	{
		System.out.println(sound);
	}

}
