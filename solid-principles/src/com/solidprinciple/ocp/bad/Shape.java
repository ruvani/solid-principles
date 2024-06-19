package com.solidprinciple.ocp.bad;

public class Shape {
	public double calculateArea(Object shape) {
        double area = 0;
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            area = Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            area = rectangle.length * rectangle.width;
        }
        return area;
    }
}