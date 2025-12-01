import java.util.*;
class Substring{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter main string:");
  String str=sc.nextLine();
  System.out.print("Enter substring to replace:");
  String oldSub=sc.nextLine();
  System.out.print("Enter new substring:");
  String newSub=sc.nextLine();
  System.out.println(str.replace(oldSub,newSub));
 }
}