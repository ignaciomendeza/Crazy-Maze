import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Single single = new Single();
        addObject(single,204,312);
        Multi multi = new Multi();
        addObject(multi,397,312);
        single.setLocation(220,304);
        multi.setLocation(290,306);
        multi.setLocation(338,308);
        multi.setLocation(338,307);
        single.setLocation(209,299);
        single.setLocation(211,296);
        single.setLocation(228,341);
        single.setLocation(205,313);
        multi.setLocation(379,313);
    }
}
