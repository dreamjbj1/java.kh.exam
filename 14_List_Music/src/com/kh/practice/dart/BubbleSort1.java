package com.kh.practice.dart;

import java.util.Arrays;

public class BubbleSort1 {
	public static void main(String[] args) {
		// 버블정렬
				int[] arr = new int [] {3,2,5,1,6,8};
				System.out.println(Arrays.toString(arr));
				// 배열 ==> List
				System.out.print("[");
				for(int ar : arr) {
					System.out.print(ar);
					System.out.print(",");
				}
				System.out.println("]");
				for(int i = 0; i < arr.length-1; i++) {
					for(int j = 0; j < arr.length-1 - i; j++) {
						if(arr[j]  > arr[j+1] ) { // 오름차순        
							//if(arr[j]  < arr[j+1] ) { // 내림차순
							// SWAP
							int tmp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = tmp;
						}
					}
				}
				System.out.print("[");
				for(int ar : arr) {
					System.out.print(ar);
					System.out.print(",");
				}
				System.out.println("]");
			}
		
}
