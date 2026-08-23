package interview;// Replace ___ with your code
// import necessary classes from the Java standard library
import org.htmlunit.corejs.javascript.ArrayLikeAbstractOperations;

import java.util.*;

// Define the Main class
class Practice {

    /*
    * Input: arr[] = [1, 2, 3, 4, 5, 6], k = 2
Output: [5, 6, 1, 2, 3, 4]
*
* 65 4321
* 56 1234
* 6 5 4 3 21
* reverse array
Explanation:*/

    public static void main(String[] args) {
    String name="success";



    char[] charArray=name.toCharArray();

    Map<Character,Integer> map =new HashMap<>();

    for(char c:charArray){
        map.put(c,map.getOrDefault(c,0)+1);

    }

    print(map);


    int leftIndex=0;
    int rightmostIndex=charArray.length-1;
    while(leftIndex<rightmostIndex){

        char temp=charArray[rightmostIndex];
        charArray[rightmostIndex]=charArray[leftIndex];
        charArray[leftIndex]=temp;
        leftIndex++;
        rightmostIndex--;




    }

    //print(Arrays.toString(charArray).replace(',',''));







       // ArrayList<Integer> maxcount = new ArrayList<>();
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr1 = {1, 2, 3, 5,4};
//
//        int a=1283;
//        int b=1283   ;
      // print(((Integer) a).hashCode()==((Integer) b).hashCode());
//        Arrays.sort(arr);
//        Arrays.sort(arr1);
//
//        print(Arrays.toString(arr));
//        print(Arrays.toString(arr1));
//
//        print(Arrays.equals(arr,arr1));
//
//        print(arr);
//        print(arr1);
       // print(Arrays.toString(abc.join("a")));

       // print(rotateArray(arr));
       // rotateArray(arr,4);
        //print(Arrays.toString(arr));

    }

    static void rotateArray(int [] arr,int k){
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);

    }

    static void reverseArray(int  [] arr,int stratIndex,int endIndex ){
        //for (int i=0;i<arr.length;i++){
            int start=stratIndex,end=endIndex;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        //}
    }







/*

                Deque<Integer> dq = new ArrayDeque<>();


                dq.addLast(10);
                dq.addLast(20);
                dq.addFirst(30);

                // Print deque elements
                for (int x : dq) System.out.print(x + " ");
                System.out.println();

                // Pop from front and back
                dq.removeFirst();
                dq.removeLast();

                // Print deque elements after pop
                for (int x : dq) System.out.print(x + " ");

*/


    static <T> void print(T x) {

        System.out.println(x);
    }

}





