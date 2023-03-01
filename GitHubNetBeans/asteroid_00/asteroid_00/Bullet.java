import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int numOfBullets = 0;
    int bulletSpeed = 0;
    public Bullet(int bulletspeed) 
    {
        
        this.bulletSpeed = -2;
    }    
    
    public void act()
    {
        this.move();
    }
    
    
    public void move()
    {
        setLocation(getX() +0, getY() -3);
        if(isAtEdge()){
            getWorld().removeObject(this);
            numOfBullets--;
        }
    }


    
}
