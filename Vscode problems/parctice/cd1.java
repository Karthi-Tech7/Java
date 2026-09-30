import java.util.Scanner;
class list{
    public static void main(String arges[])
    {
        Scanner student_list = new Scanner(System.in);
        String name = student_list.nextLine();
        int age = student_list.nextInt();
        student_list.nextLine();
        String location = student_list.nextLine();
        System.out.println("My name is :"+name);
        System.out.println("My age is :"+age);
        System.out.print("My location is :"+location);

    }
}