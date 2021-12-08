package com.javaex.ex04;

public class RectTriangle extends Shape {
    private double width;
    private double height;

    public RectTriangle( double width, double height ) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return width*height*0.5;
    }

    public double getPerimeter() {
        double result = width + height + Math.sqrt( width*width + height*height );
        return result;
            
    }

}