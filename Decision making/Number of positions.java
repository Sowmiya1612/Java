/*Peter stands in a line of 'n' people, but he doesn't know exactly which position he occupies. He can say that there are no less than 'a' people standing in front of him and no more than 'b' people standing behind him.
Write a program to find the number of different positions Peter can occupy..



INPUT FORMAT:
The input contains three integers.
The first line of the input consists of an integer, which corresponds to n.
The second line of the input consists of an integer, which corresponds to a.
The third line of the input consists of an integer, which corresponds to b (0 ≤ a, b < n ≤ 100).
OUTPUT FORMAT:

The output prints a single number — the number of the sought positions.
Refer to the sample input and output for formatting specifications. 
[Text in bold corresponds to the output].
SAMPLE INPUT & OUTPUT 1:
3
1
1
2
SAMPLE INPUT & OUTPUT 2:

5
2
3
3*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		//int x=n-b;
		   if((a>=0||a<=100)&&(b>=0||b<=100)){
            //int x=n-b;
            //if(x<b&&x>a){
            System.out.println((n-a));
		   }}}
