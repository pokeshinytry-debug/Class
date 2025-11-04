package unit4.collectionsLib;
public class IntNode
{
	private int value ;
	private IntNode next ;
	public IntNode( int x )
	{
	this.value = x ;
	this.next = null ;
	}
	public IntNode( int x , IntNode next )
	{
	this.value = x ;
	this.next = next;
	}
	public int getValue ( )
	{
	return ( this.value );
	}
	public IntNode getNext ( )
	{
	return (this.next);
	}
	public boolean hasNext ( )
	{
	return (this.next != null);
	}
	public void setvalue ( int x )
	{
	this.value = x;
	}
	public void setNext ( IntNode next )
	{
	this.next = next;
	}
	public String toString ( )
	{
	return ( " " + this.value );
	}
}
