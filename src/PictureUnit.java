import java.util.ArrayList;
/* 
 * There may be more than one picture to describe a word. 
 * Think of BAT: the flying animal, the baseball bat, and the verb to bat.
 */
public class PictureUnit {
	private ArrayList picList = new ArrayList();

	public ArrayList getPicList() {
		return picList;
	}
	
	// TODO: change this from a string to a gif, png, jpg, or mpeg (graphic)
	public void add(String pic)
	{
		picList.add(pic);
	}
}
