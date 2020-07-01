import java.util.Scanner;

 public class Ex4 {
       public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Имя: ");
        String name = in.next();
        System.out.print("Возраст: ");
        int age = in.nextInt();
        short a=20;
        short b=40;
boolean f= age>=20;
boolean g= age<=40;

        if (age<a) System.out.println("Студент");

        if ( f && g ) System.out.println("Работяга");

        if (age>b) System.out.println("Пенсионер");


        }

}
