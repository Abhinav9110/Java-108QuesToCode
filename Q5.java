//Q5.Arithmetic series.
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First term:");
        int a=sc.nextInt();
        System.out.println("Enter common difference:");
        int d=sc.nextInt();
        System.out.println("Enter number of terms");
        int n=sc.nextInt();
        System.out.print(a+" ");
        for(int i=1;i<=n;i++){
            a=a+d;
            System.out.print(a+" ");
        }
    }
}
