package com.lidiya.project.kursovaya;

import java.time.LocalTime;

public enum TypeOfSubscription {
    ONE_TIME("разовый", LocalTime.of(8,0),LocalTime.of(22,0)),
    DAY_TIME("дневной", LocalTime.of(8,0),  LocalTime.of(16,0)),
    FULL_TIME("полный",LocalTime.of(8,0), LocalTime.of(22,0)),
    DEFAULT("Неизвестно", LocalTime.MIN, LocalTime.MIN);
    private String typeOfSubscription;
    private LocalTime startTimeOfVisit;
    private LocalTime endTimeOfVisit;

    TypeOfSubscription(String typeOfSubscription, LocalTime startTimeOfVisit, LocalTime endTimeOfVisit) {
        this.typeOfSubscription = typeOfSubscription;
        this.startTimeOfVisit = startTimeOfVisit;
        this.endTimeOfVisit = endTimeOfVisit;
    }

    public String getTypeOfSubscription() {
        return typeOfSubscription;
    }

    public LocalTime getStartTimeOfVisit() {
        return startTimeOfVisit;
    }

    public LocalTime getEndTimeOfVisit() {
        return endTimeOfVisit;
    }
}
