package com.lidiya.project.lesson11.task.images;

public interface Drawable {
    void draw();
    Drawable clone() throws CloneNotSupportedException;
}