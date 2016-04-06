import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    int tempScore;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        tempScore = Player1.score;
        setImage(new GreenfootImage("Score: " + Player1.score,50,Color.WHITE,null));
        if(tempScore!= Player1.score) setImage(new GreenfootImage("Score: " + Player1.score,50,Color.BLACK,null));
    }    
}
