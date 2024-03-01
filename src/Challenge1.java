
import java.util.Scanner;
public class Challenge1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner();
        int i = scan.nextInt();
        double d  = scan.nextDouble();
        scan.nextLine()
        String s = scan.nextLine(); 
        scan.close();

        System.out.println("string"+s);
        System.out.println("double"+d);
        System.out.println("int"+i);
    }
}


