import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen1 extends World
{

    /**
     * Constructor for objects of class WinScreen1.
     * 
     */
    public WinScreen1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
    }
    public void act()
    {
        showText("Total score: " + Futuristic.scoreP, 227, 450);
    }
}
