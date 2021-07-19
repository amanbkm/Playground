import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
      	Scanner n=new Scanner(System.in);
      	int size=n.nextInt();
      	int arr[]=new int [size];
      	for(int i=0;i<size;++i)
        {
          	arr[i]=n.nextInt();
        }
      	int val=n.nextInt();
      	subset_3(arr,size,val);
    }
  	public static void subset_3(int list[], int m,int n)
    {
      	int sum=0;
      	for(int i=0;i<m;++i)
        {
          	for(int j=i+1;j<m;++j)
            {
             	sum=list[i]+list[j];
              	if(sum==n)
                {
                  System.out.print(list[i]+", "+list[j]);
                  System.out.print("\n");
                }
            }
          	
        }
    }
  
}