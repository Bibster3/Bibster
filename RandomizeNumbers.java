import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int startNumber = Math.min(n, m);
        int endNumber = Math.max(n, m);
        ArrayList<Integer> numsList = new ArrayList<Integer>();

        for (int i = startNumber, j = 0; i <= endNumber; i++, j++){
            numsList.add(i);
        }
        Collections.shuffle(numsList);
        System.out.print(numsList.toString().replaceAll("[\\[,\\]]+", ""));
    }
}