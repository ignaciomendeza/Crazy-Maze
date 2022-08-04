import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Futuristic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Futuristic extends World
{
    public static int scoreP = 0;  
    public static int countP = 0;
    /**
     * Constructor for objects of class Futuristic.
     * 
     */
    public Futuristic()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    public void act()
    {
        showText("Score: " + scoreP, 540, 584);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        scoreP = 0;
        countP = 0;
        Wall wall = new Wall();
        addObject(wall,9*50,11*50);
        Wall wall2 = new Wall();
        addObject(wall2,9*50,10*50);
        Wall wall3 = new Wall();
        addObject(wall3,9*50,9*50);
        Wall wall4 = new Wall();
        addObject(wall4,9*50,8*50);
        Wall wall5 = new Wall();
        addObject(wall5,9*50,7*50);
        Wall wall6 = new Wall();
        addObject(wall6,9*50,6*50);
        Wall wall7 = new Wall();
        addObject(wall7,9*50,5*50);
        Wall wall8 = new Wall();
        addObject(wall8,9*50,4*50);
        Wall wall9 = new Wall();
        addObject(wall9,9*50,3*50);
        Wall wall10 = new Wall();
        addObject(wall10,9*50,2*50);
        Wall wall11 = new Wall();
        addObject(wall11,8*50,2*50);
        Wall wall12 = new Wall();
        addObject(wall12,7*50,2*50);
        Wall wall13 = new Wall();
        addObject(wall13,6*50,2*50);
        Wall wall14 = new Wall();
        addObject(wall14,5*50,2*50);
        Wall wall15 = new Wall();
        addObject(wall15,4*50,2*50);
        Wall wall16 = new Wall();
        addObject(wall16,3*50,2*50);
        Wall wall17 = new Wall();
        addObject(wall17,2*50,2*50);
        Wall wall18 = new Wall();
        addObject(wall18,0*50,10*50);
        Wall wall19 = new Wall();
        addObject(wall19,1*50,10*50);
        Wall wall20 = new Wall();
        addObject(wall20,2*50,10*50);
        Wall wall21 = new Wall();
        addObject(wall21,4*50,11*50);
        Wall wall22 = new Wall();
        addObject(wall22,4*50,10*50);
        Wall wall23 = new Wall();
        addObject(wall23,4*50,9*50);
        Wall wall24 = new Wall();
        addObject(wall24,2*50,9*50);
        Wall wall25 = new Wall();
        addObject(wall25,5*50,9*50);
        Wall wall26 = new Wall();
        addObject(wall26,6*50,11*50);
        Wall wall27 = new Wall();
        addObject(wall27,7*50,11*50);
        Wall wall28 = new Wall();
        addObject(wall28,7*50,9*50);
        Wall wall29 = new Wall();
        addObject(wall29,2*50,8*50);
        Wall wall30 = new Wall();
        addObject(wall30,2*50,7*50);
        Wall wall31 = new Wall();
        addObject(wall31,2*50,6*50);
        Wall wall32 = new Wall();
        addObject(wall32,3*50,6*50);
        Wall wall33 = new Wall();
        addObject(wall33,4*50,6*50);
        Wall wall34 = new Wall();
        addObject(wall34,5*50,6*50);
        Wall wall35 = new Wall();
        addObject(wall35,6*50,6*50);
        Wall wall36 = new Wall();
        addObject(wall36,6*50,5*50);
        Wall wall37 = new Wall();
        addObject(wall37,5*50,4*50);
        Wall wall38 = new Wall();
        addObject(wall38,4*50,4*50);
        Wall wall39 = new Wall();
        addObject(wall39,3*50,4*50);
        Wall wall40 = new Wall();
        addObject(wall40,2*50,4*50);
        Wall wall41 = new Wall();
        addObject(wall41,6*50,4*50);
        Wall wall42 = new Wall();
        addObject(wall42,0*50,6*50);
        Wall wall43 = new Wall();
        addObject(wall43,0*50,7*50);
        Wall wall44 = new Wall();
        addObject(wall44,0*50,8*50);
        Wall wall45 = new Wall();
        addObject(wall45,450,599);
        Wall wall46 = new Wall();
        addObject(wall46,200,596);
        wall26.setLocation(313,545);
        wall26.setLocation(313,539);
        wall27.setLocation(340,539);
        wall27.setLocation(340,538);
        wall27.setLocation(349,537);
        wall27.setLocation(344,526);
        wall27.setLocation(358,522);
        wall27.setLocation(358,539);
        wall27.setLocation(371,537);
        wall27.setLocation(356,543);
        wall27.setLocation(363,551);
        wall27.setLocation(368,550);
        wall27.setLocation(363,536);
        wall27.setLocation(359,559);
        wall27.setLocation(364,546);
        wall27.setLocation(364,549);
        wall27.setLocation(351,548);
        removeObject(wall27);
        wall26.setLocation(325,534);
        P1 p1 = new P1();
        addObject(p1,40,564);
        wall26.setLocation(334,524);
        wall26.setLocation(322,548);
        wall3.setLocation(444,451);
        Finish finish = new Finish();
        addObject(finish,444,451);
        finish.setLocation(584,584);
        finish.setLocation(528,574);
        finish.setLocation(546,587);
        wall3.setLocation(447,432);
        wall3.setLocation(452,454);
        wall3.setLocation(464,442);
        wall3.setLocation(462,438);
        finish.setLocation(564,570);
        wall3.setLocation(471,453);
        wall3.setLocation(468,455);
        finish.setLocation(531,576);
        finish.setLocation(558,582);
        wall3.setLocation(450,435);
        wall3.setLocation(447,448);
        wall3.setLocation(450,450);
        finish.setLocation(550,581);
        wall35.setLocation(310,275);
        wall36.setLocation(20,21);
        wall35.setLocation(334,288);
        wall35.setLocation(423,264);
        wall35.setLocation(297,303);
        wall36.setLocation(300,250);
        wall35.setLocation(300,300);
        wall36.setLocation(300,250);
        wall36.setLocation(300,250);
        wall35.setLocation(300,300);

        Virus virus = new Virus();
        addObject(virus,149,342);
        virus.setLocation(151,351);
        Virus virus2 = new Virus();
        addObject(virus2,257,564);
        virus2.setLocation(241,576);
        virus2.setLocation(256,575);
        virus2.setLocation(247,579);
        Virus virus3 = new Virus();
        addObject(virus3,401,345);
        Virus virus4 = new Virus();
        addObject(virus4,345,196);
        Virus virus5 = new Virus();
        addObject(virus5,23,239);
        virus5.setLocation(17,253);
        Virus virus6 = new Virus();
        addObject(virus6,28,23);
        virus6.setLocation(24,24);
        Virus virus7 = new Virus();
        addObject(virus7,240,55);
        Virus virus8 = new Virus();
        addObject(virus8,573,24);
        Virus virus9 = new Virus();
        addObject(virus9,493,301);
        virus9.setLocation(498,303);
        Hole hole = new Hole();
        addObject(hole,232,396);
        hole.setLocation(252,495);
        Hole hole2 = new Hole();
        addObject(hole2,398,576);
        hole2.setLocation(296,338);
        hole2.setLocation(303,339);
        Hole hole3 = new Hole();
        addObject(hole3,403,160);
        hole3.setLocation(400,136);
        hole3.setLocation(396,142);
        removeObject(hole);
        removeObject(hole2);
        removeObject(hole3);
        Hole hole4 = new Hole();
        addObject(hole4,403,145);
        hole4.setLocation(410,138);
        hole4.setLocation(409,141);
        virus4.setLocation(352,192);
        removeObject(virus4);
        Hole hole5 = new Hole();
        addObject(hole5,492,182);
        hole5.setLocation(496,178);
        Hole hole6 = new Hole();
        addObject(hole6,581,431);
        hole6.setLocation(579,415);
        removeObject(virus2);
        Hole hole7 = new Hole();
        addObject(hole7,236,572);
        hole7.setLocation(258,581);
        hole7.setLocation(249,586);
        Coin2 coin2 = new Coin2();
        addObject(coin2,536,526);
        Coin coin = new Coin();
        addObject(coin,207,388);
        Coin coin3 = new Coin();
        addObject(coin3,140,558);
        Coin coin4 = new Coin();
        addObject(coin4,398,566);
        Coin coin5 = new Coin();
        addObject(coin5,246,251);
        coin3.setLocation(23,446);
        Coin coin6 = new Coin();
        addObject(coin6,418,40);
        coin6.setLocation(397,31);
        coin6.setLocation(389,31);
        coin6.setLocation(398,47);
        coin6.setLocation(389,38);
        coin2.setLocation(548,489);
        finish.setLocation(549,544);
        coin2.setLocation(540,487);
        finish.setLocation(551,544);
        removeObject(p1);
        P p = new P();
        addObject(p,43,568);
        removeObject(virus);
        Virus virus10 = new Virus();
        addObject(virus10,146,343);
        hole4.setLocation(404,143);
        hole4.setLocation(406,143);
        hole4.setLocation(400,139);
    }
}
