

public class LinkedList2 {

	private class Node
	{
		private String item;
		private Node link;
		
		public Node()
		{
			link = null;
			item = null;
		}
		
		public Node(String newItem, Node linkValue)
		{
			item = newItem;
			link = linkValue;
		}
		
	}
	
	private Node head;
	
	public LinkedList2()
	{
		head = null;
	}
	  
	public void addToStart(String itemName)
	{
		head = new Node(itemName,head);
		//System.out.println(head.getLink());
	}
	
	public boolean deleteHeadNode()
	{
		if(head != null)
		{
			head = head.link;
			return true;
		}
		else
			return false;
	}
	
	public int size()
	{
		int count = 0;
		Node position = head;
		while(position != null)
		{
			count++;
			position = position.link;
		}
		return count;
	}
	
	public boolean contains(String item)
	{
		return (find(item) != null);
	}
	
	private Node find(String target)
	{
		Node position = head;
		String itemAtPosition;
		while(position != null)
		{
			itemAtPosition = position.item;
			if(itemAtPosition.equals(target))
				return position;
			position = position.link;
		}
		return null;
	}
	
	public void outputList()
	{
		Node position = head;
		while(position != null)
		{
			System.out.println(position.item + " ");
			position = position.link;
		}
	}

	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public void clear()
	{
		head = null;
	}
}
