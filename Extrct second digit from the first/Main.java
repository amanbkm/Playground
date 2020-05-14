import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
	   Scanner n=new Scanner(System.in);
      int x=n.nextInt();
      int first = Integer.parseInt(Integer.toString(x).substring(1, 2));
      System.out.println(first);
    }
}
