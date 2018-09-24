/*
   @Author: Coglianese ed
      Date: Oct 2, 2006
   Teacher:
       Lab:
      Misc: based on work by C. Nelson
  */

import kareltherobot.*;

public class KarelCH6_4Test extends KTest implements Directions
{
    public KarelCH6_4Test (String name)
    {
    		super(name);
   	}
   	
   	private VeryDangerousRobot alice;

   	public void setUp()
   	{
   		 World.reset();
   		 World.setDelay(1);
   		 World.setVisible(false);    			
   		 World.setTrace(false);
   	}
   	
    public void testOdd()
    {    
		 World.readWorld("ch6_4b.kwld");  		 
         alice = new VeryDangerousRobot(5, 5, North, 0);
         alice.moveIntoRobotHeaven();
         assertState(alice, 5,  5, North, false);
		 assertBeepersAt(5, 4, 0);
    }
    
    public void testEven()
    {
		 World.readWorld("ch6_4a.kwld");  		 
         alice = new VeryDangerousRobot(5, 5, North, 0);
         alice.moveIntoRobotHeaven();
         assertState(alice, 5, 5, North, false);
		 assertBeepersAt(5, 6, 0);    
	}

}
