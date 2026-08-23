package practiceoops.contract;

public interface IShape {
    void describeShape();
    void countSides();
    double calculateArea();
    default void shapeInfo(){
        printShapeInfo();
        countSidInfo();
        calculateAreaInfo();

    }

    private void printShapeInfo(){
        System.out.println("Define shape...");
    }
    private void countSidInfo(){
        System.out.println("Describe no. of sides...");
    }
    private void calculateAreaInfo(){
        System.out.println("Describe area amount...");
    }
}
