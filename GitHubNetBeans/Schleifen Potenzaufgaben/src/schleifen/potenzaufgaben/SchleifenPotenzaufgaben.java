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
    
    // Aufgabe 1
    /*
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double erg = 1;
        int exp;
        System.out.println("Geben Sie eine eZahl ein:");
        double zahl = myScanner.nextDouble();
        System.out.println("Geben Sie eine Potenz ein");
        exp = myScanner.nextInt();
        for( int i = 0; i<exp; i++){
            erg = erg * zahl;
        }
        System.out.println("Das Ergebnis beträgt: " + erg);
    */
    //Aufgabe 3
    public static void main(String[] args) {
        System.out.println("Geben Sie eine Zahl ein:");
        Scanner myScanner = new Scanner(System.in);
        int zahl = myScanner.nextInt();
        
        int i = 1;
        while(zahl > (i*i)){
            i++;
        }
        
        if ((i*i) == zahl)
        {
            System.out.println("Die eingegebene Zahl " + zahl + " ist die "
                    + "Quadratzahl von " +i);
        }
        else System.out.println("Die eingegebene Zahl " + zahl + " ist keine "
                + " Quadratzahl ");
        while((i*i) ==zahl){
            i++;
        }
        int iuntere;
        iuntere = i;
        System.out.println("Die nächste höhere Quadratzahl ist: " + iuntere); 
                while((iuntere*iuntere) == zahl){
            iuntere--;
        }
        System.out.println("Die nächste untere Quadratzahl ist: " + iuntere); 
        System.out.println("Die n#chst kleinere Quadratzahl ist: " + ((i-1) * (i-1)));
    }
    
}
