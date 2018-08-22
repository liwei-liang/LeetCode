package day2;

public class MedianofTwoSortedArrays4 {
	public static void main(String[] args) {
		int[] nums1 = {};
		int[] nums2 = {1,2,3,4};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length1 = nums1.length;
		int length2 = nums2.length;
		int lengthTotal = length1 + length2;
		int left1 = 0;
		int left2 = 0;
		int right1 = length1 - 1;
		int right2 = length2 - 1;
		for (int i = 0; i < (lengthTotal - 1) / 2; i++) {
			if (left1 <= right1 && left2 <= right2) {
				int j = nums1[left1] < nums2[left2] ? left1++ : left2++;
			} else if (left1 > right1) {
				left2++;
			} else if (left2 > right2) {
				left1++;
			}
			if (right1 >= left1 && right2 >= left2) {
				int k = nums1[right1] > nums2[right2] ? right1-- : right2--;
			} else if (right1 < left1) {
				right2--;
			} else if (right2 < left2) {
				right1--;
			}
		}
		if (left1 > right1) {
			return (double) (nums2[left2] + nums2[right2]) / 2;
		} else if (left2 > right2) {
			return (double) (nums1[right1] + nums1[left1]) / 2;
		} else {
			return (double) (nums1[left1] + nums2[left2]) / 2;
		}
	}
}
