package exppuzzledowhile;
import java.util.Scanner;

public class ExpPuzzleDoWhile {

    public static void main(String[] args) {
        int n, i;
        n = 0;
        i = 0;
        // Zeile 1 initalisiert n und i 
        // Dabei wird auch n und i der Wert 0 deklariert.
        Scanner myInput = new Scanner(System.in);
        String eingabe;
        do{
            System.out.println("Geben Sie ein Wort ein. >Ende< für Ende");
            eingabe = myInput.next();

            n = n + i;
            i++; //Wichtig, damit es keine Enlosschleife ist und Funktionalität
             
        }while (i < 11 && !eingabe.equalsIgnoreCase("Ende"));
        
        System.out.println("Die Summer der erstrn 10 Zahlen beträgt: n= " + n); //  | Berechnung der Summe der ersten 10 natürlichen Zahlen
        // 

    }
    
}
