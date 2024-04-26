//GCD of two number
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int n=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int m=sc.nextInt();
        while(n!=m){
            if(n>m){
                n=n-m;
            }
            else{
                m=m-n;
            }

        }
        System.out.println("GCD of two number is: "+m);

    }
}
