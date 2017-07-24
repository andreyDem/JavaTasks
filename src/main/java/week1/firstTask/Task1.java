package week1.firstTask;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание №1
 * Написать функцию инициализации массива указанной длины
 * указанными символами. И вывести на экран.
 * Например:
 * Массив типа инт длиной 10 элементов заполнить нулями.
 * Массив типа String длиной 10 элементов заполнить буквой А.
 * Написать функцию которая создает массив типа int/Integer указанной длины заполненный случайными значениями.
 * Написать функцию которая будет принимать выше созданный массив данных и удалять(менять значение на 0) указанный элемент массива.
 * Например массив[3] = {1,5,3}
 * удалить элемент 0. (Все вычисления в циклах начинаются с 0).
 * результат:
 * массив[3] = {0,5,3}
 */


public class Task1 {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        int size = initializeSizeArray();
        int arrInt[] = createIntArray(size);
        String arrStr[] = createStrArray(size);
        int arrIntRand[] = createIntArrayRandom(size);

        System.out.println(Arrays.toString(deleteNumber(arrInt)));

//        System.out.println(Arrays.toString(arrInt));
//        System.out.println(Arrays.toString(arrStr));
//        System.out.println(Arrays.toString(arrIntRand));

    }

    private static int initializeSizeArray() {
        int size = 0;
        do {
            System.out.println("Enter size of your array");
             try {
                 size = Integer.parseInt(SCANNER.nextLine());
             }  catch (NumberFormatException e){
                 System.out.println("Enter integer number only!");
             }
        }  while (size<=0);
        return size;
    }

    private static int[] createIntArray(int size) {
        return new int[size];
    }
    private static String[] createStrArray(int size){
        String arr[] = new String[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= "A";
        }
        return arr;
    }

    private static int[] createIntArrayRandom(int size){
        int[] arr = createIntArray(size);
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(Integer.MAX_VALUE) - random.nextInt(Integer.MAX_VALUE);
        }
        return arr;
    }

    private static int[] deleteNumber(int[] arr){
        int number = 0;
        do {
            System.out.println("Enter position which you want to delete in array size = " + arr.length);
            try {
                number = Integer.parseInt(SCANNER.nextLine());
                arr[number] = 1;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Enter integer number in bounds of 0 to " + arr.length);

            } catch (NumberFormatException e){
                System.out.println("Enter integer number only!");
            }
        }  while (number<0 && number>arr.length-1);

        return arr;
    }


}
