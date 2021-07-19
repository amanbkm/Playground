import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
      	Scanner n=new Scanner(System.in);
      	int x=n.nextInt();
      	int arr[]=new int[x];
      	for(int i=0;i<x;++i)
        {
          	arr[i]=n.nextInt();
        }
      	sort(arr,x);
    }
  	public static void sort(int m[],int n)
    {	
      	int temp,zeros=0;
      	for(int j=0;j<n;++j)
        {
          	if(m[j]==0)
              zeros++;
          	else
              zeros+=0;
        }
      	for(int k=0;k<zeros;++k)
        {
          for(int i=0;i<(n-1);++i)
        {
          	if(m[i]==0)
            {
              temp=m[i];
              m[i]=m[i+1];
              m[i+1]=temp;
            }
        }
        }
      	for(int i=0;i<n;++i)
        {
          	System.out.print(m[i]);
          	System.out.print(" ");
        }
        }
        
      
    
}