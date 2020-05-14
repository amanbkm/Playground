import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
    	Scanner n=new Scanner(System.in);
      	int x=n.nextInt();
      	int count=1;
      	for(int i=1;i<=x;++i)
        {
          	for(int space=1;space<=(x-i);space++)
            {
              System.out.print(" ");
            }
          	for(int k=1;k<=i;k++)
            {
              System.out.print(count);
              System.out.print(" ");
              count++;
            }
          	System.out.println();
        }
    }    
}