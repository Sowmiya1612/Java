/*Write a Java program to get 2 numbers from the user and calculate their sum and difference using '+' and '-' operators respectively.
Print the corresponding sum and difference of the numbers as output in the console.
Input format:
First input: an integer
Second input: an integer
Output format:
First output will be the sum of two integer
Second output will be the difference of two integers
Sample Input:
55
34
Sample Output:
89
21*/

import java.util.Scanner;
class Main
{
    public static void main(String args[])
        {
            // get input value from user
            int a;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            int b;
            b = sc.nextInt();
            System.out.println(a+b);
            System.out.println(a-b);
        }
}
