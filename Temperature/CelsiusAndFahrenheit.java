/**
 * Converts Celsius to Fahrenheit
 * 
 * @author Alexis Scheerer
 * @version 9/8/15
 */
public class CelsiusAndFahrenheit
{
    public static void main(String args[]){
        double fahr=98.6;
        //assigns a value to fahr, would be better if we could use parameters, wouldn't have to change
        double cels=(5.0/9.0)*(fahr-32);
        //converts the fahrenheit to celsius, sets that value to cels variable
        System.out.println(cels);
    }
}
