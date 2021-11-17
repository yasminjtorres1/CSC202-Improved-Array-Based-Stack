
public class SetDemo {

	public static void main(String[] args) 
	{
		SetInterface<Musician> rush = new NodeBasedSet<Musician>();
		Musician geddyLee = new Musician();
		geddyLee.setName("Geddy Lee");
		geddyLee.addInstrument("Vocals");
		geddyLee.addInstrument("Bass");
		geddyLee.addInstrument("Synthesizers");
		
		Musician alexLifeson = new Musician();
		alexLifeson.setName("Alex Lifeson");
		alexLifeson.addInstrument("Electric Guitar");
		alexLifeson.addInstrument("Acoustic Guitar");
		alexLifeson.addInstrument("Background Vocals");
		
		Musician johnRutsey = new Musician();
		johnRutsey.setName("John Rutsey");
		johnRutsey.addInstrument("Drums");
		
		try 
		{
			rush.add(johnRutsey);
			rush.add(geddyLee);
			rush.add(alexLifeson);
			
			System.out.println(rush);
			System.out.println(rush.size());
			rush.delete(johnRutsey);
			System.out.println(rush);
			
			Musician neilPeart = new Musician();
			neilPeart.setName("Neil Peart");
			neilPeart.addInstrument("Drums");
			neilPeart.addInstrument("Percussion");		
			rush.add(neilPeart);
			
			System.out.println(rush);
			rush.delete(neilPeart);
			rush.delete(geddyLee);
			rush.delete(alexLifeson);
		}
		
		catch(DuplicateFoundException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
