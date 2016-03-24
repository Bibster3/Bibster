import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] strArr = str.split(" ");
        if (strArr.length % 2 != 0){
            System.out.println("Ivalid length");
        }
        else
        {
            for (int i = 0; i < strArr.length - 1; i+=2){
                int a = Integer.parseInt(strArr[i]);
                int b = Integer.parseInt(strArr[i + 1]);
                if ((a + b) % 2 != 0){
                    System.out.printf("%d, %d -> different\n", a, b);
                }
                else if(a % 2 != 0){
                    System.out.printf("%d, %d -> both are odd\n", a, b);
                }
                else {
                    System.out.printf("%d, %d -> both are even\n", a, b);
                }
            }
        }
    }
}