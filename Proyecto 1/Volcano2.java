import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Volcano2 extends World
{
    public static int scoreVolP1 = 0;
    public static int scoreVolP2 = 0;
    /**
     * Constructor for objects of class hola.
     * 
     */
    public Volcano2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    public void act()
    {
        showText("Score: " + scoreVolP1, 227, 580);
        showText("Score: " + scoreVolP2, 722, 580);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Futuristic2.countP1 = 0;
        Futuristic2.countP2 = 0;        
        scoreVolP1 = 0;
        scoreVolP2 = 0;
        Wall2 wall2 = new Wall2();
        addObject(wall2,806*50,450*50);
        Wall2 wall22 = new Wall2();
        addObject(wall22,694*50,348*50);
        Wall2 wall23 = new Wall2();
        addObject(wall23,766*50,265*50);
        wall2.setLocation(16*50,10*50);
        wall2.setLocation(17*50,11*50);
        wall22.setLocation(1*50,11*50);
        wall23.setLocation(1*50,10*50);
        wall2.setLocation(0*50,9*50);
        Wall2 wall24 = new Wall2();
        addObject(wall24,1*50,9*50);
        Wall2 wall25 = new Wall2();
        addObject(wall25,2*50,9*50);
        Wall2 wall26 = new Wall2();
        addObject(wall26,3*50,9*50);
        Wall2 wall27 = new Wall2();
        addObject(wall27,3*50,10*50);
        Wall2 wall28 = new Wall2();
        addObject(wall28,3*50,11*50);
        Wall2 wall29 = new Wall2();
        addObject(wall29,4*50,10*50);
        Wall2 wall210 = new Wall2();
        addObject(wall210,5*50,10*50);
        Wall2 wall211 = new Wall2();
        addObject(wall211,6*50,10*50);
        Wall2 wall212 = new Wall2();
        addObject(wall212,6*50,11*50);
        Wall2 wall213 = new Wall2();
        addObject(wall213,7*50,10*50);
        Wall2 wall214 = new Wall2();
        addObject(wall214,8*50,10*50);
        Wall2 wall215 = new Wall2();
        addObject(wall215,7*50,9*50);
        Wall2 wall216 = new Wall2();
        addObject(wall216,7*50,8*50);
        Wall2 wall217 = new Wall2();
        addObject(wall217,6*50,8*50);
        Wall2 wall218 = new Wall2();
        addObject(wall218,6*50,7*50);
        Wall2 wall219 = new Wall2();
        addObject(wall219,6*50,6*50);
        Wall2 wall220 = new Wall2();
        addObject(wall220,6*50,5*50);
        Wall2 wall221 = new Wall2();
        addObject(wall221,5*50,5*50);
        Wall2 wall222 = new Wall2();
        addObject(wall222,4*50,5*50);
        Wall2 wall223 = new Wall2();
        addObject(wall223,4*50,6*50);
        Wall2 wall224 = new Wall2();
        addObject(wall224,3*50,6*50);
        Wall2 wall225 = new Wall2();
        addObject(wall225,2*50,6*50);
        Wall2 wall226 = new Wall2();
        addObject(wall226,1*50,6*50);
        Wall2 wall227 = new Wall2();
        addObject(wall227,1*50,5*50);
        Wall2 wall228 = new Wall2();
        addObject(wall228,1*50,4*50);
        Wall2 wall229 = new Wall2();
        addObject(wall229,1*50,3*50);
        Wall2 wall230 = new Wall2();
        addObject(wall230,1*50,2*50);
        Wall2 wall231 = new Wall2();
        addObject(wall231,1*50,1*50);
        Wall2 wall232 = new Wall2();
        addObject(wall232,0*50,1*50);
        Wall2 wall233 = new Wall2();
        addObject(wall233,2*50,2*50);
        wall233.setLocation(2*50,3*50);
        Wall2 wall234 = new Wall2();
        addObject(wall234,3*50,3*50);
        wall233.setLocation(2*50,2*50);
        wall234.setLocation(3*50,2*50);
        Wall2 wall235 = new Wall2();
        addObject(wall235,3*50,3*50);
        Wall2 wall236 = new Wall2();
        addObject(wall236,4*50,2*50);
        Wall2 wall237 = new Wall2();
        addObject(wall237,4*50,1*50);
        Wall2 wall238 = new Wall2();
        addObject(wall238,5*50,1*50);
        Wall2 wall239 = new Wall2();
        addObject(wall239,6*50,1*50);
        Wall2 wall240 = new Wall2();
        addObject(wall240,7*50,1*50);
        Wall2 wall241 = new Wall2();
        addObject(wall241,7*50,0*50);
        Wall2 wall242 = new Wall2();
        addObject(wall242,8*50,0*50);
        Wall2 wall243 = new Wall2();
        addObject(wall243,9*50,0*50);
        Wall2 wall244 = new Wall2();
        addObject(wall244,10*50,0*50);
        Wall2 wall245 = new Wall2();
        addObject(wall245,11*50,0*50);
        Wall2 wall246 = new Wall2();
        addObject(wall246,11*50,1*50);
        Wall2 wall247 = new Wall2();
        addObject(wall247,11*50,2*50);
        Wall2 wall248 = new Wall2();
        addObject(wall248,10*50,2*50);
        Wall2 wall249 = new Wall2();
        addObject(wall249,10*50,3*50);
        Wall2 wall250 = new Wall2();
        addObject(wall250,10*50,4*50);
        Wall2 wall251 = new Wall2();
        addObject(wall251,10*50,5*50);
        Wall2 wall252 = new Wall2();
        addObject(wall252,9*50,5*50);
        Wall2 wall253 = new Wall2();
        addObject(wall253,9*50,6*50);
        Wall2 wall254 = new Wall2();
        addObject(wall254,9*50,7*50);
        Wall2 wall255 = new Wall2();
        addObject(wall255,9*50,8*50);
        Wall2 wall256 = new Wall2();
        addObject(wall256,10*50,8*50);
        Wall2 wall257 = new Wall2();
        addObject(wall257,11*50,8*50);
        Wall2 wall258 = new Wall2();
        addObject(wall258,11*50,9*50);
        Wall2 wall259 = new Wall2();
        addObject(wall259,11*50,10*50);
        Wall2 wall260 = new Wall2();
        addObject(wall260,11*50,11*50);
        Wall2 wall261 = new Wall2();
        addObject(wall261,12*50,8*50);
        Wall2 wall262 = new Wall2();
        addObject(wall262,12*50,7*50);
        Wall2 wall263 = new Wall2();
        addObject(wall263,12*50,9*50);
        Wall2 wall264 = new Wall2();
        addObject(wall264,12*50,10*50);
        Wall2 wall265 = new Wall2();
        addObject(wall265,12*50,11*50);
        Wall2 wall266 = new Wall2();
        addObject(wall266,19*50,9*50);
        Wall2 wall267 = new Wall2();
        addObject(wall267,18*50,9*50);
        Wall2 wall268 = new Wall2();
        addObject(wall268,17*50,9*50);
        Wall2 wall269 = new Wall2();
        addObject(wall269,16*50,9*50);
        Wall2 wall270 = new Wall2();
        addObject(wall270,16*50,10*50);
        Wall2 wall271 = new Wall2();
        addObject(wall271,16*50,11*50);
        Wall2 wall272 = new Wall2();
        addObject(wall272,18*50,10*50);
        Wall2 wall273 = new Wall2();
        addObject(wall273,18*50,11*50);
        Wall2 wall274 = new Wall2();
        addObject(wall274,15*50,10*50);
        Wall2 wall275 = new Wall2();
        addObject(wall275,14*50,10*50);
        Wall2 wall276 = new Wall2();
        addObject(wall276,19*50,1*50);
        Wall2 wall277 = new Wall2();
        addObject(wall277,18*50,1*50);
        Wall2 wall278 = new Wall2();
        addObject(wall278,18*50,2*50);
        Wall2 wall279 = new Wall2();
        addObject(wall279,18*50,3*50);
        Wall2 wall280 = new Wall2();
        addObject(wall280,18*50,4*50);
        Wall2 wall281 = new Wall2();
        addObject(wall281,18*50,5*50);
        Wall2 wall282 = new Wall2();
        addObject(wall282,18*50,6*50);
        Wall2 wall283 = new Wall2();
        addObject(wall283,17*50,6*50);
        Wall2 wall284 = new Wall2();
        addObject(wall284,16*50,6*50);
        Wall2 wall285 = new Wall2();
        addObject(wall285,15*50,6*50);
        Wall2 wall286 = new Wall2();
        addObject(wall286,15*50,5*50);
        Wall2 wall287 = new Wall2();
        addObject(wall287,14*50,5*50);
        Wall2 wall288 = new Wall2();
        addObject(wall288,17*50,2*50);
        Wall2 wall289 = new Wall2();
        addObject(wall289,16*50,2*50);
        Wall2 wall290 = new Wall2();
        addObject(wall290,16*50,3*50);
        Wall2 wall291 = new Wall2();
        addObject(wall291,15*50,2*50);
        Wall2 wall292 = new Wall2();
        addObject(wall292,15*50,1*50);
        Wall2 wall293 = new Wall2();
        addObject(wall293,14*50,1*50);
        Wall2 wall294 = new Wall2();
        addObject(wall294,13*50,1*50);
        Wall2 wall295 = new Wall2();
        addObject(wall295,12*50,1*50);
        wall246.setLocation(10*50,1*50);
        wall245.setLocation(12*50,0*50);
        Wall2 wall296 = new Wall2();
        addObject(wall296,11*50,0*50);
        wall247.setLocation(9*50,1*50);
        Wall2 wall297 = new Wall2();
        addObject(wall297,9*50,3*50);
        wall250.setLocation(9*50,4*50);
        wall254.setLocation(10*50,7*50);
        wall253.setLocation(10*50,6*50);
        wall254.setLocation(10*50,7*50);
        wall262.setLocation(9*50,9*50);
        wall214.setLocation(9*50,10*50);
        wall259.setLocation(10*50,10*50);
        wall260.setLocation(9*50,11*50);
        wall265.setLocation(10*50,11*50);
        wall258.setLocation(12*50,6*50);
        wall264.setLocation(13*50,10*50);
        wall263.setLocation(13*50,11*50);
        wall261.setLocation(12*50,10*50);
        wall257.setLocation(12*50,9*50);
        Wall2 wall298 = new Wall2();
        addObject(wall298,12*50,8*50);
        Wall2 wall299 = new Wall2();
        addObject(wall299,13*50,8*50);
        Wall2 wall2100 = new Wall2();
        addObject(wall2100,13*50,7*50);
        Wall2 wall2101 = new Wall2();
        addObject(wall2101,13*50,6*50);
        Wall2 wall2102 = new Wall2();
        addObject(wall2102,13*50,5*50);
        wall22.setLocation(50,574);
        Wall2 wall2103 = new Wall2();
        addObject(wall2103,50,574);
        wall2103.setLocation(50,583);
        wall22.setLocation(84,558);
        wall22.setLocation(-3,511);
        wall2103.setLocation(36,577);
        wall22.setLocation(50,541);
        wall2103.setLocation(50,583);
        Wall2 wall2104 = new Wall2();
        addObject(wall2104,150,584);
        wall2104.setLocation(154,584);
        wall2104.setLocation(158,578);
        wall2104.setLocation(150,584);
        Wall2 wall2105 = new Wall2();
        addObject(wall2105,300,582);
        wall2105.setLocation(300,582);
        Wall2 wall2106 = new Wall2();
        addObject(wall2106,450,582);
        Wall2 wall2107 = new Wall2();
        addObject(wall2107,500,582);
        Wall2 wall2108 = new Wall2();
        addObject(wall2108,650,582);
        Wall2 wall2109 = new Wall2();
        addObject(wall2109,800,582);
        Wall2 wall2110 = new Wall2();
        addObject(wall2110,900,582);
        Wall2 wall2111 = new Wall2();
        addObject(wall2111,996,450);
        Wall2 wall2112 = new Wall2();
        addObject(wall2112,996,50);
        wall242.setLocation(400,22);
        wall296.setLocation(549,36);
        wall296.setLocation(550,22);
        wall22.setLocation(50,544);
        P1 p1 = new P1();
        addObject(p1,34,548);
        wall2103.setLocation(33,577);
        wall22.setLocation(49,538);
        wall23.setLocation(36,497);
        wall22.setLocation(36,527);
        wall2103.setLocation(36,588);
        wall2103.setLocation(36,576);
        wall273.setLocation(902,530);
        P2 p2 = new P2();
        addObject(p2,977,550);
        wall272.setLocation(913,493);
        wall272.setLocation(977,491);
        wall273.setLocation(977,541);
        wall2110.setLocation(977,576);
        Coin coin = new Coin();
        addObject(coin,43,397);
        Coin coin2 = new Coin();
        addObject(coin2,354,574);
        wall223.setLocation(199,300);
        Coin coin3 = new Coin();
        addObject(coin3,194,292);
        Coin coin4 = new Coin();
        addObject(coin4,261,198);
        wall232.setLocation(18,50);
        Coin coin5 = new Coin();
        addObject(coin5,19,49);
        wall241.setLocation(360,21);
        Coin coin6 = new Coin();
        addObject(coin6,360,21);
        Coin coin7 = new Coin();
        addObject(coin7,448,307);
        Coin3 coin32 = new Coin3();
        addObject(coin32,937,400);
        Coin3 coin33 = new Coin3();
        addObject(coin33,596,571);
        Coin3 coin34 = new Coin3();
        addObject(coin34,502,201);
        Coin3 coin35 = new Coin3();
        addObject(coin35,704,204);
        wall285.setLocation(760,295);
        Coin3 coin36 = new Coin3();
        addObject(coin36,750,300);
        wall285.setLocation(757,316);
        wall285.setLocation(750,300);
        wall276.setLocation(974,50);
        Coin3 coin37 = new Coin3();
        addObject(coin37,974,50);
        wall276.setLocation(1013,87);
        wall276.setLocation(932,108);
        wall276.setLocation(988,64);
        wall2112.setLocation(977,50);
        wall276.setLocation(949,50);
        wall245.setLocation(594,22);
        Coin3 coin38 = new Coin3();
        addObject(coin38,594,22);
        Finish finish = new Finish();
        addObject(finish,536,440);
        finish.setLocation(490,572);
        Wall2 wall2113 = new Wall2();
        addObject(wall2113,412,574);
        wall2113.setLocation(412,580);
        finish.setLocation(528,580);
        Wall2 wall2114 = new Wall2();
        addObject(wall2114,528,580);
        wall260.setLocation(450,550);
        removeObject(finish);
        Finish finish2 = new Finish();
        addObject(finish2,552,548);
        finish2.setLocation(470,576);
        wall2114.setLocation(542,592);
        wall2113.setLocation(399,594);
        wall2113.setLocation(396,592);
        wall2113.setLocation(396,593);
        wall2106.setLocation(438,584);
        wall2113.setLocation(385,590);
        wall2106.setLocation(450,597);
        coin33.setLocation(584,574);
        wall2114.setLocation(521,582);
        wall2113.setLocation(402,579);
        wall2113.setLocation(402,579);
        wall2113.setLocation(418,582);
        wall28.setLocation(156,561);
        Monster monster = new Monster();
        addObject(monster,152,526);
        wall28.setLocation(150,546);
        wall213.setLocation(350,500);
        Monster monster2 = new Monster();
        addObject(monster2,358,501);
        wall220.setLocation(304,244);
        Monster monster3 = new Monster();
        addObject(monster3,304,244);
        wall220.setLocation(300,250);
        wall235.setLocation(155,140);
        Monster monster4 = new Monster();
        addObject(monster4,151,131);
        wall235.setLocation(150,146);
        wall249.setLocation(511,156);
        Monster monster5 = new Monster();
        addObject(monster5,508,156);
        wall249.setLocation(500,150);
        wall252.setLocation(444,251);
        Monster monster6 = new Monster();
        addObject(monster6,444,251);
        wall252.setLocation(450,249);
        wall256.setLocation(516,403);
        Monster monster7 = new Monster();
        addObject(monster7,507,403);
        wall256.setLocation(500,400);
        coin33.setLocation(593,572);
        coin33.setLocation(595,572);
        wall261.setLocation(608,500);
        Monster monster8 = new Monster();
        addObject(monster8,593,502);
        wall261.setLocation(600,500);
        wall270.setLocation(800,500);
        Monster monster9 = new Monster();
        addObject(monster9,800,524);
        removeObject(wall258);
        Monster monster10 = new Monster();
        addObject(monster10,648,245);
        wall2102.setLocation(645,242);
        wall2102.setLocation(650,250);
        wall290.setLocation(811,143);
        Monster monster11 = new Monster();
        addObject(monster11,803,127);
        wall290.setLocation(812,158);
        wall290.setLocation(802,146);
        wall226.setLocation(55,290);
        Monster monster12 = new Monster();
        addObject(monster12,46,304);
        wall226.setLocation(50,300);
        wall282.setLocation(911,299);
        Monster monster13 = new Monster();
        addObject(monster13,908,302);
        wall282.setLocation(900,300);
        wall259.setLocation(475,519);
        Coin2 coin22 = new Coin2();
        addObject(coin22,475,519);
        wall259.setLocation(473,500);
        wall259.setLocation(500,501);
        wall259.setLocation(482,521);
        removeObject(coin22);
        wall259.setLocation(475,518);
        Coin4 coin42 = new Coin4();
        addObject(coin42,475,518);
        wall259.setLocation(500,501);
    }
}