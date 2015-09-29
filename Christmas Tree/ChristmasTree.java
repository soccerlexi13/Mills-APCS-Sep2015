/**
 * PP 3.1, draws a christmas tree using parameters
 * 
 * @author Alexis Scheerer
 * @version 9/28/15
 */
public class ChristmasTree
{
   public static void main(String[] args){
       drawTree(6, 8);
   }
   public static void drawTree(int numSegments, int segHeight){
       int minStarsInSeg, starsInCurrentRow;
       int maxNumStars=(2*numSegments-1)+2*(segHeight-1);
       //initialized outside because it never changes
       for (int currentSeg=1; currentSeg<=numSegments; currentSeg++){
           minStarsInSeg=(2*currentSeg)-1;
           starsInCurrentRow=minStarsInSeg;
           for(int currentRow=1; currentRow<=segHeight; currentRow++){
               drawSpaces((maxNumStars-starsInCurrentRow)/2); 
               //spaces rely on the biggest row of stars because everything not that will be spaced
               for (int i=1; i<=starsInCurrentRow; i++){
                    System.out.print("*");
               }
               System.out.println();
               starsInCurrentRow+=2;
               //needs to be incremented by two and not one because that's how the tree grows
            }
       }
       //below here, prints base
       for (int i=1; i<=2; i++){
           drawSpaces(maxNumStars/2);
           System.out.println("*");
       }
       drawSpaces(maxNumStars/2-3);
       System.out.println("*******");
   }
   public static void drawSpaces(int numSpaces){
       //reduces/simplifies code by making method to draw spaces
       for (int i=1; i<=numSpaces; i++){
           System.out.print(" ");
       }
   }
}