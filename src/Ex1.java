import java.util.Scanner;
public class Ex1 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ФИО: ");
        String full_name = in.nextLine();

        System.out.print("Возраст: ");
        int age = in.nextInt();
        System.out.print("Вес: ");
        int weighte = in.nextInt();
        System.out.printf("Имя: %s \n", full_name );
        System.out.printf("Возраст: %d  ", age);
        System.out.printf("Вес: %d ", weighte);
        in.close();
    }
}
