public class BeerSong{

	public static void main(String[] args)
	{
	Ninety_Nine_Bottles_of_Beer();
	}

	public static void Ninety_Nine_Bottles_of_Beer()
	{
	int bottles=99;
    	while(bottles-1>0)
    	{
        	System.out.println(bottles + " Bottles of beer on the wall, " + bottles + " bottles of beer. Take one down, pass it around ");
        	bottles--;
        	System.out.println(bottles + " Bottles of beer on the wall");
    	}
    	System.out.print("Take one down, pass it around, no more bottles of beer on the wall");
    	}


}
