import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hole extends Obstacles
{
    public Hole()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/9;
        int myNewWidth = (int)myImage.getWidth()/9;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Hole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
