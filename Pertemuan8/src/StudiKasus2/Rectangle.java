/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasus2;

/**
 *
 * @author Jihan
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double l, double w) {
        super("Rectangle");
        length = 1;
        width = w;
    }
    
    @Override
    public double area() {
        return length * width;
    }
    
    @Override
    public String toString() {
        return super.toString() + " dengan panjang " + length + " dan lebar " + width;
    }
}
