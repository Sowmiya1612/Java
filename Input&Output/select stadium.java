/*There are more than 20 cricket stadium allotted for the India's Biggest Cricket Tournament (IPL). All the stadiums are having different name. You will remember only one stadium name during the match only. So, you need to get the stadium name from the tournament management and print the stadium name for the players too.

Input Format:
Input value consists of a String.

Output Format:
Output value consists of a String.

Sample Input:
Wankhede Stadium

Sample Output:
Today's match will be held at Wankhede Stadium*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //get a input value as string from the user
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        System.out.println("Today's match will be held at "+a);
    }
}
