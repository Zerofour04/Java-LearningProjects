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
        addObject(r, getWidth()/2 , getHeight()-50);
        r.setRotation(270);        
        
        Asteroid a1 = new Asteroid(1);
        addObject(a1, getWidth()/45, 5);
        
        Asteroid a8 = new Asteroid(8);
        addObject(a8, getWidth()/20, 400);
        
        Asteroid a2 = new Asteroid(2);
        addObject(a2, getWidth()/10, 20);
        
        Asteroid a3 = new Asteroid(3);
        addObject(a3, getWidth()/10, 20);
        
        Asteroid a4 = new Asteroid(4);
        addObject(a4, getWidth()/10, 20);
        
        Asteroid a5 = new Asteroid(5);
        addObject(a5, getWidth()/10, 20);
        
        Asteroid a6 = new Asteroid(6);
        addObject(a6, getWidth()/10, 20);
        
        Asteroid a7 = new Asteroid(7);
        addObject(a7, getWidth()/10, 20);
    }
}
