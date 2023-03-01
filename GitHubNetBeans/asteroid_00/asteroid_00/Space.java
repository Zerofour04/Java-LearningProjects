import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        Rocket r = new Rocket();
        addObject(r, getWidth()/2 , getHeight()-40);
        r.setRotation(270);
        
        
        Asteroid a1, a2, a3, a4, a5, a6, a7, a8;
        a1 = new Asteroid(1);
        addObject(a1, 50, 0);
        a2 = new Asteroid(1);
        addObject(a2, 150, 230);
        a3 = new Asteroid(1);
        addObject(a3, 250, 40);
        a4 = new Asteroid(1);
        addObject(a4, 350, 170);
        a5 = new Asteroid(1);
        addObject(a5, 450, 80);
        a6= new Asteroid(1);
        addObject(a6, 550, 220);
        a7 = new Asteroid(1);
        addObject(a7, 650, 60);
        a8 = new Asteroid(1);
        addObject(a8, 750, 0);
        
    }
}
