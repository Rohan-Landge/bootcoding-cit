import java.util.Scanner;

public class assiment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is negative");
        }
    }
}
