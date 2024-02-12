package lesson03;

public class RelationalAndLogicalOperators {
    public static void main(String[] args) {
        // Операторы сравнения:
        // > больше / >= больше или равно
        // < меньше / <= меньше или равно
        // == равно / != не равно

        int books = 30, students = 22;
        boolean result = books < students; // false
        result = books == students; // false
        result = books != students; // true
        // books < students < 100

        // Логические операторы
        // && и - вернет true, если оба операнда true
        // || или - вернет true, если хотя бы один операнд - true
        // ! не - меняет булевое значение на противоположное
        int maxStudents = 100;
        // int books = 30, students = 22;
        result = students < maxStudents && students <= books;
        result = students > maxStudents || students > books;

        boolean isActive = true, isStable = false;
        result = !isActive; // false
        result = !(isActive && isStable); // true
        result = !(students < maxStudents && students <= books); // false
        // используется вместо сравнения с false

        // Тернарный оператор :?
        int startYear = 2024, endYear = 2029;
        // возвращает результат в зависимости от условия
        int validationResult = endYear > startYear ? endYear - startYear : -1; // 5

        int sum = 870;
        // Если сумма покупки (sum) больше 1000,
        // вернуть сумму покупки с учётом скидки в 10%,
        // в противном случае вернуть сумму покупки без учёта скидки.
        // Результат сохранить в переменную и вывести в консоль.

        /*
        int a = 23;
        double res = (double) a / 2;
        res = a / 2.0;
        double c = 0.4;
        c = .4;
        */




    }

}
