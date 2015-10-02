
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
        drawWindowTop();
        for (int i=1; i<=windowHeight; i++){
            for (int j=1; j<=9; j++){
                System.out.print(" |");
            }
            System.out.println();
        }
        drawWindowBottom();
        for (int i=1; i<=windowRowsAfterFirst; i++){
            drawWindowTop();
            for (int j=1; j<=windowHeight; j++){
                drawWindowMiddle();
            }
            drawWindowBottom();
        }
        for (int i=1; i<=19; i++){
            System.out.print("=");
        }
    }
    public static void drawSpaces(int numSpaces){
        for (int i=1; i<=numSpaces; i++){
            System.out.print(" ");
        }
    }
    public static void drawSingleLineAcross(){
        for (int i=1; i<=19; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void drawWindowTop(){
        System.out.print(" |");
        for (int i=1; i<=2; i++){
            System.out.print(" _____ |");
        }
        System.out.println();
    }
    public static void drawWindowBottom(){
        for (int i=1; i<=2; i++){
            System.out.print(" | -----");
        }
        System.out.println(" |");
    }
    public static void drawWindowMiddle(){
        for (int i=1; i<=2; i++){
            System.out.print(" |");
        }
        System.out.print("  ");
        for (int i=1; i<=3; i++){
            System.out.print(" |");
        }
        System.out.print("  ");
        for (int i=1; i<=2; i++){
            System.out.print(" |");
        }
        System.out.println();
    }
}
