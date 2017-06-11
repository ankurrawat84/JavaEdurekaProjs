import java.util.*;


public class Array1 {

	public static void display(String[][] a)
	{
			for (int x=0;x<=2;x++)
			{
			  for (int y=0;y<=2;y++)
				{
					System.out.print(a[x][y]+"\t");
				}
				System.out.print("\n");
			}
		}
	
	public static void main(String[] args) {
		String a[][] = new String[3][3];
		Scanner n = new Scanner(System.in);
		for (int i = 0; i <=2; i++)
		{
			a[i][0] = Integer.toString(i);
			System.out.println("Enter name");
			a[i][1] = n.next();
			System.out.println("Enter Salary");
			a[i][2] = Integer.toString(n.nextInt());
			
		}
		
		display(a);

	}
}
