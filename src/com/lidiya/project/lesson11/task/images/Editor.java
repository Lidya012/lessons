package com.lidiya.project.lesson11.task.images;
public final class Editor implements Cloneable {
    private Drawable drawable;

    public Editor(Drawable drawable) {
        setDrawable(drawable);
    }

    public void setDrawable(final Drawable drawable){
        this.drawable = drawable;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void show(){
        drawable.draw();
    }

    @Override
    public Editor clone() throws CloneNotSupportedException {
        Editor editorCloned = (Editor) super.clone();
        editorCloned.setDrawable(getDrawable().clone());

        return editorCloned;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "drawable=" + drawable +
                '}';
    }
}