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
      	int ele1=n.nextInt();
      	int ele2=n.nextInt();
      	int index_1=-1;
      	int index_2=-1;
      	for(int i=0;i<size;++i)
        {
          if(arr[i]==ele1)
            index_1=i;
          else if(arr[i]==ele2)
            index_2=i;
          else
          {
            index_1+=0;
            index_2+=0;
          }
        }
      	if(index_1!=-1 || index_2!=-1)
        {
          System.out.println(index_1);
          System.out.println(index_2);
        }
      	
      	else
          System.out.println("-1");
          
      	
    }
  
}