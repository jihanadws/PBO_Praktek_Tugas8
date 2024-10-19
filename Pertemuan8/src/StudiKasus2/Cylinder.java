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
public class Cylinder extends Shape{
    private double radius;
    private double height;
    
    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }
    
    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    @Override
    public String toString() {
        return super.toString() + " dengan radius " + radius + " dan tinggi " + height;
    }
}
