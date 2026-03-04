/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter02;

class NumberThread extends Thread {

    public NumberThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " - " + i);
        }
    }
}

public class bai2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            NumberThread t = new NumberThread("Thread-" + i);
            t.start();
        }
    }
}
