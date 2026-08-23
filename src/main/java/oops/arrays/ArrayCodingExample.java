package oops.arrays;


/*
🔹 Arrays

/*Commonly Asked questions:
1. Find second largest element
2. Move all zeros to the end
3. Find missing number in 1..n
4. Rotate an array by k positions
5. Remove duplicates from sorted array
6. Find pair with given sum
7. Find intersection of two arrays
8. Kadane’s Algorithm (max subarray sum)
9. Find leaders in an array
10.Sort 0s, 1s, and 2s (Dutch National Flag)

 */

public class ArrayCodingExample {

    /**
     * Input: arr[] = [12, 35, 1, 10, 34, 1]
     * Output: 34
     * Explanation: The largest element of the array is 35 and the second largest element is 34.
     * <p>
     * Input: arr[] = [10, 5, 10]
     * Output: 5
     * Explanation: The largest element of the array is 10 and the second largest element is 5.
     * <p>
     * Input: arr[] = [10, 10, 10]
     * Output: -1
     * Explanation: The largest element of the array is 10 there is no second largest element.
     *
     * @param number
     * @return int
     */
    public int findSecondLargestElementFromTheArray(int[] number) {

        if(number.length<2)
            return -1;

        int secondlargestElement = number[1];
        int largestElement = number[0];
        if(number[1]>number[0]){
            largestElement=number[1];
            secondlargestElement=number[0];
        }

        for (int i = 2; i < number.length; i++) {
            if (number[i] > largestElement) {
                int temp = largestElement;
                largestElement = number[i];
                secondlargestElement = temp;
            }
        }
        return secondlargestElement;

    }
}
