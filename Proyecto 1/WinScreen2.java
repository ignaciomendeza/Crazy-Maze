import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen2 extends World
{

    /**
     * Constructor for objects of class WinScreen2.
     * 
     */
    public WinScreen2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }

    public void act()
    {
        showText("Total score: " + Futuristic2.scoreP1, 227, 450);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        P1Wins p1Wins = new P1Wins();
        addObject(p1Wins,313,394);
    }
}
