import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.println("Enter the side A of triangle:");
        int a = in.nextInt();
        System.out.println("Enter the side B of triangle:");
        int b = in.nextInt();
        System.out.println("Enter the side C of triangle:");
        int c = in.nextInt();
        if (a<=0 || b<=0 || c<=0){
            System.out.println("Wrong data! Check your entered variables!");
        }else {
        String conditionOfExistence = ( (a+b)>c && (b+c)>a && (a+c)>b )?"Triangle exists!":"Triangle does not exist";
            System.out.println(conditionOfExistence);
        }
        }

    }

/*задача про существование треугольника*/