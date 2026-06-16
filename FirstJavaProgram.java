import java.util.Scanner;

public class FirstJavaProgram{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        //input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);

        //datatypes
        int b = 20;
        String name = "Roshan";
        float percentage = 78.82f;
        double percentile = 23.324;
        boolean isPass = true;
        char grade = 'B';
        long largeInt = 2343113344L;

        //typecasting
        float num = sc.nextFloat();
        System.out.println(num); // if int inputed then widening typecasting
    }
}