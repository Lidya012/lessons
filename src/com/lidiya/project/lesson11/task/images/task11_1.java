package com.lidiya.project.lesson11.task.images;
import com.lidiya.project.lesson11.task.images.Drawable;
import com.lidiya.project.lesson11.task.images.Editor;
import com.lidiya.project.lesson11.task.images.Gallery;
import com.lidiya.project.lesson11.task.images.Image;

public  class task11_1{
    public static void main(String[] args) throws CloneNotSupportedException {
        Image image01 = new Image("test1.txt");
        Image image02 = new Image("test2.txt");
        Image image03 = new Image("test3.txt");
        Image image04 = new Image("test4.txt");
        Drawable[] drawablesImage = {image01, image02, image03};
        Gallery gallery01 = new Gallery("gallery1", drawablesImage);

        Image image05 = image01.clone();
        Gallery gallery02 = gallery01.clone();

        Editor editor01 = new Editor(gallery01);
        editor01.setDrawable(image05);
        Editor editor02 = editor01.clone();

        System.out.println(editor01);
        System.out.println(editor02);
    }
}