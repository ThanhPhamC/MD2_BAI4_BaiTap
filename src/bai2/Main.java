package bai2;

public class Main {
    public static void main(String[] args) {
        int[] arr=new int[10000];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=(int) Math.random()*10000;
        }
        StopWatch sw=new StopWatch();
        sw.start();
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]>arr[i+1]){
                    int temp= arr[i];
                    arr[i]=arr[i+1] ;
                    arr[i+1]=temp;
                }
            }
        }
        sw.stop();
        System.out.println("Thoi gian troi qua : "+ sw.getElapsedTime() );
    }
}
