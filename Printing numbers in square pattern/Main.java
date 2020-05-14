import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner in=new Scanner(System.in);
          int x=in.nextInt();
      	for(int i=1;i<=x;++i)
        {
          for(int j=1;j<=x;++j)
          {
            	System.out.print(i);
          }
          System.out.print("\n");
        }
	}
}