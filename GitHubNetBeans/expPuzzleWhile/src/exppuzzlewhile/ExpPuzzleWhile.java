package exppuzzlewhile;

public class ExpPuzzleWhile {

    public static void main(String[] args) {
        int n, i, q;
        n = 0;
        i = 0;
        q = 0;
        // Die Funktion wird so lange durchgelaufen bis i kleiner als 11 
        /*while (i < 11){
            n = n + i;
            i++;
        }*/
        
        while (n < 11) {
            n = q + i * i ;
            i++;
        }
        
        //Zeile 12 ist schon wichtig, schließlich wird so lange diese Bedingung aausgeführt bist das Ziel erreicht wurde
        //Sollte Zeile 12 nicht existieren, so läuft die Schleife unendlich weiter
        
        System.out.println("Ergebnis: " + i); // Hier Ergebnis einfügen!
        // Hier einfügen: Das Ergebnis bleibt 5, weil wenn das Ergebnis größer wird überschreitet es die Bedingung

    }
    
}
