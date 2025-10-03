/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinal;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // Create warrior without weapon, expect attack error
        Warrior warrior = new Warrior(1000, "Dave", 100);
        System.out.println(warrior);
        try {
            warrior.attack();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Assign weapon and attack
        Weapon BladeOfChaos = new Weapon(1000, 2, "BladeOfChaos");
        warrior.setWeapon(BladeOfChaos);
        warrior.attack();
        warrior.defend();
        System.out.println();

        // Create Mage without weapon
        Mage mage = new Mage(1000, "Jashi", 1000);
        System.out.println(mage);

        try {
            mage.attack();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Assign weapon and attack
        Weapon TheHandOfGod = new Weapon(1000, 5, "TheHandOfGod");
        mage.setWeapon(TheHandOfGod);
        mage.attack();
        mage.defend();
        mage.defend(); // second defend to show mana depletion effect

        System.out.println(mage);
    }
}