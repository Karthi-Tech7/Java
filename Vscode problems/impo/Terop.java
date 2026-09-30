//the ternary operator in java is a shorthand for the if-else statement and is used assign a value to a variable
//base on a condition is called 'ternary op'because it involves three parts
//contition:an expression that evalvates to true or false
//first value(is true):the value assigned if the condition is true
//2nd:the value assigned if the condi is false
//syn:vari=(condition)?valueiftrue:valueiffslse;

import java.util.Scanner;
class terpo
{
    public static void main(String arges[])
    {
        Scanner v1 = new Scanner(System.in);
        // boolean a = true;
        int b = v1.nextInt();
        int c = v1.nextInt();
        String greather = b>c?"yes":"no";
        System.out.print(greather);
    }
}