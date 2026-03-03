package chapter01;

public class ExThree {

    public static void main(String[] args) {

        // Thread kế thừa Thread
        ExOne t1 = new ExOne();
        t1.start();

        // Thread implement Runnable
        Thread t2 = new Thread(new ExTwo());
        t2.start();
    }
}