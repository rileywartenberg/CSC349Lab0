//Algorithms class for lab0

class Algorithms {

   public static void linearAlgorithm(long N)
   {
      int x;
      for(int i = 1; i <= N; i++)
         x = 1;     
   }

   public static void quadraticAlgorithm(long N)
   {
      int x;
      for(int i = 1; i <= N; i++)
      {
         for(int j = 1; j <= N; j++)
            x = 1;
      }
   }

   public static void cubicAlgorithm(long N)
   {
      int x;
      for(int i = 1; i <= N; i++)
      {
         for(int j = 1; j <= N; j++)
         {
            for(int k = 1; k <= N; k++)
               x = 1;
         }
      }
   }
 
   public static void logarithmicAlgorithm(long N)
   {
      int x;
      for(int i = N; i >= 1; i/2)
         x = 1;
   }

   public static void NlogNAlgorithm(long N)
   {
      int x;
      for(int i = 1; i <= N; i++)
      {
         for(int j = N; j >= 1; j/2)
            x = 1;
      }
   }





}
