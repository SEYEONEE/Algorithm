package study;

import java.util.*;
import java.io.*;

public class B1202 {
   public static void main(String[] args) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(bf.readLine());
      
      int N = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());
      jewelry[] jw = new jewelry[N];
      int[] C = new int[K];
      
      for(int i=0; i<N; i++) {
    	  st = new StringTokenizer(bf.readLine());
    	  jw[i] = new jewelry(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
      }
      
      for(int i=0; i<K; i++) {
    	  st = new StringTokenizer(bf.readLine());
    	  C[i] = Integer.parseInt(st.nextToken());
      }
      
      Arrays.sort(jw);
      Arrays.sort(C);
      
      Queue<Integer> q = new PriorityQueue<Integer>();
      int sum =0; 
      int i=0, j =0;
      for(i=0; i<K; i++) {
          while( j < N && jw[j].M <= C[i]) { 
              q.offer(-jw[j].V);
              j++;
          }
          if(!q.isEmpty()) { 
        	  sum+=Math.abs(q.poll());
          }
      }
      System.out.println(sum);
   }
}
 
   class jewelry  implements Comparable<jewelry>{
	      int M;
	      int V;
	      
	      public jewelry(int M, int V) {
	         this.M = M;
	         this.V = V;
	      }
	      
	      public int compareTo(jewelry j) {
	      	return this.M - j.M;
	      }
   }
   
	
