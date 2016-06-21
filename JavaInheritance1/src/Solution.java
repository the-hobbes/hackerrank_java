/**
  * https://www.hackerrank.com/challenges/java-inheritance-1
  * Your task is very simple. We provided the code above in the editor. Just add
  * a sing method in the Bird class and modify main function accordingly so that
  * it prints the following lines:
  *  I am walking
  *  I am flying
  *  I am singing
  */

  import java.io.*;
  import java.util.*;
  import java.text.*;
  import java.math.*;
  import java.util.regex.*;

  class Animal{
     void walk(){
        System.out.println("I am walking");
     }
  }

  class Bird extends Animal{
     void fly(){
        System.out.println("I am flying");
     }
     void sing(){
        System.out.println("I am singing");
     }
  }
  public class Solution{

     public static void main(String args[]){

       Bird bird = new Bird();
       bird.walk();
       bird.fly();
       bird.sing();
     }
  }
