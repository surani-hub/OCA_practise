import java.util.*;

class ListAccess{
	public static void main(String[] args){
		/*
		ArrayList<Ink> inks = new ArrayList<Ink>();
		inks.add(new ColorInk());
		inks.add(new BlackInk());
		
		if(inks.get(0) instanceof BlackInk){
			Ink ink = (BlackInk)inks.get(0);
		}
		*/
		
		Printable printable = null;
		BlackInk blackInk = new BlackInk();
		ColorInk colorInk = new ColorInk();
		printable = (Printable)colorInk;
	}
}