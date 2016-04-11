import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class PlayWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayWorld extends World
{
    //comp Comp;
    //Rock rock;
    //Scissors scissors;
    //Paper paper;
    /**
     * Constructor for objects of class PlayWorld.
     * 
     */
    public PlayWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Scissors(), 680, 525);
        addObject(new Paper(), 400, 525);
        addObject(new Rock(), 120, 525);
        addObject(new Player1(), 200, 200);
        addObject(new comp(), 600, 200);
        addObject(new winnerz(), 0, 0);
        addObject(new Score(), 400, 20);
        //winner();
    }
    }
