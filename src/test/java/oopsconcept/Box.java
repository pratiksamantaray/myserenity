package oopsconcept;

  class Box {
    public double length;
    public double width;
    public double height;
    public static double area;

      public Box(){
          this(0,0,0);
      }

    Box(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

}
