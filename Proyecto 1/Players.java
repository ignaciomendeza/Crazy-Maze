import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Actor
{
    /**
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Futuristic thisGame;
    public void act()
    {
        // Add your action code here.
    }
    public void move1P1()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x+2, y);
            if(getWorld() instanceof Futuristic | getWorld() instanceof Futuristic2)
            {
                if(walls())
                {
                    setLocation(x-2, y);
                }
            }
            else if(getWorld() instanceof Volcano | getWorld() instanceof Volcano2)
            {
                if (walls2() == false)
                {
                    setLocation(43, 568);
                }
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-2, y);
            if(getWorld() instanceof Futuristic | getWorld() instanceof Futuristic2)
            {
                if(walls())
                {
                    setLocation(x+2, y);
                }
            }
            else if(getWorld() instanceof Volcano | getWorld() instanceof Volcano2)
            {
                if (walls2() == false)
                {
                    setLocation(43, 568);
                }
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y-2);
            if(getWorld() instanceof Futuristic | getWorld() instanceof Futuristic2)
            {
                if(walls())
                {
                    setLocation(x, y+2);
                }
            }
            else if(getWorld() instanceof Volcano | getWorld() instanceof Volcano2)
            {
                if (walls2() == false)
                {
                    setLocation(43, 568);
                }
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+2);
            if(getWorld() instanceof Futuristic | getWorld() instanceof Futuristic2)
            {
                if(walls())
                {
                    setLocation(x, y-2);
                }
            }
            else if(getWorld() instanceof Volcano | getWorld() instanceof Volcano2)
            {
                if (walls2() == false)
                {
                    setLocation(43, 568);
                }
            }
        }
    }
    public void move1P2()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(x+2, y);
            if(getWorld() instanceof Futuristic | getWorld() instanceof Futuristic2)
            {
                if(walls())
                {
                    setLocation(x-2, y);
                }
            }
            else if(getWorld() instanceof Volcano | getWorld() instanceof Volcano2)
            {
                if (walls2() == false)
                {
                    setLocation(977, 550);
                }
            }
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(x-2, y);
            if(getWorld() instanceof Futuristic | getWorld() instanceof Futuristic2)
            {
                if(walls())
                {
                    setLocation(x+2, y);
                }
            }
            else if(getWorld() instanceof Volcano | getWorld() instanceof Volcano2)
            {
                if (walls2() == false)
                {
                    setLocation(977, 550);
                }
            }
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(x, y-2);
            if(getWorld() instanceof Futuristic | getWorld() instanceof Futuristic2)
            {
                if(walls())
                {
                    setLocation(x, y+2);
                }
            }
            else if(getWorld() instanceof Volcano | getWorld() instanceof Volcano2)
            {
                if (walls2() == false)
                {
                    setLocation(977, 550);
                }
            }
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(x, y+2);
            if(getWorld() instanceof Futuristic | getWorld() instanceof Futuristic2)
            {
                if(walls())
                {
                    setLocation(x, y-2);
                }
            }
            else if(getWorld() instanceof Volcano | getWorld() instanceof Volcano2)
            {
                if (walls2() == false)
                {
                    setLocation(977, 550);
                }
            }
        }
    }
    public boolean walls()
    {
        if(isTouching(Wall.class))
        {
            
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean walls2()
    {
        if(isTouching(Wall2.class))
        {
            
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean obstacle1()
    {
        if(isTouching(Hole.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean obstacle2()
    {
        if(isTouching(Virus.class) | isTouching(Monster.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void grabCoin1P()
    {
        if(isTouching(Coin.class))
        {
            Futuristic.scoreP++;
            removeTouching(Coin.class);
            Futuristic.countP++;
        }
    }
    public void grabCoin2P()
    {
        if(isTouching(Coin2.class) & Futuristic.countP == 5)
        {
            Futuristic.scoreP = Futuristic.scoreP + 3;
            removeTouching(Coin2.class); 
        }
    }
    public void grabCoin1P1()
    {
        if(isTouching(Coin.class))
        {
            if(getWorld() instanceof Futuristic2)
            {
                Futuristic2.scoreP1++;
                removeTouching(Coin.class);
                Futuristic2.countP1++;
            }
            else if(getWorld() instanceof Volcano2)
            {
                Futuristic2.scoreP1++;
                Volcano2.scoreVolP1++;
                removeTouching(Coin.class);
                Futuristic2.countP1++;
            }
        }
    }
    public void grabCoin2P1()
    {
        if(isTouching(Coin2.class) & Futuristic2.countP1 == 5)
        {
            if(getWorld() instanceof Futuristic2)
            {
                Futuristic2.scoreP1 = Futuristic2.scoreP1 + 3;
                removeTouching(Coin2.class);
            }
            else if(getWorld() instanceof Volcano2)
            {
                Futuristic2.scoreP1 = Futuristic2.scoreP1 + 3;
                Volcano2.scoreVolP1 = Volcano2.scoreVolP1 + 3;
                removeTouching(Coin2.class);
            }
        }
    }
    public void grabCoin2P2()
    {
        if(isTouching(Coin2.class)  & Futuristic2.countP2 == 5)
        {
            if(getWorld() instanceof Futuristic2)
            {
                Futuristic2.scoreP2 = Futuristic2.scoreP2 + 3;
                removeTouching(Coin2.class);
            }
            else if(getWorld() instanceof Volcano2)
            {
                Futuristic2.scoreP2 = Futuristic2.scoreP2 + 3;
                Volcano2.scoreVolP2 = Volcano2.scoreVolP2 + 3;
                removeTouching(Coin2.class);
            }
        }
    }
    public void grabCoin3P2()
    {
        if(isTouching(Coin3.class))
        {
            if(getWorld() instanceof Futuristic2)
            {
                Futuristic2.scoreP2++;
                removeTouching(Coin3.class);
                Futuristic2.countP2++;
            }
            else if(getWorld() instanceof Volcano2)
            {
                Futuristic2.scoreP2++;
                Volcano2.scoreVolP2++;
                removeTouching(Coin3.class);
                Futuristic2.countP2++;
            }
        }
    }
    public void grabCoin4P()
    {
        if(isTouching(Coin4.class) & Futuristic.countP == 7)
        {
            Futuristic.scoreP = Futuristic.scoreP + 3;
            removeTouching(Coin4.class); 
        }
    }
    public void grabCoin4P1()
    {
        if(isTouching(Coin4.class) & Futuristic2.countP1 == 7)
        {
            Futuristic2.scoreP1 = Futuristic2.scoreP1 + 3;
            Volcano2.scoreVolP1 = Volcano2.scoreVolP1 + 3;
            removeTouching(Coin4.class); 
        }
    }
    public void grabCoin4P2()
    {
        if(isTouching(Coin4.class)  & Futuristic2.countP2 == 7)
        {
            Futuristic2.scoreP2 = Futuristic2.scoreP2 + 3;
            Volcano2.scoreVolP2 = Volcano2.scoreVolP2 + 3;
            removeTouching(Coin4.class);
        }
    }
    public void passLevelM()
    {
        if(getWorld() instanceof Futuristic2)
        {
            if(isTouching(Finish.class) & (Futuristic2.countP1 == 5 | Futuristic2.countP2 == 5))
            {
                getWorld().addObject(new Level2(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                getWorld().addObject(new Next(), getWorld().getWidth()/2, 550);
                if(Futuristic2.scoreP1 > Futuristic2.scoreP2)
                {
                    getWorld().addObject(new P1Wins(), getWorld().getWidth()/2, 450);
                }
                else
                {
                    getWorld().addObject(new P2Wins(), getWorld().getWidth()/2, 450);
                }
            }  
        }
        if(getWorld() instanceof Volcano2)
        {
            if(isTouching(Finish.class) & (Futuristic2.countP1 == 7 | Futuristic2.countP2 ==7))
            {
                getWorld().addObject(new Level2(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                getWorld().addObject(new Results(), getWorld().getWidth()/2, 550);
                if(Volcano2.scoreVolP1 > Volcano2.scoreVolP2)
                {
                    getWorld().addObject(new P1Wins(), getWorld().getWidth()/2, 450);
                }
                else
                {
                    getWorld().addObject(new P2Wins(), getWorld().getWidth()/2, 450);
                }
            }  
        }
    }
    public void passLevelS()
    {
        if(getWorld() instanceof Futuristic)
        {
            if(isTouching(Finish.class) & (Futuristic.countP == 5))
            {
                getWorld().addObject(new Level1(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                getWorld().addObject(new Next(), getWorld().getWidth()/2, 550);
            }  
        }
        if(getWorld() instanceof Volcano)
        {
            if(isTouching(Finish.class) & (Futuristic.countP == 7))
            {
                getWorld().addObject(new Level1(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                getWorld().addObject(new Results(), getWorld().getWidth()/2, 550);
            }  
        }
    }
}
