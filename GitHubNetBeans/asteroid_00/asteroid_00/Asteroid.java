import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    
    int speed;
    public int life = 3;
    
    Asteroid(){
        this.speed = 3;
    }
    
    public Asteroid (int speed){
        this.speed = speed;
        
        if (speed>=5){
            this.speed = 5;
        }
        else if (speed <= 1){
            this.speed = 1;
        }
        else this.speed = speed;
        //this.fallGeschwindigkeit = fallGeschwindigkeit;
    }
    
    
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
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
    
    public void hitBullet(){
        if (isTouching(Bullet.class)){
            removeTouching(Bullet.class);
            this.life--;
            setLocation(getX(), getY() - 20);
            Bullet.numOfBullets--;
        }
        if (life == 0){
            //setLocation(getX(), getY() -30);
            getWorld().removeObject(this);
        }
    }
}
