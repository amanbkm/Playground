import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    Scanner n=new Scanner(System.in);
      	int x=n.nextInt();
      	int y=n.nextInt();
      	int z=n.nextInt();
      	System.out.println(greatest(x,y,z));
	}
  	public static int greatest(int x, int y, int z)
    {
      if(x>y && x>z)
        return x;
      else if(y>x && y>z)
        return y;
      else
        return z;
    }
}