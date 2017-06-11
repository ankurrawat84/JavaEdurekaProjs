import java.util.Scanner;

public class voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner n = new Scanner(System.in);
		
		int i = n.nextInt();
		
		if (i >= 18)
		{
			System.out.println("Voting age");
		}
		else {
			System.out.println("No Voting age");
		}

	n.close();
		
	}

}
