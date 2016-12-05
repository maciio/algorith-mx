package com.j4guanatos.arrays;

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Arrays2{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String minMax = stdin.nextLine();
        String input = stdin.nextLine();
        int iMin = Integer.valueOf(minMax.split(" ")[0]);
        int jMax = Integer.valueOf(minMax.split(" ")[1]);

        int[] arr = Stream.of(input.split(" ")).mapToInt(Integer::valueOf).sorted().toArray();
        System.out.println("i(th) minimum" + arr[iMin-1]);
        System.out.println("j(th) maximum" + arr[arr.length - jMax]);
    }
}