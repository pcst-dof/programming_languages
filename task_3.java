import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Первое число: ");
        double a = scanner.nextDouble();
        
        System.out.print("Второе число: ");
        double b = scanner.nextDouble();

        if (a > b) {
            System.out.println("Большее число: " + a);
        } else {
            System.out.println("Большее число: " + b);
        
        scanner.close();
        }
    }
}