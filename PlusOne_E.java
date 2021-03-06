/**
 * Given a non-negative number represented as an array of digits, 
 * <strong>plus one</strong> to the number.
 * 
 * The digits are stored such that the most significant digit is 
 * at the head of the list.
 * 
 * Tags: Array, Math
 */

 public class Solution {
 	public static void main(String[] args) {
 		int[] result = plusOne(new int[]{9, 9, 9, 9, 8});
        System.out.print("{ ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("}");
 	}


    public int[] plusOne(int[] digits) {
 		if (digits == null || digits.length == 0) {
 			return digits;
 		}       
 		int carry = 1;
 		for (int i = digits.length - 1; i >= 0; i--) {
 			int sum = digits[i] + carry;
 			digits[i] = sum % 10;
 			carry = sum / 10;
 		}
 		if (carry == 0) {
 			return digits;
 		} 
 		int[] result = new int[digits.length + 1];
 		result[0] = carry;
 		for (int i = 0; i < digits.length; i++) {
 			result[i + 1] = digits[i];
 		}
 		return result;
    }
}