package olympiads;

import java.util.*;
import java.io.*;

/*
 * Dorian Chen
 * May 8, 2021
 * https://dmoj.ca/problem/ccc16s5
 * XOR
 */

public class ccc16s5CircleofLife {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int N = readInt(); 
		long T = readLong();
		
		int arr [] = new int[N];
		String s = readLine();
		
		for (int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(s.charAt(i)+"");
		}
		
		int [] temp;
		
		for (int i=0;i<=50;i++) {
			temp = new int [N];
			if ( (T&(1L<<i))!=0) { //power of 2
				int R = (int)((1L<<i)%N);
				int L = (N-R)%N;
				
				for (int j=0;j<N;j++) {
					temp[j] = arr[(j+R)%N] ^ arr[(j+L)%N];
				}
				for (int j=0;j<N;j++) {
					arr[j]=temp[j];
				}
			}
		}
		for (int x:arr) {
			System.out.print(x);
		}
		System.out.println();
	}

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}
