package com.ohgiraffers.polymorphism;

public class Circle extends Shape implements Resizable{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        this.radius *= factor;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }
}
