//Дан массив целых чисел: int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44}.
// Найти максимальную сумму четырёх смежных целых чисел в массиве task02.
// Использовать алгоритм скользящего окна.

package task06;

public class WindowingMethod {
    public static void main(String[] args) {
        int [] task02 = {88, 34, 15, 55, 90, 4, 10,44};
        int maxSum= task02[0]+task02[1]+ task02[2]+ task02[3];
        for (int i = 4; i < task02.length ; i++) {
            int nowSum = task02[i - 3] + task02[i - 2] + task02[i - 1] + task02[i];
            if (nowSum >= maxSum) {
                maxSum = nowSum;
            }
        }
            System.out.println("Максимальная сумма четырех смежных элементов равна "+ maxSum);



    }
}
