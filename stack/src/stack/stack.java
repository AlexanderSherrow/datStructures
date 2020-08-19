package stack;

public class stack {
	
	int top = -1;
	int [] stack = new int[5];
	
	public void push (int obj)
	{
		top++;
		stack[top] = obj;
	}
	
	public int pop ()
	{
		int obj = stack[top];
		top--;
		return obj;
	}
	
	
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		return false;
	}
	
	public int peek()
	{
		return stack[top];
	}
	
	

}
