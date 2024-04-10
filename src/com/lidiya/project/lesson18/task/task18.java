package com.lidiya.project.lesson18.task;

import java.time.LocalDateTime;

public class task18 {
    private int id;
    private String title;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime closeTo;

    public task18(int id, String title, Status status, LocalDateTime createdAt, LocalDateTime closeTo) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.createdAt = createdAt;
        this.closeTo = closeTo;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getCloseTo() {
        return closeTo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCloseTo(LocalDateTime closeTo) {
        this.closeTo = closeTo;
    }

    // геттеры, сеттеры и д.т



    @Override
    public String toString() {
        return "task18{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", closeTo=" + closeTo +
                '}';
    }
    public enum Status {
        NEW, IN_PROGRESS, CLOSED
    }
}
