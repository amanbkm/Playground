import java.util.Scanner;
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
    	batch(list,size);
  }
  	public static void batch(int list[],int n)
    {	
      	int sum1=0,sum2=0,k;
      	if(n%2==0)
           k=n/2;
      	else
           k=(n/2)+1;
      	for(int i=0;i<k;++i)
        {
          	sum1+=list[i];
        }
      	for(int j=(k-1);j<n;++j)
        {
          	sum2+=list[j];
        }
      	if(sum1==sum2)
        {
          System.out.println("Perfect Batch");
         
        }
      else
      {
        System.out.println("Not a Perfect Batch");
     

      }
      
    }
    
}