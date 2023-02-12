package week1;

public class MultiThread_before_java8 {
    public static void main(String[] args) {
        Runnable run1 = new MultiThread(1, 10);
        Runnable run2 = new MultiThread(2, 20);

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();
    }
}

class MultiThread implements Runnable {
    private static int start;
    private static int end;

    public MultiThread(){}
    public MultiThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
