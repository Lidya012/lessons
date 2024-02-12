// Дана переменная currentScoreValue - количество очков,
// набранное пользователем.
// если пользователь набрал 90 и более очков, он занял первое место,
// если пользователь набрал от 80 до 89, он занял второе место,
// если пользователь набрал меньше 80, он не занял никакого места.
// Вывести в консоль, какое место занял пользователь.

package lesson03.task3;

public class ElseIf2 {
    public static void main(String[] args) {
        int currentScoreValue = 69;

        if ( currentScoreValue >= 90) {
            System.out.println("Пользователь набрал 1 место");
        }
        else if (currentScoreValue >= 80 && currentScoreValue <= 89) {
            System.out.println("Пользователь набрал 2 место");
        }
        else System.out.println("Пользователь набрал 3 место");
    }
        }

