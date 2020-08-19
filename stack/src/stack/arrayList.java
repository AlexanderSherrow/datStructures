package stack;

public class arrayList {
	int size = 10;
	int [] array = new int [size];
	int current = 0;
	
	public void add(int data)
	{
		if(current > size - 1)
		{
			size = size*2;
			int [] temp = array;
			array = new int [size];
			for(int i = 0; i < temp.length; i++)
			{
				array[i] = temp[i];
			}
			array[current] = data;
			current++;
		}
		else
		{
			array[current] = data;
			current++;
		}
	}
	
	public int get(int index)
	{
		int data = array[index];
		return data;
	}
	
	public void delete(int index)
	{
		for(int i = index; i < array.length-1; i++)
		{
			array[i] = array[i+1];
		}
		
		
	}

}
