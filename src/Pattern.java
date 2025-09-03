import java.util.Scanner;
public class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int m = sc.nextInt();
        for(int i=1;i<=m;i++){
            System.out.println("*****");
        }
    }
}
