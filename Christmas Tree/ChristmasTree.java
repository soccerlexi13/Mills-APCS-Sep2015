
/**
 * PP 3.1, draws a christmas tree using parameters
 * 
 * @author Alexis Scheerer
 * @version 9/28/15
 */
public class ChristmasTree
{
   public static void main(String[] args){
       drawTree(2, 5);
   }
   public static void drawTree(int numSegments, int segHeight){
       int minNumStars, starsInCurrentRow;
       //int maxNumStars;
       for (int i=1; i<=numSegments; i++){
           minNumStars=(2*i)-1;
           //maxNumStars=minNumStars+2*(segHeight-1);
           starsInCurrentRow=minNumStars;
           for(int j=1; j<=segHeight; j++){
               for (int k=1; k<=6-starsInCurrentRow/2; k++){
                   System.out.print(" ");
               }
               for (int m=1; m<=starsInCurrentRow; m++){
                    System.out.print("*");
               }
               System.out.println();
               starsInCurrentRow+=2;
            }
       }
       System.out.println("      *");
       System.out.println("      *");
       System.out.println("   *******");
   }
}
