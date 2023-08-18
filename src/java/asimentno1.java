import java.util.Scanner;

public class asimentno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int n = sc.nextInt();
        System.out.println("Enter Second Number");
        int m = sc.nextInt();
        if (n == m) {
            System.out.println("number is equal");
        } else {
            System.out.println("Number are different");
        }
    }
}
