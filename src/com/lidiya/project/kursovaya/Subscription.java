package com.lidiya.project.kursovaya;

import java.time.LocalDate;
import java.time.LocalTime;

public class Subscription {
    private  int number;

    public TypeOfSubscription typeOfSubscription;
   public Owner owner;
    private LocalDate dateOfRegistration;
    private LocalDate dateOfExpiration;

    public LocalTime getStartTimeOfVisit() {
        return startTimeOfVisit;
    }

    public LocalTime getEndTimeOfVisit() {
        return endTimeOfVisit;
    }

    private LocalTime startTimeOfVisit;
    private LocalTime endTimeOfVisit;


    public Subscription(int number, Owner owner, TypeOfSubscription typeOfSubscription,
                        LocalDate dateOfRegistration, LocalDate dateOfExpiration) {
        setNumber(number);
        this.typeOfSubscription = typeOfSubscription;
        this.owner = owner;
        setTypeOfSubscription(typeOfSubscription);
        this.number = number;
        setTimeOfVisit();
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfExpiration = dateOfExpiration;
    }

    public void setTypeOfSubscription (TypeOfSubscription typeOfSubscription) {
            if (typeOfSubscription == null)
                throw new IllegalArgumentException("Тип абонемента не может быть пустой строкой");
            this.typeOfSubscription = typeOfSubscription;
        }

        public void setNumber (int number) {
            if (number <= 0 )
                throw new IllegalArgumentException("Номер абонемента должен быть больше нуля");
            this.number= number;
        }


    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public void setDateOfExpiration(LocalDate dateOfExpiration) {

        this.dateOfExpiration = dateOfExpiration;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }
    private void setTimeOfVisit() {
        if (this.typeOfSubscription == TypeOfSubscription.ONE_TIME) {
            this.startTimeOfVisit = TypeOfSubscription.ONE_TIME.getStartTimeOfVisit();
            this.endTimeOfVisit = TypeOfSubscription.ONE_TIME.getEndTimeOfVisit();
            this.dateOfExpiration = LocalDate.now();

        } else if (this.typeOfSubscription == TypeOfSubscription.DAY_TIME) {
            this.startTimeOfVisit = TypeOfSubscription.DAY_TIME.getStartTimeOfVisit();
            this.endTimeOfVisit = TypeOfSubscription.DAY_TIME.getEndTimeOfVisit();

        } else if (this.typeOfSubscription == TypeOfSubscription.FULL_TIME) {
            this.startTimeOfVisit = TypeOfSubscription.FULL_TIME.getStartTimeOfVisit();
            this.endTimeOfVisit = TypeOfSubscription.FULL_TIME.getEndTimeOfVisit();

        } else {
            this.startTimeOfVisit = LocalTime.of(0, 0);
            this.endTimeOfVisit = LocalTime.of(0, 0);
        }
    }
    @Override
    public String toString() {
        return "Номер абонимента = " + number +
                ", Тип абонимента = " + typeOfSubscription +
                ", Дата регистрации " + dateOfRegistration +
                ", Дата окончания" + dateOfExpiration +
                ",  Имя " + owner.getName() +
                ",  Фамилия " + owner.getSurname() +
                ",  Имя " + owner.getName() +
                ",  Возраст " + owner.getName()+
                ", время посещения: " + startTimeOfVisit +
                "-" + endTimeOfVisit;
    }

    }


