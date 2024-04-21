package com.lidiya.project.lesson21.lessontask;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StudentTask {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        //  1. Разделить учеников на две группы: мальчиков и девочек.
        //     Результат: Map<Student.Gender, List<Student>>
        Map<Student.Gender, List<Student>> task0100 = students.stream()
                .collect(Collectors.groupingBy(student -> student.getGender()));

        Map<Student.Gender, ArrayList<Student>> task0101 = students.stream()
                .collect(Collectors.groupingBy(student -> student.getGender(),
                        Collectors.toCollection(ArrayList::new)));

        // 2. Найти средний возраст учеников
        ToIntFunction<Student> studentAge = student ->
                LocalDate.now().getYear() - student.getBirth().getYear();
        double avgAgeStream = students.stream()
                // .filter()
                .mapToInt(studentAge)
                .average()
                .orElse(-1);

        double avgAgeCollector = students.stream()
                // .filter()                       // ToDoubleFunction
                .collect(Collectors.averagingDouble(student ->
                        LocalDate.now().getYear() - student.getBirth().getYear()));

        //  3. Найти самого младшего ученика
        Supplier<Student> defaultStudentGenerator = ()->{
            // генерация ученика занимает 20 секунд
            return  new Student(-1,
                    null, null, LocalDate.now());
        };
        Student youngestStudent = students.stream()
                .max((st1, st2) -> st1.getBirth().getYear() - st2.getBirth().getYear())
                // Optional<Student>
                .orElseGet(defaultStudentGenerator);
        // .orElse(defaultStudentGenerator.get());
        System.out.println(youngestStudent);

        // 4. Собрать идентификаторы учеников в группы по году рождения,
        //    результат - Map<ГодРождения, List<Integer>>
        Map<Integer, List<Integer>> idsByYear = students.stream()
                .collect(Collectors.groupingBy(
                        st -> st.getBirth().getYear(),
                        Collectors.mapping(st -> st.getNumber(),
                                Collectors.toList())
                ));

        // 5. Получить список учеников, отсортированный
        //    по полу ученика,
        //    по дате рождения (если пол одинаковый),
        //    по имени (в обратном порядке) (если пол и дата рождения одинаковые)
        Comparator<Student> byGender =
                (st1, st2) -> st1.getGender().ordinal() - st2.getGender().ordinal();
        Comparator<Student> byBirth = (st1, st2) -> st1.getBirth().compareTo(st2.getBirth());
        Comparator<Student> byName = (st1, st2) -> st1.getName().compareTo(st1.getName());
        Comparator<Student> byNameR = byName.reversed();
        Comparator<Student> comparator = byGender
                .thenComparing(byBirth)
                .thenComparing(byNameR);
        Collections.sort(students, comparator);

    }
}
