import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите а: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.print("Введите c: ");
        int c = in.nextInt();
        if (a==b||b==c||a==c) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
