package bai2;

public class Main {
    public static void main(String[] args) {
        StopWatch tinhTime=new StopWatch();
//       tinhTime.start();
        tinhTime.stop();
        System.out.println("Thoi gian troi qua : "+ tinhTime.getElapsedTime() );
    }
}
