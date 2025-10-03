/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinal;

/**
 *
 * @author User
 */
public class Mage extends Character {
    // Additional property
    private int mana;

    // Constructor
    // level defaults to 1, weapon initially null
    public Mage(int mana, String name, int health) {
        super(name, 1, health, null);
        this.mana = mana;
    }

    // Getter for mana
    public int getMana() {
        return mana;
    }

    // Setter for mana
    public void setMana(int mana) {
        this.mana = mana;
    }

    // Override attack method
    @Override
    public void attack() {
        if (getWeapon() == null) {
            throw new IllegalStateException(getName() + " cannot attack without a weapon!");
        }
        if (mana < 10) {  // Assume an attack consumes 10 mana
            throw new IllegalStateException(getName() + " does not have enough mana to attack!");
        }

        // Deduct mana for attack
        mana -= 10;

        System.out.println(getName() + " casts a spell with " + getWeapon().getType() + 
            " dealing " + getWeapon().getDamage() + " magical damage. Remaining mana: " + mana);
    }

    // Override defend method
    @Override
    public void defend() {
        if (mana < 5) {  // Assume defending consumes 5 mana
            System.out.println(getName() + " tries to defend but lacks enough mana. Uses physical defense.");
            // fallback defend action without mana
            return;
        }
        // Deduct mana for defend
        mana -= 5;
        System.out.println(getName() + " casts a magical shield, reducing damage. Remaining mana: " + mana);
    }

    // Override toString to include mana property
    @Override
    public String toString() {
        return "Mage{" +
                "name='" + getName() + '\'' +
                ", level=" + getLevel() +
                ", health=" + getHealth() +
                ", mana=" + mana +
                ", weapon=" + getWeapon() +
                '}';
    }
}