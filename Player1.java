import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    comp Comp;
    Rock rock;
    Paper paper;
    Scissors scissors;
    static int h;
    static int score;
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        h = 1;
        set();
        //if(h == 0)
        //h++;
        //winner();
    }    

    public void set()
    {
        if( Rock.set == 1)
        {
            setImage("1.png");
            h--;
        }
        else if (Paper.give == 2)
        {
            setImage("2.png");
            h--;
        }
        else if (Scissors.ours == 3)
        {
            setImage("3.png");
            h--;
        }
    }
    public void winner()
    {
        if(Comp.num == rock.set || Comp.num == paper.give || Comp.num == scissors.ours)
            JOptionPane.showMessageDialog(null,"Its a tie!");
        else if (Comp.num == 3 && rock.set == 1)
        {
            JOptionPane.showMessageDialog(null,"You Win!"); 
            score++;
        }
        else if (Comp.num == 2 && scissors.ours == 3){
            JOptionPane.showMessageDialog(null,"You Win!");
            score++;
        }
        else if (Comp.num == 1 && paper.give == 2){
            JOptionPane.showMessageDialog(null,"You Win!");
            score++;
        }
        else if (Comp.num == 3 && paper.give == 2){
            JOptionPane.showMessageDialog(null,"You Lose!");
            score--;
        }
        else if (Comp.num == 2 && rock.set == 1){
            JOptionPane.showMessageDialog(null,"You Lose!");
            score--;
        }
        else if (Comp.num == 1 && scissors.ours == 3){
            JOptionPane.showMessageDialog(null,"You Lose!");
            score--;
        }
            
       int response = +JOptionPane.showConfirmDialog(null,"Would you like to play again?");
            if (response == JOptionPane.YES_OPTION)
            Greenfoot.setWorld(new PlayWorld());
            else
            Greenfoot.stop();
            }
}
