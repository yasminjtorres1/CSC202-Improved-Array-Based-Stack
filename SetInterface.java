
public interface SetInterface<T> 
{
		public int size();
		
		public boolean memberOf(T element);
		
		public void add(T element) throws DuplicateFoundException;
		
		public void delete(T element);
		
		public String toString();
}
