import java.util.Scanner;

public class P {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int i=scan.nextInt();
	System.out.println("rows");
	for(i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++) 
		{
			i=i+j;
			System.out.print(i);
		}
		System.out.println();
	}
}

}
