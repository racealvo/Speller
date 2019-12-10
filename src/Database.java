/*
 * TODO: This is starting as a file, but it will be a real database eventually. 
 */
public class Database 
{
	// TODO: this hard codes a family for now.
	Database()
	{
		int wordId = 0;
		int avUnitId = 0;
		int visualId = 0;
		int audioId = 0;
		Word word;
		AVUnit avUnit;
		
		Family family = new Family(1);
		family.setSuffix("AT");

		//Bat
		word = new Word(wordId++);
		word.setPrefix("B");
		word.setWordSound(new Audio("Saying the word: BAT"));
		avUnit = new AVUnit(avUnitId++);
		word.AddAV(new Visual(visualId++, "Animal: Flying Bat"), new Audio(audioId, "Squeek, squeek"));
		word.AddAV(new Visual("Baseball Bat"), new Audio("Crack of a bat"));
		word.AddAV(new Visual("gif of a someone batting at a fly."), new Audio("no sound"));
		word.setSoundOut(new Audio("Buh - AT, BAT"));
		

		family.AddPrefix("C");
		family.AddPrefix("F");
		family.AddPrefix("H");
		family.AddPrefix("L");
		family.AddPrefix("M");
		family.AddPrefix("P");
		family.AddPrefix("R");
		family.AddPrefix("S");
		family.AddPrefix("T");
		family.AddPrefix("V");
		
		// TODO: we are spelling it here, but we will say it.  This will be an audio clip.
		family.AddWordSound(new Audio("Saying the word: CAT"));
		family.AddWordSound(new Audio("Saying the word: FAT"));
		family.AddWordSound(new Audio("Saying the word: HAT"));
		family.AddWordSound(new Audio("Saying the word: LAT"));
		family.AddWordSound(new Audio("Saying the word: MAT"));
		family.AddWordSound(new Audio("Saying the word: PAT"));
		family.AddWordSound(new Audio("Saying the word: RAT"));
		family.AddWordSound(new Audio("Saying the word: SAT"));
		family.AddWordSound(new Audio("Saying the word: TAT"));
		family.AddWordSound(new Audio("Saying the word: VAT"));
		
		// TODO: we are spelling it here, but we will add real pictures here.
		
		
		//Cat
		pictureUnit = new PictureUnit();
		family.AddPictureUnit("Calico Cat");
		family.AddPictureUnit("Black Cat");
		family.AddPictureUnit("Mad Cat");
		picList.add(pictureUnit);
		
		//Fat
		pictureUnit = new PictureUnit();
		family.AddPictureUnit("Fat Pic");
		picList.add(pictureUnit);
		
		//Hat
		pictureUnit = new PictureUnit();
		family.AddPictureUnit("Hat Pic");
		picList.add(pictureUnit);
		
		//Lat
		pictureUnit = new PictureUnit();
		family.AddPictureUnit("Lat Pic");
		picList.add(pictureUnit);
		
		//Mat
		pictureUnit = new PictureUnit();
		family.AddPictureUnit("Mat Pic");
		picList.add(pictureUnit);
		
		//Pat
		pictureUnit = new PictureUnit();
		family.AddPictureUnit("Pat Pic");
		picList.add(pictureUnit);
		
		//Rat
		pictureUnit = new PictureUnit();
		family.AddPictureUnit("Rat Pic");
		picList.add(pictureUnit);
		
		//Sat
		pictureUnit = new PictureUnit();
		family.AddPictureUnit("Sat Pic");
		picList.add(pictureUnit);
		
		//Tat
		pictureUnit = new PictureUnit();
		family.AddPictureUnit("Tat Pic");
		picList.add(pictureUnit);
		
		//Vat
		pictureUnit = new PictureUnit();
		family.AddPictureUnit("Vat Pic");
		picList.add(pictureUnit);
		
		// we are spelling it here, but we will say it.  This will be an audio clip.
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
	
	GrabNewPairing()
	{
	}
}
