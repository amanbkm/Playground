import java.util.Scanner;
import java.lang.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String words[]=new String[3];
for(int j=0;j<words.length;j++)
{
words[j]=sc.next();
{
if(j==0)
{
char a[]=words[j].toCharArray() ;
for(int i=0;i<a.length;i++)
{
if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
a[i]='$';
} for(int i=0;i<a.length;i++)
{
System.out.print(a[i]);
}
}
if(j==1)
{
char a[]=words[j].toCharArray();
for(int i=0;i<a.length;i++)
{
if(!(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'))
a[i]='#';
} for(int i=0;i<a.length;i++)
{
System.out.print(a[i]);
}

}
if(j==2)
{
char a[]=words[j].toCharArray();
for(int i=0;i<a.length;i++)
{
if(Character.isLetter(a[i])&&Character.isLowerCase(a[i]))
a[i]=Character.toUpperCase(a[i]);
}
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]);
}
}
}
}
}
}