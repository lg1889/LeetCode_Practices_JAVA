/**
 * Given a sorted array of integers, find the starting and ending position of a
 * given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 * 
 * Tags: Array, Binary Search
 */

public class Solution {
	public static void main(String[] args) {
        
    }

    

 	/**
     * Do binary search on left and right
     */
    public int[] searchRange(int[] A, int target) {
    	int[] result = new int[2];
    	int start = 0;
    	int end = A.length - 1;
    	int mid;
    	while (start + 1 < end) {
    		mid = start + (end - start) / 2;
    		if (A[mid] == target) {
    			end = mid;
    		} else if (A[mid] < target) {
    			start = mid;
    		} else {
    			end = mid;
    		}
    	}
    	if (A[start] == target) {
    		result[0] = start;
    	} else if (A[end] == target) {
    		result[0] = end;
    	} else {
    		result[0] = result[1] = -1;
    		return result;
    	}
    	start = 0;
    	end = A.length - 1;
    	while (start + 1 < end) {
    		mid = start + (end - start) / 2;
    		if (A[mid] == target) {
    			start = mid;
    		} else if (A[mid] < target) {
    			start = mid;
    		} else {
    			end = mid;
    		}
    	}
    	if (A[end] == target) {
    		result[1] = end;
    	} else if (A[start] == target) {
    		result[1] = start;
    	} else {
    		result[0] = result[1] = -1;
    		return result;
    	}
    	return result;
    }
}