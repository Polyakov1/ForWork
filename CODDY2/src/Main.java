import java.util.Scanner;
//Сложность данного алгоритма можно оценить как O(1), то есть константную сложность.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество бенгальских огней:");
        int c1 = scanner.nextInt();

        System.out.println("Введите количество потухших огоньков, из которых можно сделать новые бенгальские огни:");
        int b1 = scanner.nextInt();

        // Рассчитываем количество огней, которые получится зажечь из доступных ресурсов
        int totalFires = c1 + b1 / 2;

        // Рассчитываем общую продолжительность горения огня в часах
        int totalHours = totalFires * 2;

        System.out.println("Общая продолжительность горения огня: " + totalHours + " часов");
    }
}