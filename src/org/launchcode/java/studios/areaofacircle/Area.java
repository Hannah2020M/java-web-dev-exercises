package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        Double radius = input.nextDouble();
       // Double area =  3.14 * radius * radius;
        Double area = Circle.getArea(radius);
        System.out.println("Area of the circle = " + area);
    }
}
