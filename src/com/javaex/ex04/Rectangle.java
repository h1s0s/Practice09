package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;

    public Rectangle( double width, double height ) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2*(width + height);
    }

    public void resize(double s) {
        width = width * s;
        height = height * s;
    }

}