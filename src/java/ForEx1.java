import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int m = sc.nextInt();
        System.out.println("Even Numbers");
        for (int i = 1;i<=m; i++){
            if(i%2 == 0){
                System.out.println(i+"");
            }
        }
        System.out.println("Odd Numbers");
        for(int i=1; i <=m ; i++){
            if(i%2 !=0){
                System.out.println(i+"");
            }
        }
    }
}
