package study;

import java.util.Scanner;
import java.util.Arrays;

public class B13164 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int K = scan.nextInt();
      int count =0;
      int height[] = new int[N];
      int distance[] = new int[N-1];
      
      for(int i=0; i<N; i++)
         height[i] = scan.nextInt();
      
      for(int i=1; i<=N-1; i++)
         distance[i-1] = height[i] - height[i-1];
      
      Arrays.sort(distance);
      
      for(int i=0; i<N-K; i++)
         count += distance[i];
      
      System.out.println(count);
   }
}