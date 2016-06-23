/**
  * https://www.hackerrank.com/challenges/java-instanceof-keyword
  * Usage:
  * $ java Solution
  *   5 <---------- input
  *   Student <---- input
  *   Student <---- input
  *   Student <---- input
  *   Student <---- input
  *   Student <---- input
  *   5 0 0 <------ output
  */

import java.util.*;

class Person{}

class Student extends Person{}
class Rockstar extends Person{}
class Hacker extends Person{}


public class Solution
{
   static String count(ArrayList mylist)
   {
      int a=0,b=0,c=0;
      for(int i=0;i<mylist.size();i++)
      {
         Object element=mylist.get(i);
         if(element instanceof Student)
            a++;
         if(element instanceof Rockstar)
            b++;
         if(element instanceof Hacker)
            c++;
      }
      String ret= Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []argh)
   {
      ArrayList<Person> mylist=new ArrayList<Person>();
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}
