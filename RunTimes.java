//RunTimes class for lab0

import java.util.*;
import java.lang.*;

class RunTimes{

   public static void main(String[] args)
   {
      Algorithms a = new Algorithms();
      long startTime = 0, endTime = 0, runningTime;
      System.out.println("Logarithmic algorithm's running times:"); 
      startTime = System.nanoTime()/100000000;
      a.logarithmicAlgorithm(1000);
      endTime = System.nanoTime()/100000000;
      System.out.println("T(1000) = " + (endTime - startTime));

   }



}
