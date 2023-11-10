import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your table number: ");
        int a = sc.nextInt();
        System.out.println();
        for(int i= 1; i<=10; i++){
            int c = a*i;
            // System.out.println( );
            System.out.println(c);

        }
        
    }
}
