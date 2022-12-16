import java.util.*;
public class Test 
{
    public static void main(String[]args)throws Exception 
    {
    	Vector<Integer>[] anArray = (Vector<Integer>[]) new Vector[3];
    	Scanner sc = new Scanner (System.in);
    	for(int i = 0; i < anArray.length; i++)
    	   anArray[i] = new Vector<Integer>();
    	for(int i = 0; i < anArray.length; i++)
    	{
    		for(int j = 0; j < 3; j++)
        	{
    			Integer i1 = sc.nextInt();
    			anArray[i].add(i1);
        	}
    	}
    	anArray = setZeros(anArray);
    	for(int i = 0; i < anArray.length; i++)
    	{
    		Iterator<Integer> itr = anArray[i].iterator();
    		while(itr.hasNext()) 
    			System.out.print(itr.next());
    		System.out.println();
    	}	
    } 
    static Vector<Integer>[] setZeros(Vector<Integer>[] anArray1)
    {
    	Vector<Integer> row = new Vector<Integer>();
    	Vector<Integer> col = new Vector<Integer>();
    	for(int j = 0; j < 3; j++)
    	{
			row.add(1);
			col.add(1);
    	}
    	for(int i = 0; i < anArray1.length; i++)
    	{
    		for(int j = 0; j < 3; j++)
        	{
    			if(anArray1[i].get(j)==0)
    			{
    				row.setElementAt(0, i);
    				col.setElementAt(0, i);
    			}	
        	}
    	}
    	for(int i = 0; i < anArray1.length; i++)
    	{
    		for(int j = 0; j < 3; j++)
        	{
    			if(row.get(i)==0||col.get(j)==0)
    			{
    				anArray1[i].setElementAt(0, j);
    			}	
        	}
    	}
    	return anArray1;
    }
}

