import java.util.Scanner;
public class inputexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        float n = sc.nextInt();
        System.out.println("Enter Second Number");
        float m = sc.nextInt();
        //Addition
        float sum=n+m;
        System.out.println("addition="+sum);
        //substraction
        float sub=n-m;
        System.out.println("substraction="+sub);
        //multiplication
        float mul = n*m;
        System.out.println("multiplicn="+mul);
        //division
        float div = n/m;
        System.out.println("division= "+div);
        //modulas
        float mod=n%m;
        System.out.println("modulas="+mod+".");
    }
}
