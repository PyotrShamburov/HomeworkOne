import java.util.Scanner;
public class TaskFive {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your numbers");
        int posCounter = 0;
        int negCounter = 0;
        for (int i = 0; i < 3 ;i++){
            int number = in.nextInt();
            if ( number > 0 ){
                ++posCounter;
            }else if ( number < 0 ) {
                ++negCounter;
            }else {}

        }
        System.out.println("Number of positive numbers: "+posCounter);
        System.out.println("Number of negative numbers: "+negCounter);


    }
}
//задача о определении количества положительных и отрицательных чисел из трех введенных.