package restapi;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import kotlin.time.Clock;
import org.junit.jupiter.api.Test;

import java.awt.desktop.SystemEventListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.Loader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItem;

//import static RestAssured.RestServiceTest.response;

//import static RestAssured.RestServiceTest.response;

public class Driver extends BaseClass {

    public static void permutation(String str, String result) {

        // Base case
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        // Pick each character one by one
        for (int i = 0; i < str.length(); i++) {
            System.out.println("i value: "+i);
            System.out.println("------");


            char ch = str.charAt(i);
            System.out.println("startchar: "+ch);

            // Remove the selected character
            System.out.println("--"+str.substring(0, i));
            System.out.println("--"+str.substring(i + 1));
            String remaining = str.substring(0, i) + str.substring(i + 1);
            System.out.println("remaining:"+str.substring(i + 1));
            // Recursively build the result
            permutation(remaining, result + ch);
        }
    }


    public static void main(String args[]) throws IOException, InterruptedException {
        String str="I am a Java developer";

        int length=str.length();
        char [] arr=str.toCharArray();
        int left=0;
        int right=length-1;
        while(left<right){
            char temp=str.charAt(right);
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }



       /* String str = "ABC";

        permutation(str, "");
*/




        //t1.join();
       // t2.join();



        /*Write a java program to Move all zeroes to end of array?
            Input: arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
            Output: arr[] = {1, 2, 4, 3, 5, 0, 0, 0};*/
       /* int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        Map<Boolean, List<Integer>> result =
                Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.partitioningBy(n -> n == 0));

        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(result.get(false));
        finalList.addAll(result.get(true));

        System.out.println(finalList);*/
       /* PDDocument document = Loader.loadPDF(new File("/Users/pratik/Downloads/1784801158110.pdf"));
        PDFTextStripper stripper = new PDFTextStripper();
        String text = stripper.getText(document);

        Pattern pattern = Pattern.compile("Q\\..*?\\?", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(text);
        int counter =0;

        while (matcher.find()) {
            counter++;
            System.out.println(counter+""+matcher.group().replaceAll("\\s+", " ").trim());
        }*/
    }











        //
        //find the first non-repeated characters
         // swiss
       /* Map<Character, Integer> map = new LinkedHashMap<>();
        boolean found=false;
        String str = "swiss";

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.print("first repeated charater is "+entry.getKey());
                found=true;
                break;
            }
        }
        if(!found)
            System.out.print("No repeated charater found is ");*/



      /*  map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
        //
        String str1 = "swiss";

        Character result = str1.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst()
                .orElse(null);

        System.out.println(result);

       //System.out.println(map);





*/


       /* String downloadUrl = "https://jsonplaceholder.typicode.com/photos/1";

        // Execute GET request and extract response as byte array
        byte[] downloadedFileBytes = given()
                .when()
                .get(downloadUrl)
                .then()
                .statusCode(200)
                .extract()
                .asByteArray();

        // 1. Assert file size (must be greater than 0)
        //Assert.assertTrue(downloadedFileBytes.length > 0, "Downloaded file should not be empty");

        // 2. Save file locally (optional)
        File outputFile = new File("src/test/resources/downloaded_file.json");
        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            fos.write(downloadedFileBytes);
        }*/

        // Verify local file exists
      //  Assert.assertTrue(outputFile.exists(), "File was not saved successfully");





}
