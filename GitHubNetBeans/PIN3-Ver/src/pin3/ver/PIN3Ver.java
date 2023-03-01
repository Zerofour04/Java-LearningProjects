/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pin3.ver;

import java.util.Scanner;

/**
 *
 * @author hobe218901
 */
public class PIN3Ver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pinKorrekt = "1234";
        String pin = "";
        int versuche = 3;
        Scanner myScanner = new Scanner(System.in);
        
        while(!pin.equals(pinKorrekt)&&versuche>=1) {
            System.out.println("Geben Sie ihre Pin ein: ");
            System.out.println("Sie haben noch "+versuche+"Versuche");
            pin = myScanner.next();
            versuche--;
        }
        if (pin.equals(pinKorrekt))
            System.out.println("Zugang gewährt");
        else System.out.println("Zugang verweigert");

    }
}
