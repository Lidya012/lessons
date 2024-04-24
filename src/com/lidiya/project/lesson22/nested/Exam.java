package com.lidiya.project.lesson22.nested;
// Exam.v1() вызов метода v1 осуществляется без создания экземпляра Exam
// new Exam.Mark(); создание экземпляра Mark осуществляется без создания экземпляра Exam
public class Exam {
    // public static void v1(){}
    // public class Mark{}

    private Subject subject;
    private Mark mark;

    public Exam(Subject subject) {
        this.subject = subject;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Mark getMark() {
        return mark;
    }

    public static class Mark { // public class Mark
        private final int value;
        private String description;

        public Mark(int value) {
            this.value = value;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }
    }

    public  /* static */  enum Subject {
        MATHS("Математика"),
        ENGLISH("Английский язык"),
        MUSIC("Музыка"),
        HISTORY("История");

        private String title;

        Subject(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }
}