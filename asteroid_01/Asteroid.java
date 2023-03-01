import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    int speed;
    public Asteroid(int speed) 
    {
        //Scanner myScanner = new Scanner(System.in);
        //speed = myScanner.nextInt();
        
        if (speed >= 5)
            this.speed = 5;
        else if (speed <= 1)
            this.speed = 1;
        else this.speed = speed;
        this.speed = speed; // Attribut speed, das zu diesem
    }
    
    public void act()
    {
    }
    
}
