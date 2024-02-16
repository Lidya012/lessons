
package lesson04;

public class IncrementAndDecrement { public static void main(String[] args) {
    // I. Инкремент (++) / Декремент (--)
    int a = 1;
    // Инкремент (постфиксная форма)
    System.out.println(a++); // 1
    System.out.println(a); // 2

    a = 1;
    // Инкремент (префиксная форма)
    System.out.println(++a); // 2
    System.out.println(a); // 2

    a = 1;
    // Декремент (постфиксная форма)
    System.out.println(a--); // 1
    System.out.println(a); // 0

    a = 1;
    // Декремент (префиксная форма)
    System.out.println(--a); // 0
    System.out.println(a); // 0

    int b = 1;

    int result = b++ + ++b - b++ - b-- + ++b;
    //           1   +   3 - 3   - 4   +   4
    // выбор постфиксной / префиксной формы
    // будет играть роль при передаче в методы
    System.out.println(/* ++b или b++ */);

}

}
