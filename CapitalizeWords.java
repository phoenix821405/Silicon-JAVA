import java.util.*;
class CapitalizeWords{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a sentence:");
  String s=sc.nextLine();
  String words[]=s.split(" ");
  String res="";
  for(String w:words){
   if(w.length()>0) res+=Character.toUpperCase(w.charAt(0))+w.substring(1)+" ";
  }
  System.out.println(res.trim());
 }
}
