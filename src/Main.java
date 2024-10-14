import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = calc();
        System.out.println(result);
    }
    public static int calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String expression = sc.nextLine().replaceAll("\\s+", "");
        String[] numbers = expression.split("[+\\-*/]");
        if (numbers.length != 2) {
            throw new RuntimeException("Invalid expression");
        }
        String first = numbers[0];
        String second = numbers[1];
        int a;
        int b;
        try{
            a = Integer.parseInt(first);
            b = Integer.parseInt(second);
        }
        catch (NumberFormatException e){
            throw new RuntimeException("Use only numbers");
        }
        if(a > 10 || b > 10){
            throw new ArithmeticException("The number should not be more than ten");
        }
        if(a < 0 || b < 0){
            throw new ArithmeticException("The number must be no less than zero");
        }
        else if(expression.contains("+")){
            return a + b;
        }
        else if(expression.contains("-")){
            return a - b;
        }
        else if(expression.contains("*")){
            return a * b;
        }
        else if(expression.contains("/")){
            return a / b;
        }
        throw new RuntimeException("Invalid expression");
    }
}