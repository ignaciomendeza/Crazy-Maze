import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Multi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multi extends Buttons
{
    /**
     * Act - do whatever the Multi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        click();
    }
    public void click()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Intro2.mp3");
            Greenfoot.setWorld(new Futuristic2());
        }
    }
}
