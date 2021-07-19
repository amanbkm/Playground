import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
		Scanner n=new Scanner(System.in);
      int x=n.nextInt();
      int sum=0;
      while(x>0)
      {
        	sum+=x%10;
        	x=x/10;
      }
      System.out.println(sum);
	}
}