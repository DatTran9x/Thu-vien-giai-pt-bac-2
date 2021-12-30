import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static List<Double> run(double num1, double num2, double num3){
        List<Double> list= new ArrayList<>();
        double delta = num2*num2-4*-num1*num3;
        if(delta<0){
            return null;
        }
        if(delta==0){
            double result1 = -num2 / (2 * num1);
            double result2 = result1;
            list.add(result1);
            list.add(result2);
            return list;
        } else {
            double result1 = (-num2+Math.sqrt(delta))/(2*num1);
            double result2 = (-num2-Math.sqrt(delta))/(2*num1);
            list.add(result1);
            list.add(result2);
            return list;
        }
    }
    public static void main(String[] args) {
        // write your code here
    }
}
