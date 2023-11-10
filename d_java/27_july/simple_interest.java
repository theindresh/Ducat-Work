import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Princpal Amount: " );
            long p = sc.nextLong();
            System.out.println("enter your rate of Intrest: ");
            long i = sc.nextLong();
            System.out.println("Enter your time: ");
            long t = sc.nextLong();
            long SI = (p*i*t)/100;
            System.out.println("So your total simple intrest is: = "+SI);
        }
        System.out.println("Thank You");
     }
}
