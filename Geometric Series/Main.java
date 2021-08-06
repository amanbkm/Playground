import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int val1,val2;
    ArrayList<Integer> List = new ArrayList<>();
    for(int i=0;i<N;++i)
    {
     	val1 = (int) Math.pow(2,i);
      	List.add(val1);
      	val2 = (int) Math.pow(3,i);
      	List.add(val2);      
    }
    System.out.println(List.get(N-1));
  }
}