import java.sql.SQLOutput;
import java.util.Scanner;
public class TaskSix {
    public static void main(String[] args) {
        System.out.println("Enter your first number:");
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        System.out.println("Enter your second number:");
        int secondNumber = in.nextInt();
        if(firstNumber==secondNumber){
            System.out.println("Numbers are the same.");
        }else {
            String comparison = (firstNumber > secondNumber) ? (firstNumber + " is more") : (secondNumber + " is more");
            System.out.println(comparison);
        }

    }
}/*Задача о сравнении двух вводимых чисел*/
