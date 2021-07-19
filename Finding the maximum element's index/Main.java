import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections;
class Main
{
  public static void main(String args[])
  {
    	Scanner n=new Scanner(System.in);
    	int size=n.nextInt();
    	int list[]=new int[size];
    	for(int k=0;k<size;++k)
        {
          	list[k]=n.nextInt();
        }
    	int max=list[0];
    	int ind=0;
    	for(int i=0;i<size;++i)
        {
          	if(list[i]>max)
            {
              	max=list[i];
              	ind=i;
            }
              
        }
    	System.out.println(ind);
    	
  }
}