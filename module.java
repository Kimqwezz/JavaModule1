import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Загадайте число от 1 до 100.");
        sc.nextLine();
        
        int min = 0;
        int max = 100;
        int guess = -1;
        
        while (guess != 0) {
            guess = rand.nextInt(max - min + 1) + min;
            System.out.println("Ваше число " + guess + "?");
            System.out.println("Введите '1' если больше, введите '-1' если меньше, 0 если корректно, 99 для выхода из программы");
            int response = sc.nextInt();
            
            if (response == 1) {
                min = guess + 1;
            } else if (response == -1) {
                max = guess - 1;
            } else if (response == 0) {
                System.out.println("Я угадал ваше число за " + (max - min + 1) + " попыток!");
                break;
            } else if (response == 99) {
                System.out.println("Произвожу выход из программы");
                break;
            }else {
                System.out.println("Ошибка. Введите 1, -1, или 0.");
            }
        }
    }
}