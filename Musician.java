
public class Musician 
{
	private String name;
	private String[] instrumentArray;
	private int numberOfInstruments;
	
	public Musician()
	{	//instrumentArray to refer to an array of Strings with number of elements equal to 10 
		//sets the value of the instance variable numberOfInstruments to 0
		name = " ";
		instrumentArray = new String[10];
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addInstrument(String newInstrument) 
	{
		if(numberOfInstruments < instrumentArray.length)
		{
				instrumentArray[numberOfInstruments] = newInstrument;
				numberOfInstruments++;
		}		
	}
	
	public String getInstruments()
	{
		/*
		 * : returns the concatenation of the name of each instrument located in the instrumentArray 
		 * (Note: This can be accomplished by looping through the part of the instrumentArray that 
		 * is filled with instruments and concatenating each of these values into a single string)
		 */
		String instruments = " ";
		for(int i = 0; i < instrumentArray.length; i ++)
		{	
			if(instrumentArray[i] == null)
				return instruments;
			else
			instruments += instrumentArray[i] + " ";
		}
		return instruments;
	}
	
	public int getNumberOfInstruments()
	{
		return numberOfInstruments;
	}
	
	public String toString()
	{
		return "Name: " + name + " plays " + numberOfInstruments + " instruments which are" + getInstruments();
	}
	
	public boolean equals(Object otherObject)
	{
		/*
		 * returns true if the otherObject passed is not null and is a Musician and if the name instance
		 * variable of otherObject is equal to the name instance variable of the calling object and 
		 * if the String returned by a call to the getInstruments method of otherObject is equal 
		 * to the String returned by a call to the getInstruments method of the calling object and 
		 * if the numberOfInstruments instance variable of otherObject is equal to the numberOfInstruments
		 *  instance variable of the calling object; otherwise returns false
		 */
		if(otherObject != null && otherObject instanceof Musician && ((Musician) otherObject).getName() == this.getName() && 
				((Musician) otherObject).getInstruments().equalsIgnoreCase(((Musician) otherObject).getInstruments()) && numberOfInstruments == this.getNumberOfInstruments())
			return true;
		return false;
		
		
	}
}
