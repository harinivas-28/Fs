package Problems.java;
import java.util.*;
/*
Mr Toronto working with operators in programming language.
He is given statement S, which is a valid statement and consist of digits [0-9]
and characters '?', ':', 'Y', 'N', where Y indicates true and N indicates false.
And the statement contains only numbers with single digits.
(>=10 value is not allowed)

The operator '?' works as follows:
	- if S="Y?1:2" - as Y means true, it will return 1.
	- if S="N?1:2" - as N means false, it will return 2.

Your task is to help Mr Toronto to execute the statement S and return the result.
The result must be either a digit [0-9] or "Y" or "N".

Input Format:
-------------
A string S, a valid statement.

Output Format:
--------------
Print a string, the result of the statement S.


Sample Input-1:
---------------
Y?N?3:4:2

Sample Output-1:
----------------
4

Explanation:
------------
Given statement is Y?N?3:4:2 -> Y?(N?3:4):2
Y means "true", So you have to execute N?3:4
N means "false", So the answer is 4.


Sample Input-2:
---------------
N?Y?N?N:Y:N:Y

Sample Output-2:
----------------
Y

Explanation:
------------
Given statement is N?Y?N?N:Y:N:Y -> N?(Y?(N?N:Y):N):Y
N means "false", So the answer is Y.
 */
public class Day39P3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }
    private static String solve(String s){
        if(s.length()==1) return s;
        if(s.charAt(1)=='?') {
            int col = s.lastIndexOf(':');
            int qn = s.indexOf('?');
            String y = s.substring(qn + 1, col);
            String no = s.substring(col + 1);
            String exp = s.substring(0, qn);
            if (exp.equals("Y")) {
                return solve(y);
            } else {
                return solve(no);
            }
        }
        return "";
    }
}
