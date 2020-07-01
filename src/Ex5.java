
import  java.lang.Math;

public class Ex5 {
    public static void main(String[]args){
        double [] num = new double [6] ;
       int i;
        double min, max, mean;
        for (i=0; i<6; i++){
            num[i] = Math.random();
        }
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        min=max=num[0];
        for (i=0; i<6; i++){

            if (num[i]<min) min=num[i];
            if (num[i]>max) max= num[i];
        }
        mean = (min+max)/2;
        System.out.println("min and max: "+ min + "" + max);
        System.out.println("mean: " + mean);
       }






}
