package Problems.java;
/*
A crew of N players played a game for one time, and got some scores.
They have to stand in the same positions after they played the game.
 
There is a constraint that, the player-K score, should not be greater or smaller 
than both of his neighbors. To achieve this constraint, there are few steps 
to be followed as mentioned:
    	- If the score of player-K is smaller than both his neighbors,
    	  then his score is incremented by 1.
    	- If the score of player-K is greater than both his neighbors,
    	  then his score is decremented by 1.
    	- The first and last elements never change.
    	- Repeat these steps, until the constraint is satisified.
   
Your task is to find and print the resultant array of scores, after the constraint is achieved.
   
NOTE: Players are not allowed to swap their positions to achieve the constraint.
  
Input Format:
-------------
Line-1: An integer N, number of players.
Line-2: N space separated integers represemts scores of each player.
  
Output Format:
--------------
Print integer array, the resultant scores.
   
Sample Input-1:
---------------
6
4 3 5 2 6 3
  
Sample Output-1:
----------------
[4, 4, 4, 4, 4, 3]
   
   
Sample Input-2:
---------------
8
5 1 4 2 7 4 6 3
  
Sample Output-2:
----------------
[5, 3, 3, 3, 5, 5, 5, 3]
*/
import java.util.*;
public class Day11P1{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++) ar[i] = sc.nextInt();
        
        while(true){
            int flag = 0;
            int[] temp = ar.clone();
            for(int i=1;i<n-1;i++){
                if(ar[i] > ar[i-1] && ar[i] > ar[i+1]){
                    temp[i]--;
                    flag = 1;
                }
                if(ar[i] < ar[i-1] && ar[i] < ar[i+1]){
                    temp[i]++;
                    flag = 1;
                }
            }
            ar = temp;
            if(flag==0) break;
            
        }
        
        
        System.out.println(Arrays.toString(ar));
        sc.close();
    }
}