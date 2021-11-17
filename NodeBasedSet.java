
public class NodeBasedSet<T> implements SetInterface<T>
{
	private SetNode<T> theSet;
	
	public NodeBasedSet()
	{
		theSet = null;
	}
	public int size()
	{
		 int size = 0;
		 SetNode<T> curr = theSet;
		    while (curr!= null)
		    {
		        size++;
		        curr = curr.getLink();
		    }    
		   return size;
	}
	
	public boolean memberOf(T element) 
	{
		//returns true if element belongs to theSet; otherwise return false
		SetNode<T> curr = theSet;
        while(curr != null)
        {
            if(curr == element)
            {
                return true;
            }
            curr = curr.getLink();
        }
        return false;
	}
	
	public void add(T element) throws DuplicateFoundException
	{
		/*
		 *makes a call to the memberOf method passing the element parameter, 
		 *if the value returned by returned by the memberOf is true then throw a DuplicateFoundException with the String
		 * “Duplicate cannot be added to a Set”; otherwise add the element to the set
		 */
		if(memberOf(element))		
		new DuplicateFoundException("Duplicate cannot be added to a Set");
		
		else 
		{
			SetNode<T> curr = new SetNode(element);
			curr.setLink(theSet);
			theSet = curr;
		}	
	}
	
	public void delete(T element)
	/*
	 * : makes a call to the memberOf method passing the element parameter, 
	 * if the value returned by returned by the memberOf is false then return without making any changes to the set;
	 *  otherwise delete the element from the set
	 */
	{
		 {
		        if(memberOf(element))
		            return;
		        else
		        {
		            if (theSet == element)
		            {
		                theSet = theSet.getLink();
		            }
		            SetNode<T> last = theSet;
		            SetNode<T> curr = theSet.getLink();

		            while(curr != null)
		            {
		                if(curr == element)
		                {
		                    last.setLink(curr.getLink());
		                    return;
		                }
		                last = curr;
		                curr = curr.getLink();
		            }
		        }
		 		}	
		    }
	
	public String toString()
	{
		//returns a concatenation of the toString method of each element in the set 
		/*String sets = " ";
		SetNode<T> curr = theSet;
		while(curr != null) 
		{
			sets += theSet.getInfo();
			curr = curr.getLink();	
		}	
		return sets;*/
		 SetNode<T> current = theSet;
	        String result = " ";
	        while(current != null) {
	            result += current.getInfo() + "\n";
	            current = current.getLink();
	        }
	        return result;
	}
	
	
}
