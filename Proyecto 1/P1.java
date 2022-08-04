import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P1 extends Players
{
    public P1()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the P1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move1P1();
        hitsObstacle1();
        hitsObstacle2();
        grabCoin1P1();
        grabCoin2P1();
        grabCoin4P1();
        passLevelM();
    }
    public void hitsObstacle1()
    {
        if(obstacle1())
        {
            Greenfoot.playSound("Hole.mp3");
            setLocation(34,548);
        }
    }
    public void hitsObstacle2()
    {
        if(obstacle2())
        {
            if(getWorld() instanceof Futuristic2)
            {
                Greenfoot.playSound("Hit.mp3");
                setLocation(34,548);
                Futuristic2.scoreP1--;
            }
            else if(getWorld() instanceof Volcano2)
            {
                Greenfoot.playSound("Hit.mp3");
                setLocation(34,548);
                Volcano2.scoreVolP1--;
                Futuristic2.scoreP1--;
            }
        }
    }
    public void selChar()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Futuristic());
        }
    }
}
