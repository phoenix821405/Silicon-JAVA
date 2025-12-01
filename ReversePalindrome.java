import java.util.*;
class ReversePalindrome{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a string:");
  String str=sc.nextLine();
  String rev="";
  for(int i=str.length()-1;i>=0;i--) rev+=str.charAt(i);
  System.out.println("Reversed string:"+rev);
  if(str.equalsIgnoreCase(rev)) System.out.println("It is a palindrome.");
  else System.out.println("It is not a palindrome.");
 }
}