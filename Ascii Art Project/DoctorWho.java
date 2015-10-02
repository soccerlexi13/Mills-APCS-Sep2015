
/**
 * Ascii Art Project - Draws Dalek & Tardis
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
    public static void drawTardis(int windowHeight, int windowRowsAfterFirst){
        //it's windowrowsafterfirst because first is different/necessary
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
        drawWindowTop();
        for (int i=1; i<=windowHeight; i++){
            //number of rows in window depends on the parameter windowHeight
            for (int j=1; j<=9; j++){
                System.out.print(" |");
                //paned windows have repeated pattern all the way across
            }
            System.out.println();
        }
        drawWindowBottom();
        for (int i=1; i<=windowRowsAfterFirst; i++){
            //total number of windows after first depends on parameter windowRowsAfterFirst
            drawWindowTop();
            for (int j=1; j<=windowHeight; j++){
                //middle rows of window repeated as many times as it is supposed to be tall
                drawWindowMiddle();
            }
            drawWindowBottom();
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
    public static void drawWindowTop(){
        System.out.print(" |");
        for (int i=1; i<=2; i++){
            System.out.print(" _____ |");
        }
        //pattern for top of window repeated
        System.out.println();
    }
    public static void drawWindowBottom(){
        for (int i=1; i<=2; i++){
            System.out.print(" | -----");
        }
        //bottom of window also has repeatable pattern
        System.out.println(" |");
    }
    public static void drawWindowMiddle(){
        for (int i=1; i<=2; i++){
            System.out.print(" | |   |");
        }
        System.out.println(" |");
        //middle of windows has repeated parts
    }
}
