import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next extends Buttons
{
    /**
     * Act - do whatever the Next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        click();
    }
    public void click()
    {
        if(getWorld() instanceof Futuristic)
        {
            if (Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new Volcano());
            }
        }
        else if(getWorld() instanceof Futuristic2)
        {
            if (Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new Volcano2());
            }
        }
    }
}
