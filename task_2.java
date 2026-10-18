import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        
        double y = -16 * Math.pow(x, 5) + Math.pow(x, 4) - 23 * x - 55;
        System.out.println("y = " + y);
        
        scanner.close();
    }
}
