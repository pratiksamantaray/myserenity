package oops;

import interview.Interviewprep;
import org.htmlunit.csp.value.Hash;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static int findMaxSum(int[] arr, int k) {
        // Handle edge cases
        if (arr.length < k) {
            return 0;
        }

        // Step 1: Calculate the sum of the very first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window across the rest of the array
        for (int i = k; i < arr.length; i++) {
            // Subtract the element that's leaving and add the one coming in.
            // A comment to explain the magic:
            // windowSum = windowSum - arr[i-k] + arr[i];
            windowSum += arr[i] - arr[i - k];

            // Step 3: Update the maximum sum
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {






      /*  Pattern pattern = Pattern.compile("W3Schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");

        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
*/







        /*int[] data = {3, 5, 2, 7, 1, 8, 4};
        int k = 3;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=data[i];
        }
        int maxSum = sum;
        for(int i=k;i<data.length;i++){
            sum+=+data[i]-data[i-k];
            maxSum=Math.max(sum,maxSum);

        }
        System.out.println(maxSum);
*/







        //System.out.println("Maximum sum of a subarray of size " + k + " is: " + findMaxSum(data, k));
        // Output: 16 (from the subarray {7, 1, 8})
       /* ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int sum=0,sum1=0;

        int [] arr={1,1,3,};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                for (int k=0;j<arr.length;j++) {
                    String tempNum = arr[i] + "" + arr[j]+""+arr[k];
                    list.add(Integer.parseInt(tempNum));
                    set.add(Integer.parseInt(tempNum));
                }
            }
        }
        System.out.println(list);
        System.out.println(set);
        for (int num:list){
            sum+=num;
        }
        for (int num:set){
            sum1+=num;
        }

        System.out.println(sum);
        System.out.println(sum1);

*/
      //find different combainations of abc -




      /*  Map<Student, String> map = new HashMap<>();


// Creating objects of Student class
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(1, "Alice");

        map.put(student1,"p1");
        Student stu2=new Student(1, "Alice");
// Testing equals method
        System.out.println("student1.equals(student2): " +
                student1.equals(student2)); // Output: false
        System.out.println("student1.equals(student3): " +
                student1.equals(student3)); // Output: true

        System.out.println("Value for user2: " + map.get(stu2));
// Testing hashCode method
        System.out.println("Hashcode of student1: " + student1.hashCode());
        System.out.println("Hashcode of student2: " + student2.hashCode());
        System.out.println("Hashcode of student3: " + student3.hashCode());*/
    }
}
