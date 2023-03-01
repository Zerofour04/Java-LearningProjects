/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java.syntax.für.prozeduren;

import java.util.Scanner;
/**
 *
 * @author hobe218901
 */
public class JavaSyntaxFürProzeduren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double n;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bitte Nettobetrag eingeben:");
        n = myScanner.nextDouble(); 
        int factor = NewClass.pot10(n);

        System.out.println("Eingabe" + einGabe);
        
        public static double roundNDec(double x, int n)
        {
            
            if (n>9) return x;
            
            int factor = NewClass.pot10(n);
            x = Math.round(x*factor);
            return(x/factor);
        }

    }
}
