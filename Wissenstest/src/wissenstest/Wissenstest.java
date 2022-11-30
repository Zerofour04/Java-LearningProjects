/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wissenstest;

/**
 *
 * @author hobe218901
 */
public class Wissenstest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int z1 = 13, z2 = 5, erg;
        z2 *= 3;
        z1 -= z2;
        boolean b = (-2 == z1);
    System.out.print("Passt z1 = 13 - 3* " + z2 + " = " + z1 + " zu obiger Rechung? ");
    System.out.print(b);

erg = z2 % 4 +2;
System.out.print(" Im Ergebnis: " + erg + " steht " + z2 + " drin?");
        
        
        // TODO code application logic here
        String s1 = "Das neue Gebäude";
        String s2 = " der FOS BOS FFB";
        String s3 = " liefert auch nicht ausreichend \"Mehr-Platz\".";
        
        System.out.println("s1 besitzt " + s1.length() + " Zeichen");
        System.out.println("Wir hier an" + s2+ " hätten gerne " + s3.substring(33,43));
    
        boolean vergleich = s3.contains("er");
        System.out.println(vergleich);
    
    }
    
}
