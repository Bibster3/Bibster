/**
 * Created by 123 on 3/23/2016.
 */
import java.util.Scanner;

public class HittheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int c = 0; c < 2; c++) {
            for (int i = 1; i <= 20; i++) {
                for (int j = 1; j <= 20; j++) {
                    if (c < 1){
                        if (i + j == n) {
                            System.out.printf("%d + %d = %d\n", i, j, n);
                        }
                    }
                    else {
                        if (j - i == n) {
                            System.out.printf("%d - %d = %d\n", j, i, n);
                        }
                    }
                }
            }
        }
    }
}