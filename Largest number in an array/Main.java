import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
      	int size=n.nextInt();
      	int arr[]= new int [size];
      	for(int i=0;i<size;++i)
        {
          	arr[i]=n.nextInt();
        }
      	int max=arr[0];
      	for(int i=1;i<size;++i)
        {
          	if(arr[i]>max)
              max=arr[i];
          	else
              max=max+0;
        }
      	System.out.println(max);
    }
}