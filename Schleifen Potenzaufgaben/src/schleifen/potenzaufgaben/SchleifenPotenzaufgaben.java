/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schleifen.potenzaufgaben;

import java.util.Scanner;

/**
 *
 * @author hobe218901
 */
public class SchleifenPotenzaufgaben {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double erg = 1;
        int exp;
        System.out.println("Geben Sie eine eZahl ein:");
        double zahl = myScanner.nextDouble();
        System.out.println("Geben Sie eine Potenz ein");
        exp = myScanner.nextInt();
        for( int i = 0; i<exp;){
            erg = erg * zahl;
        }
        System.out.println("Das Ergebnis beträgt: " + erg);
        
    }
    
}
