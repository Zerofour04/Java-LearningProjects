/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fehler_datentypen;
import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Fehler_datentypen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long zahlDerBenutzer;
        double gehalt;
        char zeichen1, zeichen2;
        boolean zahlNegativ;
        char zeichen = '3' + '4' + '5';
        double länge, breite, inhalt;
        long umfang;
        boolean quadrat;
        byte byte1;
        byte b;
        int anzahl, nummer;
        String vorname, name;
        String adresse;
        String postleitzahl;
        short i,j,k;
        short nulll;
        
        //System.out.println("Gratuliere, Sie haben alle Fehler behoben!");
        //Scanner myScanner = new Scanner(System.in);
        //System.out.println("Bitte geben Sie die Zahl ein!");
        //zahl = myScanner.nextInt();
        //System.out.println("Sie haben die Zahl " + zahl + " eingegeben");
        
        //Scanner myScannerText = new Scanner(System.in).useDelimiter("\\n");
        //System.out.println("Bitte geben Sie einen Text ein!");
        //name = myScannerText.next();
       //System.out.println("Sie haben den Text " + name + " eingegeben");
        
        Scanner myScannerText2 = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Bitte geben Sie eine Zahl ein!");
        inhalt = myScannerText2.nextDouble();
        System.out.println("Sie haben die Zahl " + inhalt + " eingegeben");
    }
    
}
