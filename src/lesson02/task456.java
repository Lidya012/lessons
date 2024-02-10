/*Поменять значения 2х переменных местами, используя арифметические операторы.
 Результат вывести в консоль.
 */

package lesson02;

public class task456 {
    public static void main(String[] args) {
        int i = 68, l =45;
        i =i-23;
        l=l+20+3;
        System.out.println("i="+i+"  l="+l);
    }
}


/*Ответить на вопросы:
Какой тип у doubleResult01 и почему?
double, так как мы сделали явное присвоение и var  сам определяет тип как double,
так как при делении 3 на 2 мы получаем остаток
Чему равно значение doubleResult01 и почему?
Результат равен 1.0 так как тип double
int num01 = 3; int num02 = 2; int result = num01 / num02;
 var doubleResult01 = (double) (num01 / num02);
 */