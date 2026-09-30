import java.util.Scanner;
public class Name{
    public static void main(String[] args){
        int[] a= new int[5];
        Scanner inp = new Scanner(System.in);
        int maths = inp.nextInt();
        int physics = inp.nextInt();
        int chemistry = inp.nextInt();
        int computer = inp.nextInt();
        int english = inp.nextInt();
        a[0] = maths;
        a[1] = physics;
        a[2] = chemistry;
        a[3] = computer;
        a[4] = english;
        System.out.println("maths mark: "+a[0]);
        System.out.println("physics mark: "+a[1]);
        System.out.println("chemistry mark: "+a[2]);
        System.out.println("computer mark: "+a[3]);
        System.out.println("english mark: "+a[4]);
        System.out.println("The exam of the total marks is: "+(a[0]+a[1]+a[2]+a[3]+a[4]));
        inp.close();
    }
    
}