import java.util.Scanner;

public class area_Of_Circle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("hello Indresh");
            System.out.println("Please Enter Your value: ");
            double r = sc.nextDouble();
            double area = (r*r)*3.14;
            System.out.println("your area of circle is: "+area);
        }

    }
}
