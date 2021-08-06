import java.util.*;
class Main
{
  public static int freq(ArrayList<String> list, String str)
  {
    int cnt = 0;
    for(int i=0;i<list.size();++i)
    {
      if(list.get(i).equals(str))
        cnt++;
    }
    return cnt;    
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    ArrayList<String> list = new ArrayList<>();
    for(int i=0;i<n;++i)
    {
      String str = in.next();
      list.add(str);
    }
    Collections.sort(list);
    TreeSet<String> set = new TreeSet<>();
    set.addAll(list);
    Iterator<String> j = set.iterator();
   	while (j.hasNext())
    {
      //System.out.println(j.next()); 
      String str = j.next();
     System.out.println(str+" "+freq(list,str));
    }
    
  }
}