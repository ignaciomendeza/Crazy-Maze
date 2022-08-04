import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tie extends World
{

    /**
     * Constructor for objects of class Tie.
     * 
     */
    public Tie()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    public void act()
    {
        showText("Total score: " + Futuristic2.scoreP1, 234, 450);
        showText("Total score: " + Futuristic2.scoreP2, 422, 450);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        P1Wins p1Wins = new P1Wins();
        addObject(p1Wins,230,404);
        P2Wins p2Wins = new P2Wins();
        addObject(p2Wins,419,404);
    }
}
