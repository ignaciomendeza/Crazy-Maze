import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P extends Players
{
    /**
     * Act - do whatever the P wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move1P1();
        hitsObstacle1();
        hitsObstacle2();
        grabCoin1P();
        grabCoin2P();
        grabCoin4P();
        passLevelS();
    }
    public void hitsObstacle1()
    {
        if(obstacle1())
        {
            setLocation(43,568);
        }
    }
    public void hitsObstacle2()
    {
        if(obstacle2())
        {
            setLocation(43,568);
            Futuristic.scoreP--;
        }
    }
}
