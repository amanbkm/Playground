import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	     Scanner n=new Scanner(System.in);
      int k=n.nextInt();
      int sum=0;
      for(int i=1;i<=k;++i)
      {
        sum+=i;
      }
      System.out.println(sum);
	}
}