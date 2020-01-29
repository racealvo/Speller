/*
 * TODO: This starts out using strings.  Eventually, it will use a gif, mpg, png, tiff, etc.
 */
public class Visual {
	private int id;
	private String visual = new String();

	public Visual(int id, String visual) {
		this.id = id;
		this.visual = visual;
	}

	public String getVisual() {
		return visual;
	}

	public void setVisual(String visual) {
		this.visual = visual;
	}

	// TODO: This starts out printing a string, but will play a sound with final UI.
	public void playVisual() {
		System.out.println(visual);
	}
}
