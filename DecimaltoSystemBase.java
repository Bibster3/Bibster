/**
 * Created by 123 on 3/23/2016.
 */
import java.util.Scanner;
public class DecimaltoSystemBase {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to convert to 7 base: ");
        Scanner scanner = new Scanner(System.in);
        Integer numberToConvert = scanner.nextInt();
        System.out.print(Integer.toString(numberToConvert, 7));
    }
}