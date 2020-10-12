import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String sign = (number>0)?"positive number.":"negative number.";

        if (number == 0){
            System.out.print("It is a zero");
        }else if(number/10 == 0){
            System.out.print(" It is single - digit "+sign);
        }else if (number/100 == 0){
            System.out.print(" It is double - digit "+sign);
        } else if(number/1000==0){
            System.out.print(" It is triple - digit "+sign);
        }else{
            System.out.println(" It is a more than triple - digit "+sign);
        }

    }
}/*Задача про определение количества знаков в числе, положительность/отрицательность*/




