
public class SetNode<T> 
{
	private T info;
	private SetNode<T> link;
	
	public SetNode(T info)
	{
		this.info = info;
		link = null;
	}
	
	public void setInfo(T info)
	{
		this.info = info;
	}
	
	public T getInfo()
	{
		return info;
	}
	
	public void setLink(SetNode<T> link)
	{
		this.link = link;
	}
	
	public SetNode<T> getLink()
	{
		return link;
	}
}
