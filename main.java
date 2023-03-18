import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessNumber();      //Вызов функции
    }

    public static void guessNumber() {
        Random rand = new Random(); 
        int numberToGuess = rand.nextInt(100) + 1;      //Рандомное число
        int numberOfTries = 0;                          //Счетчик числа попыток
        Scanner input = new Scanner(System.in);
        int guess;

        System.out.println("Угадайте число от 1 до 100");
        do {
            guess = input.nextInt();                    //Входной инт от пользователя
            numberOfTries++;                            //Увеличение числа попыток на 1

            if (guess < numberToGuess) {                //Если слишком мало
                System.out.println("Слишком мало:");
            } else if (guess > numberToGuess) {         //Если слишком много
                System.out.println("Слишком много:");
            }
        } while (guess != numberToGuess);

        System.out.println("Вы угадали! Ваше число " + numberOfTries + " попыток.");
    }
}