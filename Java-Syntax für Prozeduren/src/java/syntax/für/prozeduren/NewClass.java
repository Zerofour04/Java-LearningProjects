/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.syntax.für.prozeduren;

/**
 *
 * @author hobe218901
 */
public class NewClass {
    public static int pot10(int n)
    {
        if(n < 0) return 0;
        int pot = 1;
        for(int i = 1; i<=n; i++)
        {
            pot *= 10;
        }
        return pot;
    }
}
