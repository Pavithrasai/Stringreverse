import java.io.*;
import java.util.*;
import java.lang.*;
public class Sreverse
{
public static void main(String[]args)
{
String s=new String();
System.out.println("Enter the String want to reverse");
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
StringBuffer s1=new StringBuffer(s);
 String rev=s1.reverse().toString();
System.out.println(s1);
}
}
