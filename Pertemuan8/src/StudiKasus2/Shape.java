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
abstract public class Shape {
    protected String shapeName;
    
    public Shape(String name) {
        shapeName = name;
    }
    
    public abstract double area();
    
    public String toString() {
        return shapeName;
    }
}
