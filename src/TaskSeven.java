import java.util.Scanner;
public class TaskSeven {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество программистов: ");
        int numOfProg = in.nextInt();
        System.out.print(numOfProg);
        if ( numOfProg < 0){
            System.out.print(" - Неверные данные, количество программистов не может быть отрицательным числом!");
        }else if ( (numOfProg == 1) || (numOfProg%10 == 1)){
            System.out.println(" Программист.");
        }else if ( (numOfProg >= 2 && numOfProg <= 4) || (numOfProg%10 == 2) || (numOfProg%10 == 3) ||(numOfProg%10 == 4)){
            System.out.println(" Программиста.");
        }else {
            System.out.println(" Программистов. ");
        }

        }

    }

//программа по выведению правильного окончания при введении количества программистов