import java.util.ArrayList;

public class ContentManager {
	private
	ArrayList	levelOnePairings = new ArrayList();
	ArrayList	usedPairings = new ArrayList();
	
	public ContentManager()
	{
		// Create Content
		// Using hard coded values to start, but this will come from a database later
		
		Pairing pairing = new Pairing();
		pairing.setSuffix("AT");
	}
/*	
	public Pairing NextPairing()
	{
		
	}
*/
}
