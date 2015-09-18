/**
 * Print out an hourglass using nested for loops
 * 
 * @author Alexis Scheerer
 * @version 9/18/15
 */
public class Hourglass
{
   public static void main(String[] args){
       printBaseLine();
       for (int i=4; i>=1; i--){
           for(int j=1; j<=5-i; j++){
               System.out.print(" ");
           }
           System.out.print("\\");
           for (int k=1; k<=2*i; k++){
               System.out.print(":");
           }
           System.out.println("/");
       }
       System.out.println("     ||");
       for (int i=1; i<=4; i++){
           for(int j=1; j<=5-i; j++){
               System.out.print(" ");
           }
           System.out.print("/");
           for (int k=1; k<=2*i; k++){
               System.out.print(":");
           }
           System.out.println("\\");
       }
      printBaseLine();
   }
   public static void printBaseLine(){
       System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
   }
}
