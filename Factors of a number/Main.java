import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner n=new Scanner(System.in);
      	int k=n.nextInt();
      	for(int i=1;i<=k;++i)
        {
          	if(k%i==0)
              System.out.println(i);
        }
      
	}
}