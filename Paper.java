import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paper extends Actor
{
    static int give;
    /**
     * Act - do whatever the Paper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         give = 0;
         Clicked();
    }  

    public void Clicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            give = 2;
        }
    }
}
