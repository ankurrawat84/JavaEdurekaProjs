
public class fabonicci {

	public static void main (String args[])
	{
		int currval;
		currval = 1;
		int preval = 0;
	for(int i = 0; i<=10; i++)
	{
		int tempval = currval + preval;
		preval = currval;
		currval = tempval;
		System.out.print(tempval+"\t");
		
	}	
		
	}
	
	//0 1 1 2 3 5 
	
}
