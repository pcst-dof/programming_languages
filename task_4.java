import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вычисление площади треугольника по формуле Герона.");
        System.out.println("Вам нужно ввести длины трёх сторон треугольника (a, b, c).");
        System.out.println();

        System.out.print("Введите длину стороны a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите длину стороны b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите длину стороны c: ");
        double c = scanner.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ошибка: все стороны треугольника должны быть положительными числами!");
            System.exit(1); 
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ошибка: треугольник с такими сторонами не существует!");
            System.out.println("Сумма любых двух сторон должна быть больше третьей.");
            System.exit(1); 
        }

        double p = (a + b + c) / 2; 
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c)); 

        System.out.println();
        System.out.println("Стороны треугольника: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Полупериметр p = " + p);
        System.out.println("Площадь треугольника S = " + s);

        scanner.close();
    }
}
