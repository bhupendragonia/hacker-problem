import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        //scan.close();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


To take input of a integer we use nextInt() function, that does not read the new line character of your input. So, when we command nextLine() it will take it as new line and give you as a new line. That’s why the nextLine() command after the nextInt() command gets skipped.

So when we code like, this:

Scanner scan = new Scanner ( System.in );

id = scan.nextInt();

name =scan.nextLine();

age = scan.nextInt();

System.out.println( i +” , ” + st + “ , ” + j );

In above part of code, when we try to give input the second input line would be skipped.

So we can the problem by doing it like this:

Scanner scan = new Scanner ( System.in );

id = scan.nextInt();

scan.nextLine();

name =scan.nextLine();

age = scan.nextInt();

System.out.println( i +” , ” + st + “ , ” + j );
