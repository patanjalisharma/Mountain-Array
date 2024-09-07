//This code will only run on leetcode on Question no. 852
//Commented code below will run on any editor.

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }
}

//Code to Run on Editor

/* public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 4, 0};
        int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while (start < end) {


            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }
}

*/

