import java.util.*;
class Initials{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter your full name:");
  String name=sc.nextLine();
  String words[]=name.split(" ");
  String ini="";
  for(String w:words){
   if(w.length()>0) ini+=Character.toUpperCase(w.charAt(0));
  }
  System.out.println(ini);
 }
}