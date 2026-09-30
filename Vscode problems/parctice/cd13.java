// import java.util.Scanner;
// class cd3{
//     public static void main(String arges[])
//     {
//         Scanner result = new Scanner(System.in);
//         int mark = result.nextInt();
//         if (mark>=35)
//         {
//             System.out.print("pass");
//         }
//         else
//         {
//             System.out.print("failse");
//         }
//     }
// }

//cd4

// import java.util.Scanner;
// class cd4{
//     public static void main(String arges[])
//     {
//         Scanner schp = new Scanner(System.in);
//         int income = schp.nextInt();
//         if (income>=7000)
//         {
//             System.out.print("your eligible");
//         }
//         else
//         {
//             System.out.print("your not eligible");
//         }
//     }
// }

//5cd

// import java.util.Scanner;
// class cd5{
//     public static void main(String arges[])
//     {
//         Scanner num = new Scanner(System.in);
//         int income = num.nextInt();
//         // double a = income%3;
//         // double b = income%5;
//         // int c = (a && b);
//         if (income%3 == 0 && income%5)
//         {
//             System.out.print("it's divisible");
//         }
//         else
//         {
//             System.out.print("it's not divisible");
//         }
//     }
// }

//6cd

// import java.util.Scanner;
// class cd6{
//     public static void main(String arges[])
//     {
//         Scanner num = new Scanner(System.in);
//         int income = num.nextInt();
//         if (income%2==0)
//         {
//             System.out.print("even");
//         }
//         else
//         {
//             System.out.print("odd");
//         }
//     }
// }

//cd7

// import java.util.Scanner;
// class cd7{
//     public static void main(String arges[])
//     {
//         Scanner game = new Scanner(System.in);
//         int score = game.nextInt();
//         System.out.println("your game score:"+score);

//         if (score<50)
//         {
//             System.out.print("you need to improve");
        
//         }
//         else if(score>50 && score<70)
//         {
//             System.out.print("good job");
//         }
//         else if(score>70)
//         {
//             System.out.print("excellent works");
//         }

//     }
// }

// cd8

// import java.util.Scanner;
// class cd8{
//     public static void main(String arges[])
//     {
//         Scanner marks = new Scanner(System.in);
//         int tam  = marks.nextInt();
//         int eng  = marks.nextInt();
//         int math = marks.nextInt();
//         int sci  = marks.nextInt();
//         int soc  = marks.nextInt();
//         int a = tem+eng+math+sci+soc;
//         int b = a/5

//         if (b<35 )
//         {
//             System.out.println("addition class is required");
//         }
//         else
//         {
//             System.out.println("your good to go ")
//         }
//     }
// }

//cd9

// import java.util.Scanner;
// class cd9
// {
//     public static void main(String arges[])
//     {
//         Scanner traffic = new Scanner(System.in);
//         String t1 = traffic.nextLine();
//         // String t2 = traffic.nextLine();  
//         // String t3= traffic.nextLine();  

//         if(t1.equals("red"))
//         {
//             System.out.print("stop");
//         }
//         else if (t1.equals("yellow"))
//         {
//             System.out.print("ge ready");
//         }
//         else if(t1.equals("green"))
//         {
//             System.out.print("go");
//         }
//     }
// }
    
//cd10

// import java.util.Scanner;
// class cd10
// {
//     public static void main(String arges[])
//     {
//         Scanner loan = new Scanner(System.in);
//         int salary = loan.nextInt();
//         int age    = loan.nextInt();

//         if(salary>=20000 && age<=25)
//         {
//             System.out.print("your eligible");
//             int amount = loan.nextInt();
//             if(amount<=50000)
//             {
//                 System.out.print("your eligible fo loan");
//             }
//             else
//             {
//                 System.out.print("max loan amount is 50000");
//             }
//         }
//         else
//         {
//             System.out.print("your not eligible for this loan");
//         }
//     }
// }

//cd11

// import java.util.Scanner;
// public class cd11{
//     public static void main(String[] args)
//     {
//         Scanner al = new Scanner(System.in);
//         int[] a =new int[5];

//         for(int i=0;i<4;i=i+1)
//         {
//             a[i] = al.nextInt();
            
//         }
//         for(int i=0;i<4;i=i+1)
//         {
//            System.out.println(a[i]);

//         }
//     }
// }

//cd12

// public class cd12{
//     public static void main(String[] args)
//     {
//         for(int i=1;i<=10;i=i+1)
//         {
//             System.out.println("2*"+i+" = "+(2*i));
//         }
//     }
// }

//cd13

import java.util.Scanner;
public class cd13{
    public static void main(String[] args)
    {
        Scanner mark = new Scanner(System.in);
        int n = mark.nextInt();
        int[] a =new int[n];

        for(int i=0;i<n-1;i=i+1)
        {
            a[i] = mark.nextInt();
            
        }
        System.out.println("middle number:"+a[n/2]);
        mark.close();

    } 
}