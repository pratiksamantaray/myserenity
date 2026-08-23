package oops;

public class MultiThread extends Thread {

    private int threadNumber=0;

    public MultiThread(int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override
    public void run(){
        for (int i=0;i<4;i++){
            System.out.println(i+" Thread started"+ " from thread "+ threadNumber);
            System.out.println(Thread.currentThread().getName() + " running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}