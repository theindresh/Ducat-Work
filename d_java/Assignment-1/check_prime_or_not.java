import java.util.Scanner;

class check_prime_or_not {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(n+" is prime number ");
        } else {
            System.out.println(n+"  not prime number");
        }

    }
}