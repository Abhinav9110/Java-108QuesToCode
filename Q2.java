//check whether a string is Palindrome or not.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String a=sc.nextLine();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);

        }
        if(a.equals(rev))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }
}