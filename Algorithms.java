//Algorithms class for lab0
import java.lang.*;
import java.util.*;

class Algorithms {

   public static void linearAlgorithm(long N)
   {
      int x;
      for(long i = 1; i <= N; i++)
         x = 1;     
   }

   public static void quadraticAlgorithm(long N)
   {
      int x;
      for(long i = 1; i <= N; i++)
      {
         for(long j = 1; j <= N; j++)
            x = 1;
      }
   }

   public static void cubicAlgorithm(long N)
   {
      int x;
      for(long i = 1; i <= N; i++)
      {
         for(long j = 1; j <= N; j++)
         {
            for(long k = 1; k <= N; k++)
               x = 1;
         }
      }
   }
 
   public static void logarithmicAlgorithm(long N)
   {
      int x;
      for(long i = N; i >= 1; i = i/2)
         x = 1;
   }

   public static void NlogNAlgorithm(long N)
   {
      int x;
      for(long i = 1; i <= N; i++)
      {
         for(long j = N; j >= 1; j = j/2)
            x = 1;
      }
   }


   public static void main(String[] args){
      System.out.println("Logarithmic algorithm's running times:" + System.nanoTime()); 
      linearAlgorithm(1000);
      System.out.println(System.nanoTime());
      
   }  


}
