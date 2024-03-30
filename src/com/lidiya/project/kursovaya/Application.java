package com.lidiya.project.kursovaya;

import java.time.LocalDate;
import java.time.LocalTime;


import static com.lidiya.project.kursovaya.TypeOfSubscription.*;

public class Application {
    public static void main(String[] args) {
        Owner owner01 = new Owner("Александр", "Захарьев", 1990);
        Owner owner02 = new Owner("Екатерина", "Иванова", 1974);
        Owner owner03 = new Owner("Павел", "Виноградов", 1985);
        Owner owner04 = new Owner("Анна", "Виноградова", 1983);
        Owner owner05 = new Owner("Елизавета", "Перова", 1979);
        Owner owner06 = new Owner("Дмитрий", "Шариков", 1990);
        Owner owner07 = new Owner("Владислав", "Круглов", 2001);
        Owner owner08 = new Owner("Александр", "Игнатьев", 1995);
        Owner owner09 = new Owner("Ксения", "Головина", 1971);
        Owner owner10 = new Owner("Андрей", "Головин", 19976);
        Owner owner11 = new Owner("Иван", "Захарьев", 1983);
        Owner owner12 = new Owner("Полина", "Зайцева", 1989);
        Owner owner13 = new Owner("Екатерина", "Зайцева", 1993);
        Owner owner14 = new Owner("Анастасия ", "Прокофьева", 1993);
        Owner owner15 = new Owner("Илья", "Петров", 1990);
        Owner owner16 = new Owner("Александр", "Смирнов", 1999);
        Owner owner17 = new Owner("Ирина", "Петрова", 1989);
        Owner owner18 = new Owner("Константин", "Соколв", 1986);
        Owner owner19 = new Owner("Алексей", "Михайлов", 1981);
        Owner owner20 = new Owner("Александр", "Васильев", 1990);

        LocalDate current = LocalDate.now();

        Subscription subscriprion01 = new Subscription
                (1, owner01, ONE_TIME,current, LocalDate.of(2024,6,18));
        Subscription subscription02 = new Subscription
                (2, owner02 ,DAY_TIME, current, LocalDate.of(2025, 3, 10));
        Subscription subscription03 = new Subscription
                (3, owner03, ONE_TIME, current, LocalDate.of(2025, 2, 21));
        Subscription subscription04 = new Subscription
                (4, owner04, DAY_TIME, current, LocalDate.of(2025, 3, 10));
        Subscription subscription05 = new Subscription
                (5, owner05, FULL_TIME, current, LocalDate.of(2025, 4, 30));
        Subscription subscription06 = new Subscription
                (6,owner06, FULL_TIME, current, LocalDate.of(2025, 6, 2));
        Subscription subscription07 = new Subscription
                (7, owner07, FULL_TIME, current, LocalDate.of(2025, 1, 9));
        Subscription subscription08 = new Subscription
                (8, owner08, FULL_TIME, current, LocalDate.of(2023, 2, 2));
        Subscription subscription09 = new Subscription
                (9, owner09, ONE_TIME, current, LocalDate.of(2024,5,6));
        Subscription subscription10 = new Subscription
                (10,  owner10, FULL_TIME, current, LocalDate.of(2025, 8, 31));
         Subscription subscription11 = new Subscription
                 (11, owner11,DAY_TIME, current, LocalDate.of(2025,12,3));
         Subscription subscription12 = new Subscription
                (12, owner12, FULL_TIME, current, LocalDate.of(2025, 10, 11));
        Subscription subscription13 = new Subscription
                (13, owner13, FULL_TIME, current, LocalDate.of(2024, 4, 1));
        Subscription subscription14 = new Subscription
                (14,owner14, FULL_TIME, current, LocalDate.of(2024, 6, 10));
        Subscription subscription15 = new Subscription
                (15, owner15, FULL_TIME, current, LocalDate.of(2024, 12, 29));
        Subscription subscription16 = new Subscription
                (16, owner16, FULL_TIME, current, LocalDate.of(2025, 3, 25));
        Subscription subscription17 = new Subscription
                (17, owner17, ONE_TIME, current, LocalDate.of(2025,10,15));
        Subscription subscription18 = new Subscription
                (18, owner18, FULL_TIME, current, LocalDate.of(2025, 11, 11));
        Subscription subscription19 = new Subscription
                (19, owner19, FULL_TIME, current, LocalDate.of(2024, 7, 5));
        Subscription subscription20 = new Subscription
                (20, owner20, FULL_TIME, current, LocalDate.of(2025, 5, 9));

        Fitness zone = new Fitness();
        zone.addToDesiredZone("групповые занятия", subscriprion01);
        zone.addToDesiredZone("бассейн", subscription02);
        zone.addToDesiredZone("бассейн", subscription03);
        zone.addToDesiredZone("бассейн", subscription04);
        zone.addToDesiredZone("тренажерный зал", subscription05);
        zone.addToDesiredZone("тренажерный зал", subscription06);
        zone.addToDesiredZone("групповые занятия", subscription07);
        zone.addToDesiredZone("тренажерный зал", subscription08);
        zone.addToDesiredZone("тренажерный зал", subscription09);
        zone.addToDesiredZone("тренажерный зал", subscription10);
        zone.addToDesiredZone("групповые занятия", subscription11);
        zone.addToDesiredZone("тгрупповые занятия", subscription12);
        zone.addToDesiredZone("бассейн", subscription13);
        zone.addToDesiredZone("бассейн", subscription14);
        zone.addToDesiredZone("групповые занятия", subscription15);
        zone.addToDesiredZone("тренажерный зал", subscription16);
        zone.addToDesiredZone("тренажерный зал", subscription17);
        zone.addToDesiredZone("групповые занятия", subscription18);
        zone.addToDesiredZone("тренажерный зал", subscription19);
        zone.addToDesiredZone("бассейн", subscription20);

        zone.printGroups();

        Fitness.initializeZone(zone.getGymZone());
        Fitness.initializeZone(zone.getPoolZone());
        Fitness.initializeZone(zone.getGroupClasses());
        zone.printGroups();
    }
}
