import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class winnerz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class winnerz extends Actor
{
    /**
     * Act - do whatever the winnerz wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            setLocation(200,200);
            setImage("Tank.png");
            comp.tankd();
            Greenfoot.delay(10);
            //Player1.score++;
            JOptionPane.showMessageDialog(null,"Destroyed the enemy!");
            int response = +JOptionPane.showConfirmDialog(null,"Would you like to play again?");
            if (response == JOptionPane.YES_OPTION)
            Greenfoot.setWorld(new PlayWorld());
            else
            Greenfoot.stop();
        }
    }    
}
