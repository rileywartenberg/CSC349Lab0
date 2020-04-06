//RunTimes class for lab0

import java.util.*;
import java.lang.System.*;

class RunTimes{

   public static void main(String[] args)
   {
      long startTime = 0, endTime = 0, runningTime;
      System.out.println("Logarithmic algorithm's running times:"); 
      startTime = nanoTime()/100000000;
      logarithmicAlgorithm(1000);
      endTime = nanoTime()/100000000;
      System.out.println("T(1000) = " + endTime - startTime);
      

   }



}