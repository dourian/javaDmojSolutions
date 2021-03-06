package olympiads;

import java.util.*;
import java.io.*;

public class chrisCandy {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		long  k =readLong();
		List <Long> l = new ArrayList <Long> ();
		k+=1;
		long sum=0;
		for (long i=2, hi = k; i*i <=hi ;i++) {
			while (k%(i*1.0)==0) {
				l.add(i-1); k/=i; sum+=i-1;
			}
		}
		if (k!=1) {
			l.add(k-1); sum+=k-1;
		}
		if (sum>1e5) {
			System.out.println("Sad Chris"); return;
		}
		System.out.println(sum);
		for(int i=0; i<l.size(); i++) {
			long num = l.get(i);
			for(int j=0; j<num; j++)
				System.out.print(i+1 + " ");
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
