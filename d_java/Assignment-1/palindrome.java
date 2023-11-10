import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int n,r,c,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number : ");
        n = sc.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }if(c == s){
            System.out.println("yes");
        }else System.out.println("no");
    }
    
}
