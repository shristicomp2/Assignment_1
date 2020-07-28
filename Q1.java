public class Q1
{
public static void printFloydTriangle(int rows)
 { int number = 1;
    System.out.print(rows);
     for (int i = 1; i <= rows; i++) 
     { 
         for (int j = 1; j <= i; j++) 
         { 
             System.out.print(number + " "); number++; 

            } 
        System.out.println();
        }
    }
}