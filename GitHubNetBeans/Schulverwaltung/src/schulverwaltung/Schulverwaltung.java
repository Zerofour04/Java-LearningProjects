/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schulverwaltung;

/**
 *
 * @author hobe218901
 */
public class Schulverwaltung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
         
    {
        Schueler s1 = new Schueler("Musterfrau", "Anna", true, "f");
        Schueler s2 = new Schueler("Mustermann", "Max");
        
        System.out.println(s1.toString());
        System.out.println(s1);
        System.out.println(s2);
    }
}
