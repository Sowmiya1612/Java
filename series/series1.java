/*Write a program to generate the first n terms in the series 

0.5,1.5,4.5,13.5,...

 

INPUT FORMAT:

Input consists of a single integer which corresponds to n.

OUTPUT FORMAT:

Output consists of the terms in the series separated by a blank space.

SAMPLE INPUT:

5
SAMPLE OUTPUT:

0.5 1.5 4.5 13.5 40.5*/


  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float a = 0.5f;
		System.out.print(a);
		for(int i=1;i<n;i++){
		    a = a*3;
		    System.out.print(" " + a);
		}
	}
}
