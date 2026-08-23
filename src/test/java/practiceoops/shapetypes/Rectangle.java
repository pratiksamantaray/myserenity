package practiceoops.shapetypes;

import practiceoops.contract.IShape;

public class Rectangle implements IShape {
    double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void describeShape() {
        System.out.println("It's quadrilateral shape..");
    }

    @Override
    public void countSides() {
        System.out.println("It has four sides....");
    }


    @Override
    public double calculateArea() {
        return length*width;
    }
}
