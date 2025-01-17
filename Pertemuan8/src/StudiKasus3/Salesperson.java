/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasus3;

/**
 *
 * @author Jihan
 */
public class Salesperson implements Comparable <Salesperson> {
    private String firstName, lastName;
    private int totalSales;
    
    public Salesperson (String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    
    public boolean equals (Object other) {
    return (lastName.equals(((Salesperson) other).getLastName())&& firstName.equals(((Salesperson) other).getFirstName()));
    }
    
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return other.totalSales - this.totalSales;
        } else {
            return other.lastName.compareTo(this.lastName);
        }
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getSales() {
        return totalSales;
    }
}
