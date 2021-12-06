package home_work3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        int radius = in.nextInt();
        long area = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.printf("Площадь круга с радиусом %d равна %d \n", radius, area);
        int dice = (int) Math.ceil(Math.random() * 6); // Бросок кубика [1-6]
        double e = Math.E; //Константа Е
        double pi = Math.PI; // константа Пи
    }
}