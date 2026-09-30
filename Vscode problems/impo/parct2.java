///import java.lang is package implicity the system class within java.lang 
// provides access to system resource
//System.out.print is part of the system class and represents the sandart output usully connect to the terminal
//by using System.out.print() you print text to the terminal
//import.lang.System; is add in defualt
//we are sending data from code to terminal using 'System'
//to send data from terminal to code we need 'scanner'
import java.util.Scanner;
class scanner_in{
    public static void main(String arges[])
    {
        Scanner karthi = new Scanner(System.in);
        int a = karthi.nextInt();
        int b = karthi.nextInt();
        int c = karthi.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        
        System.out.print("total adda value:"+d/e);

    }

}
