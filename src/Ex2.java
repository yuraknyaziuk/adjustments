import java.util.Scanner;

public class Ex2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите а: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        if (a>b) {
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }


    }
}
