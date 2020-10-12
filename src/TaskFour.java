import java.util.Scanner;
public class TaskFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCounter = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println("Enter "+i+" number:");
            int number = in.nextInt();
            if (number > 0){
                ++numCounter;
            }

        }
        System.out.println("Number of positive numbers in a given set: "+numCounter);


    }
}
//задача про определение количества положительных чисел в наборе из 3х чисел