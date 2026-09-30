// public class Return {
//     public int sum(int a, int b)
//     {
//         int rem = a + b;
//         return rem;
//     }
//     public static void main(String[] args){
//         Return a = new Return();
//         int total = a.sum(20,10);
//         System.out.println("total value is:"+total);
//     }
    
// }

//code 

import java.util.Scanner;
class School{
    public String passorfail(int p)
    {
        if (p>=35)
        {
            return "pass";
        }
        else
        {
            return "fail";
        }
    }
    public static void main(String[] args){
        School a = new School();
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        sc.close();
        System.out.println("Student is :"+p);
        System.out.println("Result is :"+a.passorfail(p));
    }
}