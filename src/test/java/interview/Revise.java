package interview;

import java.io.*;
import java.util.*;

public class Revise {
    String name;

    Revise(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("User: " + name);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
       /* Revise u = new Revise("Pratik");
        u.printName();*/
//ArrayLisy
        List<String> list = new ArrayList<>();
        list.add("API");
        list.add("UI");
        list.add("DB");

        for (String item : list) {
            //System.out.println(item);
        }
//Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Passed", 10);
        map.put("Failed", 2);

        for (String key : map.keySet()) {
           // System.out.println(key + " -> " + map.get(key));
        }

  //✅ Reverse a String

        String str = "Automation";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
            //System.out.println(rev);
        }

        //System.out.println(rev);
// ✅ Count Characters
        String str1 = "testautomation";
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 't') count++;
        }

        //System.out.println("Count: " + count);


        //FileReader file = new FileReader("src/test/java/interview/data1.txt");
        //FileInputStream input=new FileInputStream(file)

        File file = new File("src/test/java/interview/data1.txt");
        FileWriter myWriter = new FileWriter("filename.txt",false);

        try {
             myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();  // must close manually
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }









    }
}
