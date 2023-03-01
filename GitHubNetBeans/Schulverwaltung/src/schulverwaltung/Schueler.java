/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schulverwaltung;

/**
 *
 * @author hobe218901
 */
public class Schueler {
    
 // Variablen (= Attribute) von Schueler
 String nachname;
 String vorname;
 boolean zulassung;
 String sex;
 
 // Konstruktor 1, mit allen 3 Parametern
 Schueler(String nachname, String vorname, boolean zul, String sex){
    this.nachname = nachname;
    this.vorname = vorname;
    zulassung = zul;
    if(sex.equals("w")^sex.equals("f"))
        this.sex="w";
    else if(sex.equals("m"))
        this.sex = sex;
    else this.sex = "d";
    
 }
 // Konstruktor 2, Parameter der Zulassung wird nicht übergeben
 Schueler(String nachname, String vorname){
    this.nachname = nachname;
    this.vorname = vorname;
    zulassung = false; // Setzen eines default-Wertes
    this.sex = "d";
 }
 //Methoden
 @Override
 public String toString(){
     if(sex.equals("w"))
        return ("Schuelerin: "+vorname+" "+nachname+"; Geschlecht: "+sex);
     else return ("Schueler: " +vorname+" "+ nachname+"; Geschlecht: "+sex);
 }
}
