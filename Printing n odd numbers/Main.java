import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	     Scanner n=new Scanner(System.in);
      	int k=n.nextInt();
      	int j=1;
      	for(int i=1;i<=k;++i)
        {
          System.out.println(j);
          j=j+2;
        }
	}
}