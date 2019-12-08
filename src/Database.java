/*
 * TODO: This is starting as a file, but it will be a real database eventually. 
 */
public class Database 
{
	GrabNewPairing()
	{
		Pairing pairing = new Pairing(1);
		
		pairing.setSuffix("AT");

		pairing.AddPrefix("B");
		pairing.AddPrefix("C");
		pairing.AddPrefix("F");
		pairing.AddPrefix("H");
		pairing.AddPrefix("L");
		pairing.AddPrefix("M");
		pairing.AddPrefix("P");
		pairing.AddPrefix("R");
		pairing.AddPrefix("S");
		pairing.AddPrefix("T");
		pairing.AddPrefix("V");
		
		// we are spelling it here, but we will say it.  This will be an audio clip.
		pairing.AddWordSound(new Sound("Saying the word: BAT"));
		pairing.AddWordSound(new Sound("Saying the word: CAT"));
		pairing.AddWordSound(new Sound("Saying the word: FAT"));
		pairing.AddWordSound(new Sound("Saying the word: HAT"));
		pairing.AddWordSound(new Sound("Saying the word: LAT"));
		pairing.AddWordSound(new Sound("Saying the word: MAT"));
		pairing.AddWordSound(new Sound("Saying the word: PAT"));
		pairing.AddWordSound(new Sound("Saying the word: RAT"));
		pairing.AddWordSound(new Sound("Saying the word: SAT"));
		pairing.AddWordSound(new Sound("Saying the word: TAT"));
		pairing.AddWordSound(new Sound("Saying the word: VAT"));
		
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
}
