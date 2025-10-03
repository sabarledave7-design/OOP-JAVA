/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prefinal;

/**
 *
 * @author User
 */
public class Weapon {
    // Properties
    private int damage;
    private int range;
    private String type;

    // Constructor
    public Weapon(int damage, int range, String type) {
        this.damage = damage;
        this.range = range;
        this.type = type;
    }

    // Getter for damage
    public int getDamage() {
        return damage;
    }

    // Setter for damage
    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Getter for range
    public int getRange() {
        return range;
    }

    // Setter for range
    public void setRange(int range) {
        this.range = range;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    // Override toString() to provide string representation of the object
    @Override
    public String toString() {
        return "Weapon{" +
                "damage=" + damage +
                ", range=" + range +
                ", type='" + type + '\'' +
                '}';
    }
}