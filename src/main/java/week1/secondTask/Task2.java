package week1.secondTask;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Задание №2
 * Напишите программу которая принимает строку и выдает различные данные о ней, такие как:
 * 1) Количество букв/символов в слове (с учетом без учета пробела )
 * 2) Длину текста
 * 3) Количество слов в тексте
 * 4) Количество слов в предложении и количество предложений если их более 1. Окончанием предложения считать символ “точка”.
 * 5) Самое длинное слово в тексте
 * 6) Самое короткое слово в тексте( не менее 3 символов)
 * 7) Проверка текста на наличие палиндромов(РОТОР, КАЗАК и тд) - выводить слово если есть, если нет указывать.
 * Пример:
 * Ввод:
 * Шел казак куда-то вдаль. На груди была медаль.
 * <p>
 * Вывод:
 * Длина текста: 46 символов, 37 без учета пробелов.
 * Количество слов: 8
 * Количество предложений: 2
 * Количество слов в предложении #1:
 * 4 слова.
 * Количество слов в предложении #2:
 * 4 слова.
 * Самое длинное слово: куда-то
 * Самое короткое слово: Шел
 * Текст содержит *количество* палиндром(ов):....
 * Пример:
 * Текст содержит 1 палиндром(ов) : КАЗАК
 */

public class Task2 {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String str = enterString();
//        String str = "Шел казак куда-то вдаль. На груди была медаль.";
        checkString(str);

    }

    private static void checkString(String str) {
        numberChars(str);
        numberWords(str);
        numberSent(str);
        wordsInSent(str);
        largeAndMin(str);
        palindrome(str);
    }

    private static String enterString() {
        System.out.println("Enter string");
        return SCANNER.nextLine();
    }

    private static void numberChars(String str) {
        System.out.print("Длина текста: " + str.length() + " символов, ");
        System.out.println((str.replace(" ", "")).replace(".", "").length()
                + " без учета пробелов.");
    }

    private static void numberWords(String str) {
        System.out.print("Количество слов: ");
        String newStr[] = str.split(" ");
        System.out.println(newStr.length);
    }

    private static void numberSent(String str) {
        System.out.println("Количество предложений: " + (str.length() - str.replace(".", "").length()));
    }

    private static void wordsInSent(String str) {
        String string[] = str.split(" ");
        int words = 0;
        int sent = 0;
        for (int i = 0; i < string.length; i++) {
            if (!string[i].contains(".")) {
                words++;
            } else {
                sent++;
                words++;
                System.out.println("Количество слов в предложении #" + sent + ": ");
                System.out.println(words + " слова.");
                words = 0;
            }
        }
    }

    private static void largeAndMin(String str) {
        String string[] = str.replace(".", "").split(" ");
        String large = string[0];
        String min = "";
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() > 2) {
                min = string[i];
                break;
            }
        }
        for (int i = 1; i < string.length; i++) {
            if (large.length() < string[i].length()) {
                large = string[i];
            }
            if (min.length() > string[i].length() && string[i].length() != 2) {
                min = string[i];
            }
        }
        System.out.println("Самое длинное слово: " + large);
        System.out.println("Самое короткое слово: " + min);
    }

    private static void palindrome(String str) {
        String string[] = str.replace(".", "").split(" ");
        int countPol = 0;
        String polin = "";
        for (String s : string) {
            StringBuffer sb = new StringBuffer(s.toUpperCase());
            if (s.toUpperCase().equals(sb.reverse().toString())) {
                countPol++;
                polin = polin + s.toUpperCase() + " ";
            }
        }
        System.out.println("Текст содержит " + countPol + " палиндром(ов) : " + polin);
    }

}
