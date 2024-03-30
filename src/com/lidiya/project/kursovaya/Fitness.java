package com.lidiya.project.kursovaya;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.time.LocalDateTime;

public class Fitness {
    private final String Gym_Zone = "тренажерный зал";
    private final String Pool_Zone = "бассейн";
    private final String Group_Classes = "групповые занятия";
    private final int ZONE_SIZE = 20;
    private Subscription[] gymZone = new Subscription[ZONE_SIZE];
    private Subscription[] poolZone = new Subscription[ZONE_SIZE];
    private Subscription[] groupClasses = new Subscription[ZONE_SIZE];
    private boolean isGym;
    private boolean isPool;
    private boolean isGroup;
    private final LocalDate CURR_DATE = LocalDate.now();
    private final LocalTime CURR_TIME = LocalTime.now();
    private final LocalDateTime CURR_DATE_TIME = LocalDateTime.now();
    private final static LocalDate MIN_DATE = LocalDate.MIN;

    public Subscription[] getGymZone() {
        return gymZone;
    }

    public Subscription[] getPoolZone() {
        return poolZone;
    }

    public Subscription[] getGroupClasses() {
        return groupClasses;
    }

    private void checkIn(Subscription subscription, Subscription[] zone) {
        String typeOfZone = null;
        String zoneIsFull = null;
        if (zone == null) {
            System.out.println("Группа не может быть пустой");
            return;
        }
        if (subscription.typeOfSubscription != TypeOfSubscription.FULL_TIME && subscription.typeOfSubscription != TypeOfSubscription.DAY_TIME
                && isGroup) {
            isGroup = false;
            System.out.println("Нет доступа к групповым занятиям");
            return;
        } else if (subscription.typeOfSubscription != TypeOfSubscription.ONE_TIME && subscription.typeOfSubscription != TypeOfSubscription.FULL_TIME
                && isPool) {
            isPool = false;
            System.out.println("Нет доступа к бассейну");
            return;
        } else if (subscription.typeOfSubscription != TypeOfSubscription.FULL_TIME && subscription.typeOfSubscription != TypeOfSubscription.DAY_TIME
                && subscription.typeOfSubscription != TypeOfSubscription.ONE_TIME && isGym) {
            isGym = false;
            System.out.println("Нет доступа к тренажерному залу");
            return;
        }

        if (isGym) {
            typeOfZone = Gym_Zone;

        } else if (isPool) {
            typeOfZone = Pool_Zone;

        } else if (isGroup) {
            typeOfZone = Group_Classes;
            ;
        }

        boolean isFull = false;
        for (int i = 0; i < zone.length; i++) {
            isFull = true;
            if (zone[i] == null) {
                zone[i] = subscription;
                isFull = false;
                System.out.println(subscription.owner.getSurname() +
                        " " + subscription.owner.getName() + " " + typeOfZone);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy H:mm:ss");
                String text = dtf.format(CURR_DATE_TIME);
                System.out.println(text);
                isGym = false;
                isPool = false;
                isGroup = false;
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (zone[zone.length - 1] != null && isFull) System.out.println(zoneIsFull);
    }

    public void addToDesiredZone(String zone, Subscription subscription) {
        for (int i = 0; i < ZONE_SIZE; i++) {
            if (subscription.equals(gymZone[i])
                    || subscription.equals(poolZone[i]) || subscription.equals(groupClasses[i])) {
                System.out.println("Данный пользователь уже зарегистрирован в одной из групп");
                return;
            }
        }

        if (subscription.getDateOfExpiration().isBefore(CURR_DATE)
                && !subscription.getDateOfExpiration().isEqual(CURR_DATE)) {
            System.out.println("Срок действия абонемента истек");
            return;
        }

        if (CURR_TIME.isBefore(subscription.getStartTimeOfVisit())
                || CURR_TIME.isAfter(subscription.getEndTimeOfVisit())) {
            System.out.println("Абонемент не активен в данное время суток");
            return;
        }

        if ((zone.equalsIgnoreCase(Gym_Zone))) {
            isGym = true;
            checkIn(subscription, getGymZone());
        } else if ((zone.equalsIgnoreCase(Pool_Zone))) {
            isPool = true;
            checkIn(subscription, getPoolZone());
        } else if ((zone.equalsIgnoreCase(Gym_Zone))) {
            isGroup = true;
            checkIn(subscription, getGroupClasses());
        } else {
            System.out.println("Введите правильную зону");
        }
    }

    public void printGroups() {
        System.out.println("Посетители тренажерного зала:");
        System.out.println(Arrays.toString(getGymZone()));
        System.out.println("Посетители бассейна:");
        System.out.println(Arrays.toString(getPoolZone()));
        System.out.println("Посетители групповых занятий:");
        System.out.println(Arrays.toString(getGroupClasses()));

    }

    public static void initializeZone(Subscription[] subscriptions) {
        Owner defaultPerson = new Owner("Пользователь", "Неизвестный", 1970);
        Subscription initialSubscription = new Subscription
                (-1, defaultPerson, TypeOfSubscription.DEFAULT, MIN_DATE, MIN_DATE);
        Arrays.fill(subscriptions, initialSubscription);


    }
}



