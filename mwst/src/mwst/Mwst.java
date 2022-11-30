/*
 * Programm zum Berechnen der Mehrwertsteuer
 * Zur Bearbeitung im Unterricht markierten Teil entfernen.
 */
package mwst;
import java.util.Scanner;   // Einbinden zum Verwenden des Scanners

public class Mwst {

      
    public static double round2Dec(double x)    //mathematisch auf 2 Dezimalen runden
    {
        x = Math.round(x*100);
        return(x/100);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        double mwstSatz;        // Variable zum Speichern des MwSt-Satzes
        double nettoBetrag;     // Variable zum Speichern des Netto-Betrages
        double bruttoBetrag;    // Variable zum Speichern des Brutto-Betrages
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Bitte Nettobetrag eingeben:");
        nettoBetrag = myScanner.nextDouble(); // Einlesen des Nettobetrages
        
        /* HIER Vervollstaendigen */
        
        /*
        System.out.println("Bitte Prozente eingeben:");
        mwstSatz = myScanner.nextDouble();
        bruttoBetrag =  nettoBetrag * ( 1 + mwstSatz / 100); 
        bruttoBetrag = round2Dec(bruttoBetrag);
        
        System.out.println("Der Bruttobetrag ist " + bruttoBetrag + "€");
        */

        for (int j = 1; j < 10; j= j + j %3){
            System.out.print(j + "");
            }
            
    }
    
}
