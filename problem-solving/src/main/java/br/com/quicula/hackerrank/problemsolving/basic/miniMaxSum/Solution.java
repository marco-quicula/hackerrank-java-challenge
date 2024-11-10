package br.com.quicula.hackerrank.problemsolving.basic.miniMaxSum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
	
	/*
	 * Complete the 'miniMaxSum' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */
	
	public static void miniMaxSum(List<Integer> arr) {
		// Write your code here
		long sum = arr.stream().mapToLong(Integer::longValue).sum();
		long min = arr.stream().mapToLong(Integer::longValue).min().orElse(0);
		long max = arr.stream().mapToLong(Integer::longValue).max().orElse(0);
		System.out.printf("%d %d%n", sum - max, sum - min);
	}
	
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());
		
		Result.miniMaxSum(arr);
		
		bufferedReader.close();
	}
}
