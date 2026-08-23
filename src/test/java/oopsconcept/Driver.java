package oopsconcept;
import java.lang.reflect.Constructor;

public class Driver {

    public static void main(String[] args) {
      /*  Box box1=new Box();
        Box box2=new Box();*/









    }

    public static void checkMemory() {

        Runtime runtime = Runtime.getRuntime();

        // Run garbage collector to get a more accurate estimate of current used memory
        System.gc(); // Suggests a GC run, not guaranteed

        long maxMemory = runtime.maxMemory(); // Max memory the JVM can use (set by -Xmx flag)
        long totalMemory = runtime.totalMemory(); // Total memory currently allocated by the JVM from the OS
        long freeMemory = runtime.freeMemory(); // Free memory *within* the total allocated memory
        long usedMemory = totalMemory - freeMemory; // Memory currently in use by objects

        // Convert to megabytes for readability
        long usedMB = usedMemory / (1024L * 1024L);
        long totalMB = totalMemory / (1024L * 1024L);
        long maxMB = maxMemory / (1024L * 1024L);

        System.out.println("Used Memory: " + usedMB + " MB");
        System.out.println("Total Allocated Memory (JVM): " + totalMB + " MB");
        System.out.println("Max Available Memory (JVM): " + maxMB + " MB");
    }

    public static <T> void print(T str){
        System.out.println(str);
    }

}
