import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallAsteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallAsteroid extends Asteroid
{
    /**
     * Act - do whatever the SmallAsteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 

    {
        this.move();
        this.checkCollision();
        this.hitBullet();
    }    
    
    public void move()
    {
        if(getY()>getWorld().getHeight()-10)
        {
            setLocation(getX(), 0);
        }
        else setLocation(getX(), getY()+speed);
    }
    
    public void checkCollision()
    {
        if(isTouching(Rocket.class))
        {
            Greenfoot.stop();
        }
    }   
}
