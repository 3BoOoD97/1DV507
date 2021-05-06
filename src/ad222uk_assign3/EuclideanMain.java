package ad222uk_assign3;

import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.security.spec.ECField;
public class EuclideanMain {
    public static void main(String[] args) {
Scanner scan = new Scanner (System.in); 
System.out.println("Enter the first number");
int t=scan.nextInt();
System.out.println("Enter the socend number");
int t1=scan.nextInt();

System.out.println("The GCD is " + EuclideanMain.gcd(t, t1));

    }
    
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}	