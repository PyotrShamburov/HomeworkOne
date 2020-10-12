import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if( n == 0 ){
            n = 10;
            System.out.println(n);
        } else {
            int m = ( n > 0)? (++n):(n -= 2);
            System.out.println(m);
        }

    }
}
//Задача о определении о целом числе( если + то ++, если 0, то замена на 10, если "-" то вычесть 2).