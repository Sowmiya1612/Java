/*Xinyou has been trained to drive now. Dr. Dexter wants to get to a National Conference to present Xinyou. The venue of the conference is x kms away from his workshop. He wants to know if Xinyou will be able to make it to the conference on time if he travels at y kms/h.
Write a C program module that checks if he will be able to make it to the conference on time.
INPUT & OUTPUT FORMAT: 
Input consists of 4 lines.
The first line of input is a floating point number corresponding to the distance 'd'. 0 < d < 32767.
The second line of input is a floating point number corresponding to the speed 's'. 0 < s < 32767.
The third line of input is a floating point number corresponding to the time at which the conference begins – 'ti'. 
The fourth line of input is a floating point number corresponding to the current time, 'tj'.
'ti' and 'tj'  are strictly in the 'hh.mm' format (tj<ti).
Output consists of a single string 'Yes', 'No' or 'Invalid Input'.
SAMPLE INPUT & OUTPUT 1:
100
25
16.00
10.00
Yes
 SAMPLE INPUT & OUTPUT 2:
150
50
10.00
16.00
Invalid Input
SAMPLE INPUT & OUTPUT 3:
100
25
14.00
10.00
No*/

  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		double s = sc.nextDouble();
		String i = sc.next();
		String c = sc.next();
		//string to  int
		int sh = Integer.parseInt(i.split(":")[0]);
		int sm = Integer.parseInt(i.split(":")[1]);
		int ch = Integer.parseInt(c.split(":")[0]);
		int cm = Integer.parseInt(c.split(":")[1]);
		//total travel time
		double traveltime  = (d/s)*60;
		int ttc = (sh-ch)*60+(sm-cm);
		if(traveltime<=0 || ttc<=0){
		    System.out.println("Invalid Input");
		} 
		else if(traveltime<=ttc){
		    System.out.println("Yes");
		}
		else
		    System.out.println("No");
	}
}
