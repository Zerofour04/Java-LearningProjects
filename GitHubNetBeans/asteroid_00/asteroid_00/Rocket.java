import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int fireDelay;
    
    public void act()
    {
        fly();
        shoot();
    }
    
    public void fly() 
    {
       if(Greenfoot.isKeyDown("a"))
       setLocation(getX()-5, getY());
       
       if(Greenfoot.isKeyDown("d"))
       setLocation(getX()+5, getY());
       
       if(Greenfoot.isKeyDown("w"))
       setLocation(getX(), getY()-5);
       
       if(Greenfoot.isKeyDown("s"))
       setLocation(getX(), getY()+5);
    }
    
    public void shoot()
    {
        if(Greenfoot.isKeyDown("space") && fireDelay <= 0 && Bullet.numOfBullets <=2){
            Bullet.numOfBullets++;
            getWorld().addObject(new Bullet(0), getX(), getY() -70);
            fireDelay = 30;
        }
       fireDelay--; 
       
    }

}
