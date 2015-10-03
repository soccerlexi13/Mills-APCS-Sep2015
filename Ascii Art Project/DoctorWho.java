/**
 * Ascii Art Project - Draws Tardis; number of segments and segment height can be changed
 * 
 * @author Alexis Scheerer
 * @version 10/1/15
 */
public class DoctorWho
{
    public static void main(String[] args){
        drawTardis(3, 2);
        drawTardis(2, 1);
        drawTardis(1, 3);
    }
    public static void drawTardis(int segmentHeight, int segmentRowsAfterFirst){
        //it's segmentrowsafterfirst because first is different/necessary
        drawSpaces(9);
        System.out.println("-");
        drawSpaces(8);
        System.out.println("---");
        drawSpaces(8);
        System.out.println("| |");
        drawSingleLineAcross();
        System.out.println("||  POLICE  BOX  ||");
        drawSingleLineAcross();
        //top of tardis is unique, can't simplify besides spaces
        drawSegmentTop();
        for (int i=1; i<=segmentHeight; i++){
            //number of rows in segment depends on the parameter segmentHeight
            for (int j=1; j<=9; j++){
                System.out.print(" |");
                //paned window segment has repeated pattern all the way across
            }
            System.out.println();
        }
        drawSegmentBottom();
        for (int i=1; i<=segmentRowsAfterFirst; i++){
            //total number of segments after first depends on parameter segmentRowsAfterFirst
            drawSegmentTop();
            for (int j=1; j<=segmentHeight; j++){
                //middle rows of segment repeated as many times as it is supposed to be tall
                drawSegmentMiddle();
            }
            drawSegmentBottom();
        }
        for (int i=1; i<=19; i++){
            System.out.print("=");
            //bottom of tardis
        }
        System.out.println();
    }
    public static void drawSpaces(int numSpaces){
        //useful function that prints a specified number of spaces on a single line
        for (int i=1; i<=numSpaces; i++){
            System.out.print(" ");
        }
    }
    public static void drawSingleLineAcross(){
        for (int i=1; i<=19; i++){
            System.out.print("-");
        }
        //for loop to draw lines in top portion, just repeated -
        System.out.println();
    }
    public static void drawSegmentTop(){
        System.out.print(" |");
        for (int i=1; i<=2; i++){
            System.out.print(" _____ |");
        }
        //pattern for top of segment repeated
        System.out.println();
    }
    public static void drawSegmentBottom(){
        for (int i=1; i<=2; i++){
            System.out.print(" | -----");
        }
        //bottom of segment also has repeatable pattern
        System.out.println(" |");
    }
    public static void drawSegmentMiddle(){
        for (int i=1; i<=2; i++){
            System.out.print(" | |   |");
        }
        System.out.println(" |");
        //middle of segment has repeated parts
    }
}
