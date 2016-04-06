import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class comp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class comp extends Actor
{
    Player1 player1;
    Rock rock;
    Paper paper;
    Scissors scissors;
    int f;
    int num;
    /**
     * Act - do whatever the comp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        set();
    }    

    public void set()
    {
        f = Player1.h;
        for(int g = 0; f == g; g++)
        {
            num = Greenfoot.getRandomNumber(3) + 1;
            setImage(num + ".png");
            //Player1.h++;
            Greenfoot.delay(10);
            if(num == rock.set || num == paper.give || num == scissors.ours){
                JOptionPane.showMessageDialog(null,"Its a tie!");
            }
            else if (num == 3 && rock.set == 1){
                JOptionPane.showMessageDialog(null,"You Win!");
                Player1.score++;
            }
            else if (num == 2 && scissors.ours == 3){
                JOptionPane.showMessageDialog(null,"You Win!");
                Player1.score++;
            }
            else if (num == 1 && paper.give == 2){
                JOptionPane.showMessageDialog(null,"You Win!");
                Player1.score++;
            }
            else if (num == 3 && paper.give == 2){
                JOptionPane.showMessageDialog(null,"You Lose!");
                Player1.score--;
            }
            else if (num == 2 && rock.set == 1){
                JOptionPane.showMessageDialog(null,"You Lose!");
                Player1.score--;
            }
            else if (num == 1 && scissors.ours == 3){
                JOptionPane.showMessageDialog(null,"You Lose!");
                Player1.score--;
            }
            Greenfoot.delay(5);
            int response = JOptionPane.showConfirmDialog(null,"Would you like to play again?");
            if (response == JOptionPane.YES_OPTION)
                Greenfoot.setWorld(new PlayWorld());
            else
                Greenfoot.stop();
        }
    }
    public static void tankd()
    {
        //setImage(Greenfoot.getRandomNumber(3) + 1 + ".png");
        Player1.score++;
    }
}

