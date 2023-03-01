package exppuzzlefor;

public class ExpPuzzlefor {

    public static void main(String[] args) {
        int n, q;
        n = 0;
        q = 0;
        // Die Variable n wird initialisiert, n wird dann als 0 deklariert
        for (int i = 0; i < 11; i++){
            n = n + i;
            if (i <= 5)
            q = q + i*i;
        }
        
        System.out.println("Ergebnis: " + n); // Hier Ergebnis einfügen!
        // Start der for Schleife mit der deklaration i mit 0;
        // Bedingng ist i muss kleiner als 11 sein mit der Veränderung des i um eins
    }
    
}
