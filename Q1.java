// Q1.Write a Java program to calculate the sum of natural numbers
// up to a given positive integer 'n'.
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of numbers :"+sum);
    }
}
