import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Obstacles
{
    public Monster()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/8;
        int myNewWidth = (int)myImage.getWidth()/8;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
