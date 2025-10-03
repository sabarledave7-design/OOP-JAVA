/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinal;

/**
 *
 * @author User
 */
public class Warrior extends Character {
    // Additional property
    private int armor_strength;

    // Constructor
    // Note: level is defaulted to 1, weapon is initialized to null
    public Warrior(int armor_strength, String name, int health) {
        super(name, 1, health, null);  // level = 1, weapon = null initially
        this.armor_strength = armor_strength;
    }

    // Getter for armor_strength
    public int getArmor_strength() {
        return armor_strength;
    }

    // Setter for armor_strength
    public void setArmor_strength(int armor_strength) {
        this.armor_strength = armor_strength;
    }

    // Override attack method
    @Override
    public void attack() {
        if (getWeapon() == null) {
            throw new IllegalStateException(getName() + " cannot attack without a weapon!");
        }
        System.out.println(getName() + " attacks with " + getWeapon().getType() + 
                " dealing " + getWeapon().getDamage() + " damage.");
    }

    // Override defend method
    @Override
    public void defend() {
        // Let's assume armor_strength is used to reduce incoming damage
        System.out.println(getName() + " defends with armor strength " + armor_strength + ".");
    }

    // Override toString to include armor_strength
    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + getName() + '\'' +
                ", level=" + getLevel() +
                ", health=" + getHealth() +
                ", armor_strength=" + armor_strength +
                ", weapon=" + getWeapon() +
                '}';
    }
}