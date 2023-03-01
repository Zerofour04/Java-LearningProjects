/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projektaufgabe.kaffeeautomat;
import java.util.Scanner;

/**
 *
 * @author hobe218901
 */
public class ProjektaufgabeKaffeeautomat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       double preis, preis1, preis2, preis3, preis4, preis5, preis6, preis7, preis8, preis9, preis10;
        
       preis = 0;
       preis1 = 2;
       preis2 = 2.5;
       preis3 = 1.9;
       preis4 = 1.5;
       preis5 = 3;
       preis6 = 2.5;
       preis7 = 4;
       preis8 = 4.5;
       preis9 = 2.5;
       preis10 = 2.75;
       
       System.out.println("Kafeeautomat | Bitte wählen Sie ein Kaffee:");
       System.out.println("Auswahl l: Cappuccino");
       System.out.println("Auswahl 2: Cappuccino Special");
       System.out.println("Auswahl 3: Trinkschokolade");
       System.out.println("Auswahl 4: Kafee schwarz");
       System.out.println("Auswahl 5: Cafe au Lait");
       System.out.println("Auswahl 6: Latte Macchiato");
       System.out.println("Auswahl 7: Espresso");
       System.out.println("Auswahl 8: Espresso Macchiato");
       System.out.println("Auswahl 9: Vanillemilch");
       System.out.println("Auswahl 10: Vanille Flavour");

       Scanner myInput = new Scanner(System.in);
       int input1; 
       
       input1 = myInput.nextInt();
       String ausgabe = "";
       
       switch(input1)
       {
           case 1:
           {
                ausgabe = "cappuccino";
                preis = preis + preis1;
           }
           break;
           case 2:
           {
                ausgabe = "cappuccino Special";
                preis = preis + preis2;
           }
           break;
           case 3:
           {
                ausgabe = "Trinkschokolade";
                preis = preis + preis3;
           }
           break;
           case 4:
           {
                ausgabe = "Kaffee Schwarz";
                preis = preis + preis4;
           }
           break;
           case 5:
           {
                ausgabe = "Cafe Au Lait";
                preis = preis + preis5;
           }
           break;
           case 6:
           {
                ausgabe = "Latte Macchiato";
                preis = preis + preis6;
           }
           break;
           case 7:
           {
                ausgabe = "Espresso";
                preis = preis + preis7;
           }
           break;
           case 8:
           {
                ausgabe = "Espresso Macchiato";
                preis = preis + preis8;
           }
           break;
           case 9:
           {
                ausgabe = "Vanillemilch";
                preis = preis + preis9;
           }
           break;
           case 10:
           {
                ausgabe = "Vanille Falvour";
                preis = preis + preis10;
           }
       }
       System.out.println(ausgabe + " wurde hinzugefügt");
       System.out.println("Kosten:" + preis + "€");
       
        boolean zucker = false;
       String ausgabe2 = "";
              
       if(input1 == 1 || input1 == 2  || input1 == 4 || input1 ==5
          || input1 == 7 || input1 == 10)
       {
          System.out.println("Möchten Sie extra Milch? (true/false)"); 
          zucker = myScanner.nextBoolean();
          if(zucker)
          {
              preis += 0.05;
              ausgabe2 += " mit Milch";
          }
       }
   
       
       /* DEBUG
       double preisZucker, preisMilch;
       
       preisZucker = 0.50;
       preisMilch = 1;
       
       
       
       System.out.println("Wünschen Sie sich auch Milch?");
       Scanner myInput2 = new Scanner(System.in);
       int input2; 
       input2 = myInput2.nextInt();
       String ausgabe2 = "";
       
       switch(input2)
       {
           case 1:
           {
               ausgabe2 = "Ja";
               System.out.println("Milch wurde hinzugefügt");
               preis = preis + preisMilch;
           }
           break;  
           case 2:
           {
               ausgabe2 = "Nein";
               //DEBUG
               System.out.println(ausgabe2);
               System.out.println("Keine Milch wurde hinzugefügt");
           }
           break; 
       }
       System.out.println(ausgabe2);
       System.out.println("Ihr neuer Preis beträgt" + preis);
       System.out.println("Vielen Dank für ihren Einkauf");
       */
    }    
}
