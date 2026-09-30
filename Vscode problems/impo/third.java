// class forloop
// {
//     public static void main(String arges[])
//     {
//         for(int i=10;i>=1;i=i-1)
//         {

//                 System.out.println(i);
        
//         }
        
//     }
// }

//2loop
// import java.util.Scanner;
// class forloop
// {
//     public static void main(String arges[])
//     {
//           Scanner v1 = new Scanner(System.in);
//           System.out.println("entr value b:");
//           int a = v1.nextInt();
//           System.out.print("enter value a:");
//           int b = v1.nextInt();
//         //   System.out.print("entr value b:");
//           for (int i=a; i<=b; i=i+1)
//           {
//             System.out.println(i);

//           }
//           v1.close();
//     }
// }

//3rd loop

// import java.util.Scanner;
// class third
// {
//     public static void main(String [] args)
//     {
//         Scanner a = new Scanner(System.in);
//         System.out.println("enter the number input even:");
//         int even = a.nextInt();
//         System.out.println("enter the number input odd:");
//         int odd = a.nextInt();
//         for(int i=odd;i<=even;i=i+1)
//         {
//             if(i%2==0)
//             {
//                 System.out.println("even number"+i);
//             }
            
//         }
//         a.close();
//     }
// }

// 4 loop

// import java.util.Scanner;
// class four
// {
//     public static void main(String [] args)
//     {
//         int oddcount =0;
//         Scanner a = new Scanner(System.in);
//         System.out.println("enter the number input odd:");
//         int even = a.nextInt();
//         System.out.println("enter the number input even:");
//         int odd = a.nextInt();
//         for(int i=odd;i<=even;i=i+1)
//         {
//             if(i%2==0)
//             {
//                 // System.out.println("even number"+i);
//             }
//             else{
            
//                 oddcount = oddcount+1;
                
//                 System.out.println("odd number:"+i);
//             }
            
//         }
//         System.out.println("odd count:"+oddcount);

//         a.close();
//     }
// }

// 5 loop

import java.util.Scanner;
class five
{
    public static void main(String [] args)
    {
        int a=1;
        int b=100;
        for(int i=a;i<=b;i=i+1)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("divided by both 3 and 5 value:"+i);
            }
            // if(i%5==0)
            // {
            //     System.out.println("divided by 5 value"+i);
            // }
            // else
            // {
            //     System.out.println("not divided value"+i);
            // }

        }
    }

}