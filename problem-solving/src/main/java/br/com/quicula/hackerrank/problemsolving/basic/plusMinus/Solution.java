package br.com.quicula.hackerrank.problemsolving.basic.plusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
	
	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */
	
	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		final long total = arr.size();
		System.out.printf("%.6f%n", arr.stream().filter(i -> i > 0).count() / (double) total);
		System.out.printf("%.6f%n", arr.stream().filter(i -> i < 0).count() / (double) total);
		System.out.printf("%.6f%n", arr.stream().filter(i -> i == 0).count() / (double) total);
	}
	
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());
		
		Result.plusMinus(arr);
		
		bufferedReader.close();
	}
}
