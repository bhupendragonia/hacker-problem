# hacker-problem
Hackerrank problem

hack1 explanation:-

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
