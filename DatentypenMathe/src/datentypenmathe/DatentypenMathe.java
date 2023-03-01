/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datentypenmathe;

import java.util.Scanner;

/**
 *
 * @author hobe218901
 */
public class DatentypenMathe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int a,b,c,d;
        //a = 88;
        //b = 17;
        //c = a/b;
        //d = a%b;
        //System.out.print("Ergebnis:"+ c);
        //System.out.print("Rest:" + d);
        
        // Verbesserung:
        
        Scanner myScanner = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("a = ");
        a = myScanner.nextInt();
        System.out.print("b = ");
        b = myScanner.nextInt();
        c = a/b;
        d = a%b;
        System.out.println(a+"/"+b+" = " + c + " mit dem Rest"+a+"%"+b+" = " + d);
        
        /*
        int a,b,c,d;
        c = 3;
        d = 32;
        b = d % c;
        a = c + d * c / 2 * 5;
        System.out.print(b);
        */
    }
    
}
