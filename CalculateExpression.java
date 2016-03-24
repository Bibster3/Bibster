/**
 * Created by 123 on 3/23/2016.
 */
public class CalculateExpression {
    public static void printCalculatedExpression(float a, float b, float c) {
        double formulaeOne = Math.pow(((Math.pow(a, 2f) + Math.pow(b, 2f)) / (Math.pow(a, 2f) - Math.pow(b, 2f))), ((a+b+c) / Math.sqrt(c)));
        double formulaeTwo = Math.pow(((Math.pow(a, 2f) + Math.pow(b, 2f)) - Math.pow(c, 3f)), (a - b));
        double averageNumbers = (a + b + c) / 3f;
        double averageFormulae = (formulaeOne + formulaeTwo) / 2;
        double difference = Math.abs(averageNumbers - averageFormulae);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formulaeOne, formulaeTwo, difference);
    }
}
