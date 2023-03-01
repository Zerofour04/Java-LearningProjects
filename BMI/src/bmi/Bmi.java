/*
 * Programm zur Berechnung des BMIs
 */
package bmi;

import java.util.Scanner;


public class Bmi {

    public static double round3Dec(double x)    //mathematisch auf 3 Dezimalen runden
    {
        x = Math.round(x*1000);
        return(x/1000);
    }

    public static void main(String[] args) {
        double gewicht, groesse, bmi, ideal;
        Scanner myScanner = new Scanner(System.in);
        
        // Einlesen der Größe und des Gewichtes
        System.out.println("Bitte Gewicht eingeben (in kg):");
        gewicht = myScanner.nextDouble();
        
        System.out.println("Bitte die Körpergrösse eingeben (in m)");
        groesse = myScanner.nextDouble();
        
        bmi = round3Dec(gewicht /(groesse * groesse));
        
        if (bmi >= 40) System.out.println("BMI: "+bmi+" Extremes Übergewicht");
        if ((bmi < 40) && (bmi >= 30)) System.out.println("BMI: "+bmi+" Starkes Übergewicht");
        if ((bmi < 30) && (bmi >= 25)) System.out.println("BMI: "+bmi+" Übergewicht");
        if ((bmi < 25) && (bmi >= 20)) System.out.println("BMI: "+bmi+" Normalgewicht");
        if (bmi < 20) System.out.println("BMI: "+bmi+" Untergewicht");
        
        ideal = round3Dec(22 * groesse * groesse);
        System.out.println("Ihr Idealgewicht beträgt " + ideal + " kg");
        
        
    }
    
}
