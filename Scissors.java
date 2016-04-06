import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scissors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scissors extends Actor
{
    static int ours;
    /**
     * Act - do whatever the Scissors wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ours = 0;
        Clicked();
    }    
    
    public void Clicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ours = 3;
        }
    }
}
