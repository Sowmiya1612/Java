/*Write a program to get 2 numbers from the user and calculate their product, quotient and remainder using '*', '/' and '%' operators respectively.
Print the corresponding product, quotient and remainder of the numbers as output in the console.
Input format:
First input: an integer
second input: an integer
Output format;
The first output will be the product of two integers
The second output will be the quotient
The third output will be the remainder
Sample Input:
50
10
Sample Output:
500
5
0*/

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // get the input from the user
        int a;  int b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
