/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medtermsabarle;

/**
 *
 * @author User
 */
public class MedtermSabarle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Phones[] Phones = new Phones[3];
        
        Phones[0] = new Phones("Samsung", "Lee byung - chul", 1938, "Red");
        Phones[1] = new Phones("Vivo", "HiFi", 2009, "blue");
        Phones[2] = new Phones("Tecno", "smartphone", 2006, "Black");
        
        for (Phones Phone : Phones) {
            System.out.println(Phones);
        }
      }
}
 
    

