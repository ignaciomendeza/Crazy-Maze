import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2 extends Players
{
    public P2()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the P2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move1P2();
        hitsObstacle1();
        hitsObstacle2();
        grabCoin2P2();
        grabCoin3P2();
        grabCoin4P2();
        passLevelM();
    }
    public void hitsObstacle1()
    {
        if(obstacle1())
        {
            setLocation(977,550);
        }
    }
    public void hitsObstacle2()
    {
        if(obstacle2())
        {
            if(getWorld() instanceof Futuristic2)
            {
                setLocation(977,550);
                Futuristic2.scoreP2--;
            }
            else if(getWorld() instanceof Volcano2)
            {
                setLocation(977,550);
                Volcano2.scoreVolP2--;
                Futuristic2.scoreP2--;
            }
        }
    }
}
