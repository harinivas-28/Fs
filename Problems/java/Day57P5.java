package Problems.java;
/*
Problem: 
--------
Write a Java code to identify the nth largest number without 
sorting the array


Sample Input:
-------------
4 2
3 1 5 2

Sample Output:
--------------
3

*/
import java.util.*;
public class Day57P5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(), n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<size;i++) pq.offer(sc.nextInt());
        while(n-->1){
            pq.poll();
        }
        System.out.println(pq.peek());
    }
}
