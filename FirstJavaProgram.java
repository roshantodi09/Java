import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        sc.close();

        //datatypes
        int b = 20;
        String name = "Roshan";
        float percentage = 78.82f;
        double percentile = 23.324;
        boolean isPass = true;
        char grade = 'B';
        long largeInt = 2343113344L;
        
    }
}