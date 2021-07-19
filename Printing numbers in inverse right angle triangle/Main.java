import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner n=new Scanner(System.in);
      	int x=n.nextInt();
      	for(int i=0;i<x;++i)
        {
          for(int j=x-i;j>=1;j--)
          {
            System.out.print(j);
          }
          System.out.print("\n");
        }
	}
}