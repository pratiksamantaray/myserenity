package restapi;

public class MyThread extends Thread{
    String name;
    int num;
    String type;
    public void run(){
        for (int i=0;i<=num;i++){
             if(i%2==0&&type.equals("even")){
                 System.out.println("Thread " + name + " is running: " +i );
             }
            else  if(type.equals("odd") && i % 2 != 0){
                System.out.println("Thread " + name + " is running: " + i);
            }
        }

    }
    public MyThread(String name,int num,String type){
        this.name=name;
        this.num=num;
        this.type  =type;
    }
}
