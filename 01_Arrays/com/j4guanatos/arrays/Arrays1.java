package com.j4guanatos.arrays;

import java.util.*;
import java.util.stream.*;
import java.io.*;

/** Old fashion can be this...
		int[] ints = {2,3,5,6};
		IntSummaryStatistics stream = IntStream.of(ints).summaryStatistics();
*/
public class Arrays1{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
        String input = stdin.nextLine();      
		IntSummaryStatistics stream = Arrays.stream(input.split(" "))
			.mapToInt(Integer::valueOf)
			.summaryStatistics();
		long min = stream.getMin();
		long max = stream.getMax();

		long missingNumber = parcialSum(max, false) - parcialSum(min, true) - stream.getSum();
		System.out.println(missingNumber);		
	}	

	private static long parcialSum(long number, boolean evalMin){
		int i = evalMin == true ? (-1) : 1;
		return (number*(number + i)/2);
	}
}