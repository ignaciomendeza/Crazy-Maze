import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Results here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Results extends Buttons
{
    /**
     * Act - do whatever the Results wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        touch();
    }
    public void touch()
    {
        if(getWorld() instanceof Volcano)
        {
            if (Greenfoot.mouseClicked(this))
            {
                Greenfoot.setWorld(new WinScreen1());
            }
        }
        else if(getWorld() instanceof Volcano2)
        {
            if (Greenfoot.mouseClicked(this))
            {
                if(Futuristic2.scoreP1 > Futuristic2.scoreP2)
                {
                    Greenfoot.setWorld(new WinScreen2());
                }
                else if (Futuristic2.scoreP1 < Futuristic2.scoreP2)
                {
                    Greenfoot.setWorld(new WinScreen21());
                }
                else
                {
                    Greenfoot.setWorld(new Tie());
                }
            }
        }
    }
}
