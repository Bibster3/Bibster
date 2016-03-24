/**
 * Created by 123 on 3/23/2016.
 */
import java.util.Scanner;

public class RectangleArea {

        public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();


        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        System.out.println("The Rectangle's area is equal to " + a * b);
    }
}
