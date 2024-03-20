package com.lidiya.project.lesson11.task.images;

public interface Drawable extends Cloneable {
    void draw();
    Drawable clone();
}