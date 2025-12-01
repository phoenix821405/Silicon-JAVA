import java.util.*;
class Equal{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter first string:");
  String s1=sc.nextLine();
  System.out.print("Enter second string:");
  String s2=sc.nextLine();
  if(s1.equals(s2)) System.out.println("Strings are equal.");
  else System.out.println("Strings are not equal.");
 }
}