package olympiads;

/*
 * Dorian Chen
 * Feb 7 2021
 * https://dmoj.ca/problem/ccc15j5
 * DP
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ccc15j5piday {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	static int [][][] dp;
	public static void main(String[] args) throws IOException {
		int n = readInt();
		int k = readInt();
		dp = new int [n+1][k+1][n+1];
		if (n==k)System.out.println(1);
		else {
			way(n,k,1);
			System.out.println(dp[n][k][1]);
		}
	}
	public static int way (int n, int k, int m) {
		if (dp[n][k][m] != 0) return dp[n][k][m];
		if (k==1) return dp[n][k][m]=1;
		for (int i = m;i<=n/k;i++) {
			dp[n][k][m] += way(n-i,k-1,i);
		}
		return dp[n][k][m];
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
