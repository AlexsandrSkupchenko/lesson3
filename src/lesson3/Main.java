package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuessNum();
    }
    public static void GuessNum() {
        Scanner sc = new Scanner(System.in);
        int x = (int) (Math.random() * 10);
        System.out.println("Было загадано число от 0 до 9. Попробуйте угадать. У Вас 3 попытки");
        System.out.println(x);
        for (int i = 1; i <= 4; i++) {
            if (i == 4) {
                System.out.println("Вы истратили попытки. Повторить игру еще раз? 1 – да / 0 – нет");
                int checkT = sc.nextInt();
                if (checkT == 0) {
                    System.out.println("Игра окончена");
                    break;
                } else {
                    GuessNum();
                }
            }
            System.out.println("Попытка № " + i + "\nВведите число от 0 до 9:");
            int a = sc.nextInt();
            if (a > x) {
                System.out.println("Загаданное число меньше вашего");
            }
            if (a < x) {
                System.out.println("Загаданное число больше вашего");
            }
            if (a == x) {
                System.out.println("Вы угадали! Повторить игру еще раз? 1 – да / 0 – нет");
                int checkT = sc.nextInt();
                if (checkT == 0) {
                System.out.println("Игра окончена");
                break;
                } else {
                    GuessNum();
                }
            }
        }
    }
}