package com.greatlerning.Currency.model;

import java.util.Arrays;

public class CurrencyDenomination {
		
	public static void mergeSort(int[] array) {
			splitAndMerge(array, 0, array.length - 1);
		}
		private static void splitAndMerge(int[] array, int left, int right) {
			if (left < right) {
				int mid = (left + right) / 2;
				splitAndMerge(array, left, mid);
				splitAndMerge(array, mid+1, right);
				merge(array, left, mid, right);
			}
		}
		private static void merge(int[] array, int left, int mid , int right) {
			int n1 = mid - left + 1;	// size of the left array
			int n2 = right - mid;		// size of the right array
			int[] leftArray = new int[n1];
			int[] rightArray = new int[n2];
			for (int i = 0; i < n1; i++) {
				leftArray[i] = array[left + i];
			}
			for (int i = 0; i < n2; i++) {
				rightArray[i] = array[mid + 1 + i];
			}
			int i = 0, j = 0;
			int k = left;
			while (i < n1 && j < n2) {
				if (leftArray[i] < rightArray[j]) {
					array[k++] = leftArray[i++];
				} else {
					array[k++] = rightArray[j++];
				}
			}
			while (i < n1) {
				array[k++] = leftArray[i++];
			}
			while (j < n2) {
				array[k++] = rightArray[j++];
			}
	}

	}


