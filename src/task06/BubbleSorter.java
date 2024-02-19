//Отсортировать массив пузырьковой сортировкой

package task06;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorter {
    public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве:");
        int n = scanner.nextInt();
        int  []array = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("Введите элемент "+(i+1)+ ":");
            array[i]= scanner.nextInt();
        }
        System.out.println("Исходный массив" + Arrays.toString(array));
        for (int i = 0; i < n-1; i++) {
            //внешний цикл перебирает каждый элемент массива
            for (int j = 0; j < n - 1 - i; j++) {
                //внутренний цикл перебирает с первого до предпоследнего элемента
                if (array[j + 1] < array[j]) {
                    //если текущий элемент больше следующего, то они меняются местами
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
                System.out.println("Отсортированный массив" + Arrays.toString(array));

            }

        }
