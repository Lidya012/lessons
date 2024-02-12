package lesson03.task3;

public class TenarnyOperator {
    public static void main(String[] args) {
        int sum =870;
       sum = sum > 1000 ? 870- (sum/100*10) : 870;
        System.out.println(sum);
    }
}
