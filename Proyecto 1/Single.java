import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Single here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Single extends Buttons
{
    /**
     * Act - do whatever the Single wants to do. This method is called whenever
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
            Greenfoot.setWorld(new Futuristic());
        }
    }
}
