import java.util.Scanner;
class Main{
	public static void main (String[] args) 
    {
		Scanner n=new Scanner(System.in);
      	int n1=n.nextInt();
      	int x=n1/100;
      	n1=n1-(x*100);
      	int y=n1%10;
      	System.out.println(x+y);
	}
}