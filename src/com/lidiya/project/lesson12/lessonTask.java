package com.lidiya.project.lesson12;

import java.time.LocalDateTime;

public class lessonTask extends Exception {
    // наследование от Exception - исключение времени компиляции
    private  String massage;
    private Throwable cause;
    // message - описание причины генерации исключения
    // cause - исключение, которое стало причиной генерации
    public lessonTask(String message) {
        super(message);
        this.massage = massage;
    }

    public lessonTask(String message, Throwable cause) {
        super(message, cause);
        this.massage = massage;
        this.cause = cause;
    }


    @Override
    public String getMessage() {

            return super.getMessage()+ LocalDateTime.now();
        }

}

