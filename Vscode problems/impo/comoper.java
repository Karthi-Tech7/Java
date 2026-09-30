//operator which is used to compare two value 5>4
//here > is a comparison operator here we are comparing two value

// import java.util.Scanner;
// class cp{
//     public static void main(String arges[])
//     {
//         int a = 10;
//         int b = 20;
//         boolean c = a>b;

//         System.out.print(c);
//     }
// }

// how to compare two strings
//in java when you compare tow strings with '==' it checks for the references rather than comparing the actual 
// content value inside them .so,if you want to compare the content between two strings,always use the equal()function.
//stack=>int values store,heep=>object,stringpool=>store string

import java.util.Scanner;
class strcom{
    public static void main(String arges[])
    {
        String f1 = new String("name");  //newcreate sparate object create so sting value not match its compare to reference
        String f2 = new String("name");

        // String n1 = "king";
        // String n2 = "king";

        // System.out.print(f1==f2);
        // System.out.print(n1==n2);
        System.out.print(f1.equals(f2)); //still if compare aslo use new key to compare the string use'f1.equals(f2)'
        System.out.print(f1==f2);
    }
}