/**
 * PP 2.1 from the textbook
 * 
 * @author Alexis Scheerer 
 * @version 9/21/15
 */
public class StarAndSlashFigure
{
   public static void main(String[] args){
       for(int i=6; i>=0; i--){
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           for(int k=1; k<=7-i; k++){
               System.out.print(" ");
           }
           // repeated later, does **__ part
           for(int m=1; m<=i*2; m++){
               System.out.print("/");
           }
           for(int n=1; n<=(6-i)*2; n++){
               System.out.print("\\");
           }
           for(int k=1; k<=7-i; k++){
               System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           //repeat of earlier, but reverse to create __** part
           System.out.println();
       }
   }
}
