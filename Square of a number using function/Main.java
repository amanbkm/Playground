import java.util.Scanner;
class Main
{
  	public static int square(int a)
    {
      return a*a;
    }
	public static void main (String[] args)
    {
	  Scanner n=new Scanner(System.in);
      int x=n.nextInt();
      System.out.println(square(x));
      } 
}