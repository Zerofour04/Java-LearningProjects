package kaffeeautomatauswahl;

import java.util.Scanner;

/**
 *
 * @author gei
 */
public class KaffeeautomatAuswahl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
    /**
     * @param args the command line arguments
     */
       Scanner myScanner = new Scanner (System.in);
       int auswahl;
       double endpreis = 0;
       
       String ausgabe = "keine gültige Auswahl";
       System.out.println("Bitte treffen Sie Ihre Wahl durch Eingabe einer Zahl: ");
       System.out.println("0: Heißes Wasser (kostenlos) ");
       System.out.println("1: Cappuccino (0,5 Euro) ");
       System.out.println("2: Cappuccino Special (0,5 Euro) ");
       System.out.println("3: Trinkschokolade (0,4 Euro)");
       System.out.println("4: Kaffee Schwarz (0,3 Euro)");
       System.out.println("5: Cafe AU LAIT (0,5 Euro)");
       System.out.println("6: Latte Macchiatto (0,80 Euro)");
       System.out.println("7: Espresso (0,30 Euro)");
       System.out.println("8: Espresso Macchiato (0,50 Euro)");       
       System.out.println("9: Vanillemilch (0,40 Euro)");
       System.out.println("10: Vanille Flavour (0,30 Euro)");
       auswahl = myScanner.nextInt();
       
       boolean extra = false;
       boolean zucker = false;
       switch(auswahl)
       {
           case 0: endpreis += 0.0; ausgabe = "Heißes Wasser"; break;
           case 1: endpreis += 0.5; ausgabe = "Cappuccino"; break;
           case 2: endpreis += 0.5; ausgabe = "Cappuccino Special" ;break; 
           case 3: endpreis += 0.4; ausgabe = "Trinkschokolade"; break;
           case 4: endpreis += 0.3; ausgabe = "Kaffee Schwarz"; break;    
           case 5: endpreis += 0.5; ausgabe = "Cafe Au Lait"; break;
           case 6: endpreis += 0.8; ausgabe = "Latte Macchiato"; break;
           case 7: endpreis += 0.3; ausgabe = "Espresso"; break;  
           case 8: endpreis += 0.5; ausgabe = "Espresso Macchiato"; break;
           case 9: endpreis += 0.4; ausgabe = "Vanillemilch"; break;
           case 10: endpreis += 0.3; ausgabe = "Vanille Flavour"; break;
           default: System.out.println("Diese Auswahl existiert nicht!");
       }
       if(auswahl == 1 || auswahl == 2  || auswahl == 4 || auswahl ==5
          || auswahl == 7 || auswahl == 10)
       {
          System.out.println("Möchten Sie extra Milch? (true/false)"); 
          extra = myScanner.nextBoolean();
          if(extra)
          {
              endpreis += 0.05;
              ausgabe += " mit Milch";
          }
       }
       if(auswahl > 0 && auswahl != 3 && auswahl != 9 && auswahl < 11)
       {
          System.out.println("Möchten Sie Zucker? (true/false)"); 
          zucker = myScanner.nextBoolean();
          if(zucker)
          {
              endpreis += 0.05;
              if(extra) ausgabe += " und";
              ausgabe += " mit Zucker";
          }
       }
        endpreis = round2Dec(endpreis);
        if(auswahl >= 0 && auswahl <= 10)
            System.out.println("Ihre Auswahl ist: " + ausgabe + " und kostet: " + endpreis + " Euro");   // TODO code application logic here
    }
    public static double round2Dec(double x)
   {
       x = Math.round(x * 100);
       return (x/100);
   }
    
}
